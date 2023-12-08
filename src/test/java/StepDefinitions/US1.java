package StepDefinitions;

import Pages.HamburgerPage;
import Utilities.Hooks;
import Utilities.ReusableMethods;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US1 extends Hooks {
    HamburgerPage hp = new HamburgerPage();
    ReusableMethods rm = new ReusableMethods();

    @Given("User initiates application and selects allow notification by clicking it")
    public void userInitiatesApplicationAndSelectsAllowNotificationByClickingIt() throws AWTException {
        setUp();
        Robot robot = new Robot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
        androidDriver.findElements(By.id("com.android.permissioncontroller:id/permission_allow_button"));

        //List<AndroidElement> allowNotification = androidDriver.findElements(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        //if (allowNotification.size() > 0) {
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            rm.waitFor(1);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        rm.waitFor(1);
        //}
    }
    @Then("User sees Select Platform text")
    public void userSeesSelectPlatformText() {
        AndroidElement selectPlatformText = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Select Platform\"]"));
        Assert.assertTrue(selectPlatformText.isEnabled());
    }

    @When("User selects one of the platforms")
    public void userSelectsOneOfThePlatforms() {
        androidDriver.findElement(hp.live).click();
        androidDriver.findElement(hp.continueButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']")));
        AndroidElement username = androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']"));
        Assert.assertTrue(username.isEnabled());
        androidDriver.findElement(hp.switchPlatformButton).click();

        androidDriver.findElement(hp.demo).click();
        androidDriver.findElement(hp.continueButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']")));
        AndroidElement username1 = androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']"));
        Assert.assertTrue(username1.isEnabled());
        androidDriver.findElement(hp.switchPlatformButton).click();

        androidDriver.findElement(hp.test).click();
        androidDriver.findElement(hp.continueButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']")));
        AndroidElement username2 = androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']"));
        Assert.assertTrue(username2.isEnabled());
        androidDriver.findElement(hp.switchPlatformButton).click();

        androidDriver.findElement(hp.technoStudy).click();
        androidDriver.findElement(hp.continueButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']")));
        AndroidElement username3 = androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='ion-input-0']"));
        Assert.assertTrue(username3.isEnabled());
    }

    @Then("User sees Login to Campus text")
    public void userSeesLoginToCampusText() {
        AndroidElement loginToCampusText = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Login to Campus\"]"));
        Assert.assertTrue(loginToCampusText.isEnabled());
    }


}
