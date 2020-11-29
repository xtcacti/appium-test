package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicClass {
    AppiumDriver<MobileElement> driver;
    ExtentReports extent = null;
    ExtentTest test = null;

    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "cacti");
            cap.setCapability(MobileCapabilityType.UDID, "2NTDU20515017194");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
//            cap.setCapability("appPackage","com.huawei.calculator");
//            cap.setCapability("appActivity","com.huawei.calculator.Calculator");
            cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");

            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
            extent.attachReporter(spark);
            test = extent.createTest("Google Search");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(cap);
            test.info("set up driver");
        } catch (MalformedURLException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest(){
        System.out.println("inside sample test...");
    }

    @AfterTest
    public void teardown() {
        driver.close();
        driver.quit();
        test.pass("Entered text in SearchBox");

        extent.flush();
    }
}
