package Zdanie1.Steps;

import Zdanie1.Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class KupSteps {
    private WebDriver driver;

    private String itemName = "Hummingbird Printed Sweater";
    private String reference = null;
    private String total = null;

    private ItemPage itemPage;
    private MainPage mainPage2;
    private LogInPage logInPage2;
    private YourAccountPage yourAccountPage2;
    private SearchResultsPage searchResultsPage;
    private ShoppingCartPage shoppingCartPage;
    private OrderDetailsPage orderDetailsPage;
    private OrderConfirmationPage orderConfirmationPage;
    private OrderHistoryPage orderHistoryPage;

    @Given("2otwarcie strony prod kurs coderslab pl 2")
    public void openWebsite2() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver3.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/");
    }

    @And("2logowanie na stronie 2")
    public void logIn2() {
        mainPage2 = new MainPage(driver);
        mainPage2.clickSingIn();

        logInPage2 = new LogInPage(driver);
        logInPage2.fillEmail("pamot82633@u461.com");
        logInPage2.fillPassword("testss");
        logInPage2.clickSingIn();
    }

    @And("znalezienie Hummingbird Printed Sweater")
    public void findItem() {
        yourAccountPage2 = new YourAccountPage(driver);
        yourAccountPage2.search(itemName);
    }

    @When("wybranie do zakupu Hummingbird Printed Sweater")
    public void choseItem() {
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.choseItem(itemName);

        itemPage = new ItemPage(driver);
        Assert.assertTrue(itemPage.checkDiscunt(20));
    }

    @And("wybranie rozmiaru M")
    public void chiceSize() {
        //itemPage = new ItemPage(driver);
        itemPage.choseSize("M");
    }

    @And("wybranie 5 sztuk według parametru podanego w teście")
    public void choseQuantityOrder() {
        //itemPage = new ItemPage(driver);
        itemPage.choseQuantity("5");
    }

    @And("dodanie produkt do koszyka")
    public void addToCart() {
        //itemPage = new ItemPage(driver);
        itemPage.addItemsToCart();
    }

    @And("przejście do opcji - checkout")
    public void proceedToCheckout() {
        itemPage = new ItemPage(driver);
        itemPage.clickProceedToCheckout();

        shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickProceedToCheckout();
    }

    @And("potwierdzenie address")
    public void confirmAddress() {
        orderDetailsPage = new OrderDetailsPage(driver);
        orderDetailsPage.clickContinueButtonAddresses();
    }

    @And("wybieranie metody odbioru - PrestaShop pick up in store")
    public void choiseMethod() {
        orderDetailsPage = new OrderDetailsPage(driver);
        orderDetailsPage.choiceShippingMethod("PrestaShop");
        orderDetailsPage.clickContinueButtonShippingMethod();
    }

    @And("wybieranie opcję płatności - Pay by Check")
    public void choisePayment() {
        orderDetailsPage = new OrderDetailsPage(driver);
        orderDetailsPage.choicePaymentOtions("Pay by Check");
    }

    @And("kliknięcie na order with an obligation to pay")
    public void clickOrder() {
        orderDetailsPage = new OrderDetailsPage(driver);
        orderDetailsPage.clickOrderButton();
    }

    @Then("zrobienie screenshot z potwierdzeniem zamówienia i kwotą")
    public void printScreen() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\Testowanie\\CodersLab\\screenshot.png"));
    }

    @And("pobranie kwoty zamówienia")
    public void saveTotal() {
        orderConfirmationPage = new OrderConfirmationPage(driver);
        reference = orderConfirmationPage.getReference();
        total = orderConfirmationPage.getTotal();
    }

    @And("przejście do historii zamówień i detale")
    public void goToOrderHistoryAndDetalis() {
        orderConfirmationPage.clickAccountButton();

        yourAccountPage2 = new YourAccountPage(driver);
        yourAccountPage2.clickOrderHistoryAndDetalisButton();
    }

    @And("sprawdzenie statusu Awaiting check payment i kwoty zamówienia")
    public void checkStatusAndTotal() {
        orderHistoryPage = new OrderHistoryPage(driver);
        Assert.assertTrue(orderHistoryPage.checkOrder(reference,total));
    }

    @And("zamknięcie przeglądarki")
    public void closeWindow2() {
        driver.quit();
    }
}
