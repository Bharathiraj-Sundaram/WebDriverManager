import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle() +">>>>>>>>"+driver.getCurrentUrl());
        System.out.println("HI this is a maven Project");
        driver.quit();

    }
}
