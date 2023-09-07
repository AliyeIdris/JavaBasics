package regressionsuit.pageobjectmodel;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    FunctionLibrary functionLibrary;
    int timeout=2;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        functionLibrary=new FunctionLibrary(driver);
    }

    @FindBy(xpath="//*[@id=\"dashboard\"]/h3")
    WebElement dashBoardText;
    @FindBy(css = ".fa.fa-sign-out")
    WebElement logoutLink;
    @FindBy(linkText = "Customer List")
    WebElement customerListLink;
    @FindBy(linkText = "Categories")
    WebElement categoriesLink;
    @FindBy(linkText = "Products")
    WebElement productsLink;

    @FindBy(linkText = "Newsletters")
    WebElement newslettersLink;
    @FindBy(linkText = "Orders")
    WebElement ordersLink;
    public boolean verifyDashboardPage(){
        return dashBoardText.isDisplayed();
    }

    public void clickCustomerList(){
        functionLibrary.waitForElementPresent(customerListLink);
        customerListLink.click();
    }
    public void clickCategories(){
        functionLibrary.waitForElementPresent(categoriesLink);
        categoriesLink.click();
    }
    public void clickOnProductsLink(){
        functionLibrary.waitForElementPresent(productsLink);
        productsLink.click();
    }
    public void clickOnNewsletters(){
        functionLibrary.waitForElementPresent(newslettersLink);
        newslettersLink.click();
    }

    public void clickOnOrders(){
        functionLibrary.waitForElementPresent(ordersLink);
        ordersLink.click();
    }
    public void clickLogOut(){
        logoutLink.click();
    }

}
