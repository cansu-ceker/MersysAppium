package StepDefinitions;

import Pages.HamburgerPage;
import Utilities.Hooks;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US8 extends Hooks {
    HamburgerPage hp = new HamburgerPage();

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

//        assert androidDriver.findElement(hp.homepage).equals("Home");
//        assert androidDriver.findElement(hp.attendance).equals("Attendance");
//        assert androidDriver.findElement(hp.sendButton).toString().contains("Attendance");
//        assert androidDriver.findElement(hp.excusesAssert).equals("UPDATE");


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Home\"]")));
        AndroidElement homepage2 = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Home\"]"));
        Assert.assertTrue(homepage2.getText().equals("Home"));


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"ATTENDANCE\"]")));
        AndroidElement attendance2 = androidDriver.findElement(By.xpath("//android.view.View[@content-desc=\"ATTENDANCE\"]"));
        Assert.assertTrue(attendance2.getText().equals("Attendance"));


//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text=\"UPDATE\"]")));
//        AndroidElement update2 = androidDriver.findElement(By.xpath("//android.widget.Button[@text=\"UPDATE\"]"));
//        Assert.assertTrue(update2.getText().equals("UPDATE"));


    }
    @And("Enter attendance click")
    public void enterAttendanceClick() {
        androidDriver.findElement(hp.attendance).click();
        androidDriver.findElement(hp.excuses).click();
        androidDriver.findElement(hp.addButton).click();
        androidDriver.findElement(hp.type).click();
        androidDriver.findElement(hp.typeFullDay).click();
        androidDriver.findElement(hp.message).click();
        androidDriver.findElement(hp.messageWrite).sendKeys("Hello Appium");
        androidDriver.findElement(hp.sendButton).click();

        AndroidElement okLogo = androidDriver.findElement(By.xpath("//android.widget.Button[@text=\"OK\"]"));
        okLogo.click();

        AndroidElement xLogo = androidDriver.findElement(By.xpath("//android.app.Dialog/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button"));
        xLogo.click();

        hp.staleElement(hp.backButton);

    }
}
