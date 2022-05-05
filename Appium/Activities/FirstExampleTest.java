package examples;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstExampleTest {

    //Driver declaration
    AndroidDriver<MobileElement> driver;

    //setup method
    @BeforeClass
    public void setUp() throws MalformedURLException {

        //Desired Capabilities

        DesiredCapabilities  caps= new DesiredCapabilities();
        caps.setCapability("deviceId", "754290ab");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.miui.calculator");
        caps.setCapability("appActivity",".cal.CalculatorActivity");
        caps.setCapability("noReset","true");

        //Appium Server URL (get the appium server details from the Appium Inspector)
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver<>(serverURL, caps);

    }

    @Test
    public void addtionTest(){

        //Find button 3 and click it.
        driver.findElementById("btn_3_s").click();

        //Find plus and click it.
        driver.findElementById("btn_plus_s").click();

        //Find button 6 and click it.
        driver.findElementById("btn_6_s").click();

        //Find equal button and click it.
        driver.findElementByAccessibilityId("equals").click();

        //Find result and print it.
        String result= driver.findElementById("result").getText();
        System.out.println("result is: " + result);

        //Assertions
        Assert.assertEquals(result, "= 9");
        Assert.assertTrue(result.contains("9"));
    }

    @AfterClass
    public void tearDown(){
    driver.quit();
    }

}
