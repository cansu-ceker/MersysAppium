package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Hooks;

import javax.xml.xpath.XPath;

public class HamburgerPage extends Hooks {

    public HamburgerPage() {PageFactory.initElements(androidDriver, this);}


    public By allow = By.id("com.android.permissioncontroller:id/permission_allow_button");


   @FindBy(xpath="//android.widget.EditText[@resource-id=\"ion-input-0\"]")
   public WebElement username;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"ion-input-1\"]")
    public WebElement password;

    @FindBy(xpath="//android.widget.Button[@text=\"SIGN IN\"]")
    public WebElement signInButton;



}
