package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class YourAddressesPage {
    private static WebDriver driver;

    @FindBy (css = "[data-link-action=\"add-address\"]")
    private WebElement createNewAddress;

    @FindBy(css = "<h4>")
    private List<WebElement> myAdderesses;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCreateNewAddress() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(createNewAddress));
        createNewAddress.click();
    }

    public boolean checkAddress(String alias) {
        // Jeśli nie wiemy czy element istnieje i chcemy to sprawdzić możemy to zrobić listą.
        // foundElements będzie listą wynikową zawierającą tylko pasujące do wyszukiwania elementy.
//        List<WebElement> foundElements = new ArrayList<>();

        // Jeśli na liście elementów addressNames jest adres z nazwą jakiej szukamy, to do foundElement dodajemy ten element.
//        for (WebElement address : myAdderesses) {
//            System.out.println(address.getText());
//            if (address.getText().equals(alias)) {
//                return true;
//                break;
//            } return false;
//        }

        System.out.println(myAdderesses);
        return false;
    }
}
