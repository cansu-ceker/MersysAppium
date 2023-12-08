package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Hooks;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class HamburgerPage extends Hooks {

    public HamburgerPage() {PageFactory.initElements(androidDriver, this);}

    public By editAccount = By.xpath("//android.widget.Button[@text='Edit Account']");
    public By backButton = By.xpath("//android.widget.Button[@text='back']");
    public By switchSchool = By.xpath("//android.widget.TextView[@text='Switch School']");
    public By changePassword = By.xpath("//android.widget.TextView[@text='Change Password']");
    public By notification = By.xpath("//android.widget.TextView[@text='Notification']");
    public By language = By.xpath("//android.widget.TextView[@text='Language']");
    public By settingsButton=By.xpath("//android.widget.TextView[@text='Settings']");
    public By hamburgerButton=By.xpath("//android.widget.Button[@text='menu']");
    public By courses=By.xpath("//android.widget.TextView[@text='Courses']");   // hamburger altındakıler
    public By assignments=By.xpath("//android.widget.TextView[@text='Assignments']");
    public By chatButton=By.xpath("//android.widget.TextView[@text='Chat']");
    public By messages=By.xpath("//android.widget.TextView[@text='Messages']");
    public By announcements=By.xpath("//android.widget.TextView[@text='Announcements']");
    public By gradingButton=By.xpath("//android.widget.TextView[@text='Grading']");
    public By username=By.xpath("//android.widget.EditText[@resource-id='ion-input-0']");
    public By password=By.xpath("//android.widget.EditText[@resource-id='ion-input-1']");
    public By singIn=By.xpath("//android.widget.Button[@text='SIGN IN']");

    // cansu

    public By continueButton = By.xpath("//android.widget.Button[@text='CONTINUE']");

    public By technoStudy = By.xpath("//android.widget.Button[@text=\"Techno Study\"]");
//   public By username = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-0\"]");
//    public By password = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-1\"]");
//    public By hamburgerButton = By.xpath("//android.widget.Button[@text=\"menu\"]");
//    public By settingsButton = By.xpath("//android.widget.TextView[@text=\"Settings\"]");
    public By signOutButton = By.xpath("//android.widget.Button[@text=\"Sign out\"]");


    public By calendarButton = By.xpath("//android.widget.TextView[@text=\"CALENDAR\"]");    // anamenunın altındakıler
    public By coursesButton = By.xpath("//android.widget.TextView[@text=\"COURSES\"]");
    public By grading = By.xpath("//android.widget.TextView[@text=\"GRADING\"]");
    public By attendanceButton = By.xpath("//android.widget.TextView[@text=\"ATTENDANCE\"]");
    public By assignmentsButton = By.xpath("//android.widget.TextView[@text=\"ASSIGNMENTS\"]");
    public By financeButton = By.xpath("//android.widget.TextView[@text=\"MY FINANCE\"]");
    public By messagesButton = By.xpath("//android.widget.TextView[@text=\"MESSAGES\"]");
    public By announcementsButton = By.xpath("//android.widget.TextView[@text=\"ANNOUNCEMENTS\"]");
    public By chat = By.xpath("//android.widget.TextView[@text=\"CHAT\"]");


// samet

    public By homepage=By.xpath("//android.widget.TextView[@text=\"Home\"]");
    public By attendance=By.xpath("//android.view.View[@content-desc=\"ATTENDANCE\"]");
    public By pageAttendance=By.xpath("(//android.widget.TextView[@text=\"Attendance\"])[1]");
    public By excuses=By.xpath("//android.view.View[@text=\"EXCUSES\"]");
    public By addButton=By.xpath("//android.view.View[@resource-id=\"main-content\"]" +
            "/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/" +
            "android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button");
    public By type=By.xpath("//android.view.View[@resource-id=\"ion-sel-0\"]");
    public By typeFullDay=By.xpath("//android.widget.RadioGroup/android.view.View[2]/" +
            "android.view.View/android.view.View/android.widget.TextView");
    public By date=By.xpath("//android.widget.Button[@text=\"Date* Dec 7, 2023\"]");
    public By getDate=By.xpath("//android.widget.Button[@text=\"Show year picker\"]");
    public By dateYear=By.xpath("//android.widget.Button[@text=\"2023\"]");
    public By dateMonth=By.xpath("//android.widget.Button[@text=\"February\"]");
    public By dateDay=By.xpath("//android.widget.Button[@text=\"Friday, February 24\"]");
    public By message=By.xpath("//android.widget.TextView[@text=\"Message*\"]");
    public By messageWrite=By.xpath("//android.widget.EditText[@resource-id=\"ion-textarea-0\"]");
    public By sendButton=By.xpath("//android.widget.Button[@text=\"SEND\"]");
    public By excusesHistory=By.xpath("//android.view.View[@text=\"Full Day Sent\"]");
    public By excusesAssert=By.xpath("//android.widget.Button[@text=\"UPDATE\"]");


    // ümit
    public By firstNotification=By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]");
    public By live=By.xpath("//android.widget.Button[@text=\"Live\"]");
    public By demo=By.xpath("//android.widget.Button[@text=\"Demo\"]");
    public By test=By.xpath("//android.widget.Button[@text=\"Test\"]");
    public By switchPlatformButton=By.xpath("//android.widget.TextView[@text=\"Switch Platform\"]");


// ihsan

    public By accountLogo= By.xpath("//android.widget.TextView[@text=Account]");
    public By schoolLogo= By.xpath("//android.widget.TextView[@text=School]");
    public By changePasswordLogo= By.xpath("//android.widget.TextView[@text=Change Password]");
    public By notificationLogo= By.xpath("//android.widget.TextView[@text=Notification]");
    public By languageLogo= By.xpath("//android.widget.TextView[@text=Language]");
    public By settingOptions = By.xpath("//android.widget.ListView");





    public void staleElement(By element) {
        WebDriverWait wait=new WebDriverWait(androidDriver,10);
        WebElement ElementBackButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='back']")));
        ElementBackButton.click();
    }

}
