package Steps;

import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zadanie1Steps {
    private WebDriver driver;

    @Given("otwarcie strony prod kurs coderslab pl")
    public void openWebsite() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

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
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAdressesButtom();
    }

    @And("kliknicie w Create new address")
    public void clickAddAddresses() {
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.clickCreateNewAddress();
    }

    @And("wypełnienie formularzu New address (.*) (.*) (.*) (.*)")
    public void fillForm(String alias, String adress, String city, String postcode) {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.fillAliasField(alias);
        newAddressPage.fillAddressField(adress);
        newAddressPage.fillCityField(city);
        newAddressPage.fillPostcodeField(postcode);
        newAddressPage.clickSaveButton();
    }

    @Then("adres (.*) dodany")
    public void addressAdded(String alias) {
        YourAddressesPage yourAddressesPage1 = new YourAddressesPage(driver);
        yourAddressesPage1.checkAddress(alias);
    }
}
