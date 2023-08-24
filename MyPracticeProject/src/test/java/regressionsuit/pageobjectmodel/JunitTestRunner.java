package regressionsuit.pageobjectmodel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class JunitTestRunner extends TestBase{
    static WebDriver driver;
    static LoginPage loginPage;
    static DashboardPage dashboardPage;
    static CustomerPage customerPage;
    static CategoryPage categoryPage;

    @BeforeAll
    public static void setUp(){
        openBrowser();
        loginPage=new LoginPage(driver);
        dashboardPage=new DashboardPage(driver);
        customerPage=new CustomerPage(driver);
        categoryPage=new CategoryPage(driver);
        loginPage.Login("testautomation1","automation123!");
        dashboardPage.verifyDashboardPage();
    }
    @Test
    public void addCustomerTest(){
        dashboardPage.clickCustomerList();
        customerPage.addCustomer();
        customerPage.verifyAddCustomerSuccessfully();
    }
    @Test
    public void deleteCategory(){
        dashboardPage.clickCategories();
        categoryPage.deleteCategory();
        categoryPage.verifyCategoryDeleted();
    }
    @AfterAll
    public static void tearDown(){
        dashboardPage.clickLogOut();
        closeBrowser();
    }
}
