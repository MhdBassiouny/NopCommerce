package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="ico-register")
    public
    WebElement registerButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public
    WebElement loginButton;

    @FindBy(id="small-searchterms")
    public
    WebElement searchText;

    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
    WebElement searchButton;

    @FindBy(id="customerCurrency")
    public
    WebElement currency;

    @FindBy(className = "prices")
    public
    WebElement productPrice;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    public
    WebElement computerCat;

    @FindBy(className = "page-title")
    public
    WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    public
    WebElement apparelCat;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")
    public
    WebElement shoeCat;

    @FindBy(id ="attribute-option-14")
    public
    WebElement colorSelect;

    @FindBy(xpath = "//li[contains(text(),'camera')]")
    public
    WebElement tags;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    public
    WebElement addToCart;

    @FindBy(id = "add-to-cart-button-4")
    public
    WebElement addingToCart;

    @FindBy(className = "cart-qty")
    public
    WebElement cartQty;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[3]")
    public
    WebElement addToWishList;

    @FindBy(id = "add-to-wishlist-button-4")
    public
    WebElement addingToWishList;

    @FindBy(className = "wishlist-qty")
    public
    WebElement wishlistQty;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]")
    public
    WebElement compareList;

    @FindBy(className = "bar-notification-container")
    public
    WebElement notification;

    @FindBy(id = "topcartlink")
    public
    WebElement cartLabel;

    @FindBy(id = "checkout")
    public
    WebElement checkout;

    @FindBy(id = "termsofservice")
    public
    WebElement termsOfService;

}
