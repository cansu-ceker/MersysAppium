package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import Utilities.Hooks;

public class ModulsPage extends Hooks {


    public ModulsPage() {PageFactory.initElements(androidDriver, this);}

    public By abc = By.id("com.android.permissioncontroller:id/permission_allow_button");



















}
