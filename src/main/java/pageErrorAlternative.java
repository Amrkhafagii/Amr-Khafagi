import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageErrorAlternative {
    WebDriver driver;
    By validationError = By.className("_9ay7");


    public pageErrorAlternative(WebDriver driver) {

        this.driver = driver;

    }



    public String getText() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(validationError));
        String welcomePhrase= driver.findElement(validationError).getText();
        return welcomePhrase;


    }
}
