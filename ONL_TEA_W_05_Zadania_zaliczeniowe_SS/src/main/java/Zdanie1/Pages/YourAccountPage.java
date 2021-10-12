package Zdanie1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourAccountPage {
    private static WebDriver driver;

//    @FindBy (id = "address-link")
//    private WebElement addAdress;

    @FindBy (id = "addresses-link")
    private WebElement adressesButtom;

    @FindBy (xpath = "//input[@aria-label='Search']")
    private WebElement searchField;

    @FindBy (id = "history-link")
    private WebElement orderHistoryAndDetalisButton;

    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdressesButtom() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(adressesButtom));
        adressesButtom.click();
    }

    public void search(String find) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(find);
        searchField.submit();
    }

    public void clickOrderHistoryAndDetalisButton() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(orderHistoryAndDetalisButton));
        orderHistoryAndDetalisButton.click();
    }
}
