import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.JSONFileManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebookScreen {
    WebDriver driver;
    JSONFileManager json = new JSONFileManager(System.getProperty("testDataFolderPath") + "JsonFileRegistration.json");

    By createAccount = By.xpath("//a[@data-testid= 'open-registration-form-button']");
    By firstName = By.xpath("//input[@name='firstname']");
    By surName = By.xpath("//input[@name='lastname']");
    By email = By.xpath("//input[@name='reg_email__']");
    By password = By.id("password_step_input");
    By confirmEmail = By.xpath("//input[@name='reg_email_confirmation__']");
    By sex = By.xpath("//input[@value='1']");
    By day = By.id("day");
    By month = By.id("month");
    By year = By.id("year");
    By signUp = By.xpath("//button[@name='websubmit']");
    String url = "https://fb.com";


    public facebookScreen(WebDriver driver) {

        this.driver = driver;

    }


    public void validRegister() {
        driver.navigate().to(url);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.presenceOfElementLocated(createAccount)).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
        ElementActions.type(driver, firstName, json.getTestData("inputFirstName"));

        driver.findElement(surName);
        ElementActions.type(driver, surName, json.getTestData("inputSurName"));

        driver.findElement(email);
        ElementActions.type(driver, email, json.getTestData("inputEmail"));


        driver.findElement(password);
        ElementActions.type(driver, password, json.getTestData("inputPassword"));

        driver.findElement(confirmEmail);
        ElementActions.type(driver, confirmEmail, json.getTestData("inputEmail"));

        driver.findElement(day).click();
        driver.findElement(month).click();
        Select dropd = new Select(driver.findElement(year));
        dropd.selectByIndex(13);
        driver.findElement(sex).click();
        driver.findElement(signUp).click();

    }


}
