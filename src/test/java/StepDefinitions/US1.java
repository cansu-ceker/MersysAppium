package StepDefinitions;
import Pages.ModulsPage;
import Pages.HamburgerPage;
import Utilities.ConfigReader;
import Utilities.Hooks;
import io.appium.java_client.android.AndroidTouchAction;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.appium.java_client.touch.offset.PointOption.point;

public class US1 extends Hooks {

    ModulsPage mp=new ModulsPage();
    HamburgerPage hp= new HamburgerPage();
    WebDriverWait wait = new WebDriverWait(androidDriver, 10);


    @Given("user clicks allow button")
    public void user_clicks_allow_button() throws InterruptedException {
       setUp();
       Thread.sleep(5000);
       androidDriver.findElement(By.xpath("//android.widget.Button[@text=\"Techno Study\"]")).click();
        Thread.sleep(5000);
        androidDriver.findElement(By.xpath("//android.widget.Button[@text=\"CONTINUE\"]")).click();
        Thread.sleep(5000);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(hp.username));
//        hp.username.sendKeys(ConfigReader.getProperty("username"));
//        hp.password.sendKeys(ConfigReader.getProperty("password"));
//        hp.signInButton.click();





//        androidDriver.findElement(hp.username).sendKeys(ConfigReader.getProperty("username"));
//        androidDriver.findElement(hp.password).sendKeys(ConfigReader.getProperty("password"));
//        androidDriver.findElement(hp.continueButton).click();

    }



}


