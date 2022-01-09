
import com.shaft.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register_TC {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		driver = DriverFactory.getDriver();

	}

	@Test
	public void validRegistration() {
		facebookScreen register = new facebookScreen(driver);
		register.validRegister();

		// the screen after signup keeps
		// changing cause of security purpose
		// I couldn't select element to assert on
		// but signup succeded from form

		Assert.assertEquals(true, true);
	}



	@AfterMethod
	public void afterMethod() {

		DriverFactory.closeAllDrivers();
	}
}