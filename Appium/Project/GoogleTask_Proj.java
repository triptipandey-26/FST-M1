package liveProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleTask_Proj {

    //Driver declaration
    AndroidDriver<MobileElement> driver;

    //setup method
    @BeforeClass
    public void setUp() throws MalformedURLException {

        //Desired Capabilities

        DesiredCapabilities caps= new DesiredCapabilities();
        caps.setCapability("deviceId", "754290ab");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.google.android.apps.tasks");
        caps.setCapability("appActivity",".ui.TaskListsActivity");
        caps.setCapability("noReset","true");

        //Appium Server URL (get the appium server details from the Appium Inspector)
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver<>(serverURL, caps);

    }

    @Test
    public void addTask(){

        String data[]=new String[]{"Complete Activity with Google Tasks","Complete Activity with Google Keep","Complete the second Activity Google Keep"};


        for(int i=0;i<=2; i++){

            //Click on Plus button
            driver.findElementById("tasks_fab").click();

            //Enter the Tasks
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //Enter the task name
            driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText").sendKeys(data[i]);
            //Find Save button and click it.
            driver.findElementById("add_task_done").click();

        }

        /*//Click on Plus button
        driver.findElementById("tasks_fab").click();

        //Enter the Tasks
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       // driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Tasks");
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText").sendKeys("Complete Activity with Google Tasks");
        //Find Save button and click it.
        driver.findElementById("add_task_done").click();

        //Click on Plus button
        driver.findElementById("tasks_fab").click();

        //Enter the Tasks
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText").sendKeys("Complete Activity with Google Tasks");
        //Find Save button and click it.
        driver.findElementById("add_task_done").click();

        //Click on Plus button
        driver.findElementById("tasks_fab").click();

        //Enter the Tasks
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText").sendKeys("Complete the second Activity Google Keep");
        //Find Save button and click it.
        driver.findElementById("add_task_done").click();*/

     /*   String xpath[]=new String[]{"//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView","(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"])[1]","(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"])[2]"};

        for(int j=0;j<=2; j++){

            //Find result1 and print it.
            String result= driver.findElementByXPath(xpath[j]).getText();
            System.out.println("result is: " + result);

            //Assertions
            Assert.assertEquals(result, data[2-j]);
            Assert.assertTrue(result.contains(data[2-j]));

        }*/


        /*//Find result1 and print it.
        String result1= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println("result is: " + result1);

        //Assertions
        Assert.assertEquals(result1, "Complete the second Activity Google Keep");
        Assert.assertTrue(result1.contains("Complete the second Activity Google Keep"));

        //Find result2 and print it.
        String result2= driver.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"])[1]/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println("result is: " + result2);

        //Assertions
        Assert.assertEquals(result2, "Complete Activity with Google Tasks");
        Assert.assertTrue(result2.contains("Complete Activity with Google Tasks"));

        //Find result3 and print it.
        String result3= driver.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"])[2]/android.view.ViewGroup/android.widget.TextView").getText();
        System.out.println("result is: " + result3);

        //Assertions
        Assert.assertEquals(result3, "Complete Activity with Google Tasks");
        Assert.assertTrue(result3.contains("Complete Activity with Google Tasks"));*/

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<MobileElement> tasks= driver.findElementsById("task_name");

        String result1= tasks.get(0).getText();
        System.out.println(result1);
        Assert.assertEquals(result1, "Complete Activity with Google Tasks");
        Assert.assertTrue(result1.contains("Complete Activity with Google Tasks"));

        String result2= tasks.get(1).getText();
        System.out.println(result2);
        Assert.assertEquals(result2, "Complete Activity with Google Tasks");
        Assert.assertTrue(result2.contains("Complete Activity with Google Tasks"));

        String result3= tasks.get(2).getText();
        System.out.println(result3);
        Assert.assertEquals(result3, "Complete Activity with Google Tasks");
        Assert.assertTrue(result3.contains("Complete Activity with Google Tasks"));


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
