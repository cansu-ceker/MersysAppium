package StepDefinitions;
import Pages.HamburgerPage;
import Utilities.ConfigReader;
import Utilities.Hooks;
import Utilities.ReusableMethods;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;

public class US3 extends Hooks {

    HamburgerPage hp= new HamburgerPage();
    ReusableMethods rm = new ReusableMethods();

//    @Given("Navigate to campus")
//    public void navigateToCampus() {
//        androidDriver.findElement(hp.technoStudy).click();
//        androidDriver.findElement(hp.continueButton).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']")));
//        AndroidElement username3 = androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']"));
//        Assert.assertTrue(username3.isEnabled());
//    }

    @Then("The user should able to see the hamburger button")
    public void theUserShouldAbleToSeeTheHamburgerButton() {

        hp.staleElement(hp.backButton);
        AndroidElement HamburgerButton = androidDriver.findElement(By.xpath("//android.widget.Button[@text='menu']"));
        Assert.assertTrue(HamburgerButton.isEnabled());

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.courses).click();
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.assignments).click();
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.chatButton).click();
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.messages).click();
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.announcements).click();
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.settingsButton).click();
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.hamburgerButton).click();
        androidDriver.findElement(hp.gradingButton).click();
        hp.staleElement(hp.backButton);
    } }