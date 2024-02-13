package testauto.exp1;

import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcTest {
    WebDriver driver;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "D:/tools/chromedriver-win64/chromedriver-win64");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
