/*
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSeleniumTest {

     WebDriver driver = null;
        @Before
        public void setup() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/opt/Boomi/LeetCode-Solutions/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://amazon.com");
        }
        @Test
        public void testSearch() throws InterruptedException {
            WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));
            WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
            Assert.assertTrue(textBox.isDisplayed());
            Assert.assertTrue(searchButton.isDisplayed());
            textBox.sendKeys("pen");
            searchButton.click();
            WebElement resultGrid = driver.findElement(By.className("s-main-slot"));
            List<WebElement> searchResults = driver.findElements(By.cssSelector("h2.a-size-mini>a"));
            Assert.assertTrue(resultGrid.isDisplayed());
            String product = searchResults.get(0).getText();
            searchResults.get(0).click();
            Thread.sleep(1000);
            WebElement productTitle = driver.findElement(By.id("productTitle"));
            productTitle.isDisplayed();
            Assert.assertEquals(productTitle.getText(),product);
            driver.quit();
        }
    }


*/
