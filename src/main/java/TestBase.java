import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public AppiumDriver<WebElement> driver;
    public SimpleCalculatorPage simple = new SimpleCalculatorPage();
    public AdvCalPage advanced = new AdvCalPage();

    @Before
    public void setUp() throws Exception {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "nexus");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        capabilities.setCapability("platformVersion", "7.0");

        driver = new AndroidDriver<>(url, capabilities);

        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), simple);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), advanced);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}