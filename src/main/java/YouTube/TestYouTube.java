package YouTube;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestYouTube {

    public static WebDriver driver= null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/jerinrinika/IdeaProjects/YouTube/browser-driver/mac/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSearchBarOption() throws InterruptedException {
        driver.findElement(By.name("search_query")).click();
        driver.findElement(By.name("search_query")).sendKeys("drake");
        driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        driver.findElement(By.name("search_query")).clear();
        driver.findElement(By.name("search_query")).click();
        driver.findElement(By.name("search_query")).sendKeys("Ariana Grande");
        driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click();
        Thread.sleep(5000);
    }

    @AfterMethod
    public  void cleanUp(){

    }

}
