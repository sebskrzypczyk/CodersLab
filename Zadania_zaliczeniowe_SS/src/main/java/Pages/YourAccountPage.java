package Pages;

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

    @FindBy(id = "addresses-link")
    private WebElement adressesButtom;

    @FindBy (className = "page-header")
    private WebElement header;

    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdressesButtom() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(header));

//        if (ExpectedConditions.elementToBeClickable(addAdress)) {
//            addAdress.click();
//        } else {
//            addAdresses.click();
//        }

        adressesButtom.click();

    }
}
