package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");

        Thread.sleep(5000);

        //Using ID link
        driver.findElement(By.id("about-link"));

        //Using className
        driver.findElement(By.className("green"));

        //css selector
        driver.findElement(By.cssSelector("a#about-link"));


        // Close the browser
        driver.close();
    }

}

