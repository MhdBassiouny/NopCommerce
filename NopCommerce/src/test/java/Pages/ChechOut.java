package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChechOut {

    WebDriver driver;

    public ChechOut(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="BillingNewAddress_CountryId")
    public
    WebElement country;

    @FindBy(id="BillingNewAddress_City")
    public
    WebElement city;

    @FindBy(id="BillingNewAddress_Address1")
    public
    WebElement address;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
    public
    WebElement code;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    public
    WebElement phone;

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    public
    WebElement shippingButton;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    public
    WebElement continueShipping;

    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    public
    WebElement continuePayment;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    public
    WebElement continueConfirm;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    public
    WebElement Confirm;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    public
    WebElement message;
}
