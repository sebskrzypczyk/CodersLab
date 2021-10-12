package Zdanie1.Steps;

import Zdanie1.Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class DodanieAdresuSteps {

    private WebDriver driver;

    private YourAccountPage yourAccountPage;
    private YourAddressesPage yourAddressesPage;
    private NewAddressPage newAddressPage;

    @Given("otwarcie strony prod kurs coderslab pl")
    public void openWebsite() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver3.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/");
    }

    @And("logowanie na stronie")
    public void logIn() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSingIn();

        LogInPage logInPage = new LogInPage(driver);
        logInPage.fillEmail("pamot82633@u461.com");
        logInPage.fillPassword("testss");
        logInPage.clickSingIn();
    }

    @When("wejście klikając w kafelek Addresses po zalogowaniu")
    public void clickAddresses() {
        yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAdressesButtom();
    }

    @And("kliknicie w Create new address")
    public void clickAddAddresses() {
        yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.clickCreateNewAddress();
    }

    @And("wypełnienie formularzu New address (.*), (.*), (.*), (.*), (.*), (.*)")
    public void fillForm(String alias, String adress, String city, String postcode, String country, String phone) {
        newAddressPage = new NewAddressPage(driver);
        newAddressPage.fillAliasField(alias);
        newAddressPage.fillAddressField(adress);
        newAddressPage.fillCityField(city);
        newAddressPage.fillPostcodeField(postcode);
        newAddressPage.fillCountryField(country);
        newAddressPage.fillPhoneField(phone);
        newAddressPage.clickSaveButton();
    }

    @Then("adres (.*) dodany")
    public void addressAdded(String alias) {
        yourAddressesPage = new YourAddressesPage(driver);
        assertEquals("Address successfully added!", yourAddressesPage.getAlert());
        assertTrue(yourAddressesPage.checkAddress(alias));
    }

    @And("kliknicie w Delete adresu (.*)")
    public void clickDeleteAddress(String alias) {
        //yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.clickDeleteAddress(alias);
    }

    @And("adres (.*) usunięty")
    public void addressDeleted(String alias) {
        yourAddressesPage = new YourAddressesPage(driver);
        assertEquals("Address successfully deleted!", yourAddressesPage.getAlert());
        assertFalse(yourAddressesPage.checkAddress(alias));
    }

    @And("zamknięcie okna przeglądarki")
    public void closeWindow() {
        driver.quit();
    }
}

