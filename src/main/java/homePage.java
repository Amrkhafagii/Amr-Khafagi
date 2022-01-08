import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    WebDriver driver;
    By welcome = By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/span");


    public homePage(WebDriver driver) {

        this.driver = driver;

    }



    public String getText() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(welcome));
        String welcomePhrase= driver.findElement(welcome).getText();
        return welcomePhrase;


    }
}
