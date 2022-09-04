package utilits;

import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class AllureService {

    @Attachment(value = "screenshot", type = "image/png")
    public byte[] takeScreenshot(WebDriver driver) {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        return screenshot.getScreenshotAs(OutputType.BYTES);

    }

}
