package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) throws InterruptedException {
        // TODO prepare driver object
        WebDriver driver = getConfiguredDriver();
        GeneralActions generalActions = new GeneralActions(driver);
        // ...
        String username = "webinar.test@gmail.com";
        String password = "Xcg7299bnSmMuRLp9ITw";
        String loginPageUrl = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
        String categoryName = "some new category";

        // login
        driver.navigate().to(loginPageUrl);
        generalActions.waitForContentLoad();
        generalActions.login(username, password);

        // create category
        generalActions.createCategory(categoryName);

        // check that new category appears in Categories table
        generalActions.waitForContentLoad();
        generalActions.searchCategory(categoryName);
        generalActions.waitForContentLoad();
        if (generalActions.IsElementPresent(By.xpath("//*[contains(@class,'pointer')][contains(text(),categoryName)]")))
            System.out.println("New category has been successfully added!");

        // finish script
        driver.quit();
    }



}
