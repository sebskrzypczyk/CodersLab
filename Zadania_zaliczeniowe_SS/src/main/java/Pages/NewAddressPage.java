package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAddressPage {
    private static WebDriver driver;

    @FindBy(name = "alias")
    private WebElement aliasField;

    @FindBy (name = "address1")
    private WebElement addressField;

    @FindBy (name = "city")
    private WebElement cityField;

    @FindBy (name = "postcode")
    private WebElement postcodeField;

    @FindBy (css = "button[class=\"btn btn-primary float-xs-right\"]")
    private WebElement saveButtom;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillAliasField(String alias) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(aliasField));
        aliasField.sendKeys(alias);
    }
    public void fillAddressField(String address) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(addressField));
        addressField.sendKeys(address);
    }
    public void fillCityField(String city) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(cityField));
        addressField.sendKeys(city);
    }
    public void fillPostcodeField(String postcode) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(postcodeField));
        addressField.sendKeys(postcode);
    }
    public void clickSaveButton() {
        saveButtom.click();
    }
}
