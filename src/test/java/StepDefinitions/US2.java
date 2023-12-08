package StepDefinitions;

import Pages.HamburgerPage;
import Utilities.ConfigReader;
import Utilities.Hooks;
import Utilities.ReusableMethods;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class US2 extends Hooks {

    HamburgerPage hp = new HamburgerPage();

    @When("The user enters username and password")
    public void theUserEntersUsernameAndPassword() {
        androidDriver.findElement(hp.username).sendKeys((ConfigReader.getProperty("username")));
        androidDriver.findElement(hp.password).sendKeys((ConfigReader.getProperty("password")));
        androidDriver.findElement(hp.singIn).click();
    }
    @Then("The user should be able to see sign out button")
    public void theUserShouldBeAbleToSeeSignOutButton() {
        AndroidElement HamburgerButton = androidDriver.findElement(By.xpath("//android.widget.Button[@text='menu']"));
        HamburgerButton.click();
        androidDriver.findElement(hp.settingsButton).click();
        AndroidElement signOutButton = androidDriver.findElement(By.xpath("//android.widget.Button[@text=\"Sign out\"]"));
        Assert.assertTrue(signOutButton.isEnabled());
    }
}
