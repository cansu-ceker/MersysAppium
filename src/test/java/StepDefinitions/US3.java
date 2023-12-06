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
import org.testng.Assert;

import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;

public class US3 extends Hooks {

    HamburgerPage hp= new HamburgerPage();
    ReusableMethods rs = new ReusableMethods();


    @Given("Navigate to campus app and click on the demo button")
    public void navigateToCampusAppAndClickOnTheDemoButton() {
        setUp();

        List<AndroidElement> tsButton = androidDriver.findElements(By.xpath("//android.widget.Button[@text='Techno Study']"));
        if (tsButton.size() > 0) {
            tsButton.get(0).click();
            rs.waitFor(2);
            androidDriver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']")).click();
            rs.waitFor(2);
        }
    }

    @When("The user enters username and password")
    public void theUserEntersUsernameAndPassword() {

        androidDriver.findElement(hp.username).sendKeys((ConfigReader.getProperty("username")));
        androidDriver.findElement(hp.password).sendKeys((ConfigReader.getProperty("password")));
        androidDriver.findElement(hp.singIn).click();
    }

    @Then("The user should able to see hamburger button")
    public void theUserShouldAbleToSeeHamburgerButton() {
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

    }
}



