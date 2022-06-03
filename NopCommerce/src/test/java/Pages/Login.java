package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="Email")
    public
    WebElement email;

    @FindBy(id="Password")
    public
    WebElement password;

    @FindBy(xpath="//*[contains(text(), 'Forgot')]")
    public WebElement forgotPassword;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    public
    WebElement loginButton;

    // Reset Password

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
    public
    WebElement resetButton;

    @FindBy(className = "bar-notification")
    public
    WebElement result;
}
