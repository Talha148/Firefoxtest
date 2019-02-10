package tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("Tester148p@gmail.com");
        driver.findElement(By.className("CwaK9")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("pakistan148");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("aic")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("vO")).sendKeys("testj123s@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("aoT")).sendKeys("This is a test");
        Thread.sleep(2000);
        driver.findElement(By.className("Am")).sendKeys("How are you today");
        driver.findElement(By.className("aoO")).click();

        Thread.sleep(2000);

        driver.findElement(By.className("gbii")).click();
        driver.findElement(By.id("gb_71")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
