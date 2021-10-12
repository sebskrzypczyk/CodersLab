package Zdanie1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class YourAddressesPage {
    private static WebDriver driver;

    @FindBy(xpath = "//a[@data-link-action='add-address']")
    private WebElement createNewAddress;

    @FindBy(xpath = "//h4")
    private List<WebElement> adderessesNames;

    @FindBy(xpath = "//article[@role='alert']")
    private WebElement alert;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCreateNewAddress() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(createNewAddress));
        createNewAddress.click();
    }

    public void clickDeleteAddress(String alias) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(adderessesNames));
        By deleteButton = By.xpath("//div[./h4[contains(text(),'" + alias +
                "')]]/following-sibling::div/a[@data-link-action='delete-address']");
        driver.findElement(deleteButton).click();
    }

    public String getAlert() {
        return alert.getText();
    }

    public boolean checkAddress(String alias) {
        boolean resut = false;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(adderessesNames));
        for (WebElement address : adderessesNames) {
            //System.out.println(address.getText());
            if (address.getText().equals(alias)) {
                resut = true;
            }
        }
        return resut;
    }
}
