import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.JSONFileManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginScreen {
	WebDriver driver;
	JSONFileManager json= new JSONFileManager(System.getProperty("testDataFolderPath") + "JsonFile.json");

	By userName = By.id("email");
	By password = By.id("pass");
	By loginBtn = By.name("login");
	String url = "https://fb.com";

	public loginScreen(WebDriver driver) {

		this.driver = driver;

	}

	public void Login1() {

		driver.navigate().to(url);
		ElementActions.type(driver,userName,json.getTestData("username[0]"));
		ElementActions.type(driver,password,json.getTestData("password[0]"));
		driver.findElement(loginBtn).click();
	}

	public void Login2() {
		driver.navigate().to(url);
		ElementActions.type(driver,userName,json.getTestData("username[1]"));
		ElementActions.type(driver,password,json.getTestData("password[1]"));
		driver.findElement(loginBtn).click();
	}
	public void Login3() {
		driver.navigate().to(url);
		ElementActions.type(driver,userName,json.getTestData("username[2]"));
		ElementActions.type(driver,password,json.getTestData("password[2]"));
		driver.findElement(loginBtn).click();
	}
	public void Login4() {
		driver.navigate().to(url);
		ElementActions.type(driver,userName,json.getTestData("username[3]"));
		ElementActions.type(driver,password,json.getTestData("password[3]"));
		driver.findElement(loginBtn).click();
	}
	public void Login5() {
		driver.navigate().to(url);
		ElementActions.type(driver,userName,json.getTestData("username[4]"));
		ElementActions.type(driver,password,json.getTestData("password[4]"));
		driver.findElement(loginBtn).click();
	}

	public void Login6() {
		driver.navigate().to(url);
		ElementActions.type(driver,userName,json.getTestData("username[5]"));
		ElementActions.type(driver,password,json.getTestData("password[5]"));
		driver.findElement(loginBtn).click();
	}

}
