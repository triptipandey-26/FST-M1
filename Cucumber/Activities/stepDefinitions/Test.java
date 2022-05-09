package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Test extends BaseClass {

    @Given("^User is on the TS homepage$")
    public void openTSHome() {
        driver.get("http://training-support.net");
    }

    @When("^User clicks on the About Us page$")
    public void clickAboutUsButton() {
        driver.findElement(By.id("about-link")).click();
    }

    @Then("^User is taken to About us page$")
    public void aboutUsPageVerification() {

        String AboutUsPageTitle = driver.findElement(By.xpath("//h1[@class='ui header']")).getText();
        Assert.assertEquals("About Us", AboutUsPageTitle);
    }
}
