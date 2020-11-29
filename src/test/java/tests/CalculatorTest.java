package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            System.out.println(e.getCause());;
            System.out.println(e.getMessage());;
            e.printStackTrace();
        }
    }

    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","cacti");
        cap.setCapability("udid","2NTDU20515017194");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","10");
        cap.setCapability("appPackage","com.huawei.calculator");
        cap.setCapability("appActivity","com.huawei.calculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(cap);
        System.out.println("Application start...");

        MobileElement two = driver.findElement(By.id("com.huawei.calculator:id/digit_2"));
        MobileElement plus = driver.findElement(By.id("com.huawei.calculator:id/op_add"));
        MobileElement three = driver.findElement(By.id("com.huawei.calculator:id/digit_3"));
        MobileElement equals = driver.findElement(By.id("com.huawei.calculator:id/eq"));
        MobileElement result = driver.findElement(By.className("android.widget.EditText"));

        two.click();
        plus.click();
        three.click();
        equals.click();

        String resultText = result.getText();
        System.out.println(resultText);
        System.out.println("Completed...");
    }

}
