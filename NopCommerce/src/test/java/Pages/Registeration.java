package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration {
    WebDriver driver;

    public Registeration(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="FirstName")
    public
    WebElement firstName;

    @FindBy(id="LastName")
    public
    WebElement lastName;

    @FindBy(id="Email")
    public
    WebElement email;

    @FindBy(id="Password")
    public
    WebElement password;

    @FindBy(id="ConfirmPassword")
    public
    WebElement confirmPassword;

    @FindBy(id="register-button")
    public
    WebElement registerButton;
}
