
import com.shaft.driver.DriverFactory;
import com.shaft.tools.io.JSONFileManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login_TC {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		driver = DriverFactory.getDriver();

	}

	@Test
	public void validLoginUserPass() {
		loginScreen login = new loginScreen(driver);
		login.Login1();
		homePage home = new homePage(driver);
		Assert.assertEquals(home.getText().contains("Welcome to Facebook, amr"), true);
	}


	@Test
	public void emptyLoginUserRightPass() {
		loginScreen login = new loginScreen(driver);
		login.Login2();
		pageErrorAlternative home = new pageErrorAlternative(driver);
		Assert.assertEquals(home.getText().contains("Find your account and log in."), true);

	}
	@Test
	public void inValidLoginUserRightpass() {
		loginScreen login = new loginScreen(driver);
		login.Login3();
		pageErrorAlternative home = new pageErrorAlternative(driver);
		Assert.assertEquals(home.getText().contains("Find your account and log in."), true);

	}
	@Test
	public void ValidLoginUserWrongPass() {
		loginScreen login = new loginScreen(driver);
		login.Login4();
		pageErrorAlternative home = new pageErrorAlternative(driver);
		Assert.assertEquals(home.getText().contains("The password that you've entered is incorrect."), true);

	}

	@Test
	public void ValidLoginUserEmptyPass() {
		loginScreen login = new loginScreen(driver);
		login.Login5();
		pageErrorAlternative home = new pageErrorAlternative(driver);
		Assert.assertEquals(home.getText().contains("The password that you've entered is incorrect."), true);

	}

	@Test
	public void inValidLoginUserPass() {
		loginScreen login = new loginScreen(driver);
		login.Login6();
		pageErrorAlternative home = new pageErrorAlternative(driver);
		Assert.assertEquals(home.getText().contains("Find your account and log in."), true);

	}



	@AfterMethod
	public void afterMethod() {

		DriverFactory.closeAllDrivers();
	}
}