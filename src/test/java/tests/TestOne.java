package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestOne extends BasicClass{
    @Test
    public void testOne(){
        driver.get("https://google.com");
        test.pass("Navigated to google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        test.pass("Enterd text in SearchBox");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test.pass("Pressed enter key");
        System.out.println("Completed...");
    }
}
