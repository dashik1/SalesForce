package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    private static final String TEXT_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::label//following-sibling::textarea";
    private String labelText;
    private WebDriver driver;

    public TextArea(WebDriver driver, String labelText) {
        this.labelText = labelText;
        this.driver = driver;
    }

    public void inputTextArea(String text) {
        String finalXpath = String.format(TEXT_XPATH, labelText);
        driver.findElement(By.xpath(finalXpath)).sendKeys(text);
    }




}
