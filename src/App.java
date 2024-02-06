import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    @Test
    public void openWebsite() {
        // Specify the path to your chromedriver
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");

        // Initialize a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.upes.ac.in//");

        // Check the title of the page
        Assert.assertTrue(driver.getTitle().contains("UPES"));

        // Close the browser
        // driver.quit();
    }
}