package StepDefinitions;

import Pages.HamburgerPage;
import Utilities.Hooks;
import Utilities.ReusableMethods;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
public class US7 extends Hooks {
    HamburgerPage hp= new HamburgerPage();
    ReusableMethods rs = new ReusableMethods();

    private WebDriverWait wait;


    @Given("the user is logged in")
    public void theUserIsLoggedIn() {

//        wait.until(ExpectedConditions.visibilityOfElementLocated(hp.hamburgerButton));
//        wait.until(ExpectedConditions.elementToBeClickable(hp.hamburgerButton));

        androidDriver.findElement(hp.hamburgerButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(hp.settingsButton));
        wait.until(ExpectedConditions.elementToBeClickable(hp.settingsButton));

        assert androidDriver.findElement(hp.settingsButton).isEnabled();
        androidDriver.findElement(hp.settingsButton).click();
    }
    @When("the user navigate to the Setting page")
    public void theUserNavigateToTheSettingPage() throws InterruptedException {
        if (!isOnSettingsPage()) {

            Thread.sleep(2000);
        }
    }
    private boolean isLoggedIn() {
        return androidDriver.findElements(hp.singIn).isEmpty();
    }

    private boolean isOnSettingsPage() {
        return !androidDriver.findElements(hp.editAccount).isEmpty();
    }

    private boolean isNavigatedToApp() {
        return !androidDriver.findElements(hp.username).isEmpty();

    }


    @Then("they should see the following options in the Setting menu:")
    public void theyShouldSeeTheFollowingOptionsInTheSettingMenu(List<String> optionsTable) {

        List<AndroidElement> listViewElements = androidDriver.findElements(hp.settingOptions);

        wait = new WebDriverWait(androidDriver, 20);

        for (AndroidElement element : listViewElements) {
            assert element.isDisplayed();
        }
    }
    @When("they click on the link")
    public void theyClickOnTheLink() {

        androidDriver.findElement(hp.editAccount).click();
   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Account\"]")));
   AndroidElement accountLogo = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Account\"]"));
        Assert.assertTrue(accountLogo.isDisplayed());
        hp.staleElement(hp.backButton);

        androidDriver.findElement(hp.switchSchool).click();
   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text=\"School\"]")));
   AndroidElement schoolLogo = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"School\"]"));
        Assert.assertTrue(schoolLogo.isDisplayed());
        hp.staleElement(hp.backButton);


        androidDriver.findElement(hp.changePassword).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Change Password\"]")));
   AndroidElement changePasswordLogo = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Change Password\"]"));
        Assert.assertTrue(changePasswordLogo.isDisplayed());
        hp.staleElement(hp.backButton);



        androidDriver.findElement(hp.notification).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Notification\"]")));
   AndroidElement notificationLogo = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Notification\"]"));
        Assert.assertTrue(notificationLogo.isDisplayed());
        hp.staleElement(hp.backButton);



        androidDriver.findElement(hp.language).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Language\"]")));
   AndroidElement languageLogo = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Language\"]"));
        Assert.assertTrue(languageLogo.isDisplayed());
        hp.staleElement(hp.backButton);
        hp.staleElement(hp.backButton);

    }

}
