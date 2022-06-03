package StepDefinition;

import Pages.ChechOut;
import Pages.HomePage;
import Pages.Login;
import Pages.Registeration;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Steps {

    WebDriver driver;
    Pages.Login login;
    HomePage home;
    Registeration register;
    ChechOut checkout;

    @Given("open Home")
    public void openBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        driver= new ChromeDriver();
        login = new Pages.Login(driver);
        home = new HomePage(driver);
        register = new Registeration(driver);
        checkout = new ChechOut(driver);

        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }


    @Given("User clicks on register")
    public void clickRegister() throws InterruptedException {
        home.registerButton.click();
        Thread.sleep(2000);
    }

    @And("^register User '(.*)' and '(.*)'$")
    public void newRegistration(String username, String password) throws InterruptedException {
        register.firstName.sendKeys("Test");
        register.lastName.sendKeys("Test");
        register.email.sendKeys(username);
        register.password.sendKeys(password);
        register.confirmPassword.sendKeys(password);
        Thread.sleep(2000);
    }

    @When("Click register")
    public void register() throws InterruptedException {
        register.registerButton.click();
        Thread.sleep(4000);
        String actualResult = driver.findElement(By.className("result")).getText();
        String expectedResult = "Your registration completed";
    }

    @Then("A new account is created")
    public void checkSuccessRegistration(){
        String actualResult = driver.findElement(By.className("result")).getText();
        String expectedResult = "Your registration completed";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Given("user navigate to login")
    public void loginPage() throws InterruptedException {
        home.loginButton.click();
        Thread.sleep(3000);
    }

    @And("^Login User '(.*)' and '(.*)'$")
    public void loginData(String username, String password) throws InterruptedException {
        login.email.sendKeys(username);
        login.password.sendKeys(password);
        login.loginButton.click();
        Thread.sleep(4000);
    }

    @Then("Successful login")
    public void successfulLogin(){
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/";

        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("User clicks on forget Password")
    public void forgetPassword() throws InterruptedException {
        login.forgotPassword.click();
        Thread.sleep(3000);
    }

    @When("^User resets password for email: '(.*)'$")
    public void resetPassword(String username) throws InterruptedException {
        login.email.sendKeys(username);
        login.resetButton.click();
        Thread.sleep(3000);

    }

    @Then("password reset message")
    public void checkPasswordReset(){
        String actualResult = login.result.getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("Search for computer")
    public void search() throws InterruptedException {
        home.searchText.sendKeys("computer");
        home.searchText.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("Check search result")
    public void checkSearch(){
        String actualResult = driver.findElement(By.className("product-title")).getText();
        String expectedResult = "computer";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("change currency")
    public void changeCurrency() throws InterruptedException {
        Select currencySelection =new Select(home.currency);
        currencySelection.selectByVisibleText("Euro");
        Thread.sleep(3000);
    }

    @Then("check currency")
    public void checkCurrency(){
        String actualResult = home.productPrice.getText();
        String expectedResult = "€";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("select category")
    public void selectCategory() throws InterruptedException {
        home.computerCat.click();
        Thread.sleep(2000);
    }

    @Then("check category")
    public void checkCategory(){
        String actualResult = home.pageTitle.getText();
        String expectedResult = "Computers";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("navigate to shoes")
    public void navigateShoes() throws InterruptedException {
        home.apparelCat.click();
        Thread.sleep(2000);
        home.shoeCat.click();
        Thread.sleep(2000);
    }

    @And("select color")
    public void selectColor(){
        home.colorSelect.click();
    }

    @Given("select tag")
    public void selectTag() throws InterruptedException {
        home.tags.click();
        Thread.sleep(2000);
    }

    @Then("check tag")
    public void checkTag(){
        String actualResult = home.pageTitle.getText();
        String expectedResult = "camera";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("add product to cart")
    public void addProductToCart() throws InterruptedException {
        home.addToCart.click();
        Thread.sleep(2000);
        home.addingToCart.click();
        Thread.sleep(2000);
    }

    @Then("check cart")
    public void checkCart(){
        String actualResult = home.cartQty.getText();
        String expectedResult = "(0)";
        Assert.assertNotEquals(actualResult, expectedResult);
    }

    @Given("add product to wish list")
    public void addWishList() throws InterruptedException {
        home.addToWishList.click();
        Thread.sleep(3000);
        home.addingToWishList.click();
        Thread.sleep(2000);
    }

    @Then("check wish list")
    public void checkWishList(){
        String actualResult = home.wishlistQty.getText();
        String expectedResult = "(0)";
        Assert.assertNotEquals(actualResult, expectedResult);
    }

    @Given("add product to compare list")
    public void addProductToCompare() throws InterruptedException {
        home.compareList.click();
        Thread.sleep(500);

    }

    @Then("check compare list")
    public void checkCompareList(){
        String actualResult = home.notification.getText();
        String expectedResult = "has been added";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @And("complete order")
    public void completeOrder() throws InterruptedException {
        Thread.sleep(4000);
        home.cartLabel.click();
        Thread.sleep(2000);
        home.termsOfService.click();
        Thread.sleep(1000);
        home.checkout.click();
        Thread.sleep(2000);

        Select country = new Select(checkout.country);
        country.selectByIndex(2);

        checkout.city.sendKeys("test");
        checkout.address.sendKeys("test");
        checkout.code.sendKeys("12345");
        checkout.phone.sendKeys("123456789");
        checkout.shippingButton.click();
        Thread.sleep(2000);

        checkout.continueShipping.click();
        Thread.sleep(2000);

        checkout.continuePayment.click();
        Thread.sleep(2000);

        checkout.continueConfirm.click();
        Thread.sleep(2000);

        checkout.Confirm.click();
        Thread.sleep(2000);
    }

    @Then("check order")
    public void checkOrder(){
        String actualResult = checkout.message.getText();
        String expectedResult = "successfully";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

}
