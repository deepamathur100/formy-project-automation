import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Users/dmathur/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radio1=driver.findElement(By.id("radio-button-1"));
        radio1.click();

        WebElement radio2=driver.findElement(By.cssSelector("input[value='option2']"));
        radio2.click();

        WebElement radio3=driver.findElement(By.cssSelector("input[value='option3']));
        radio3.click();
        driver.quit();
    }
}
