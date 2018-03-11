package myprojects.automation.assignment3;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     * @param login
     * @param password
     */
    public void login(String login, String password) {
        // TODO implement logging in to Admin Panel
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.name("submitLogin")).click();
        //throw new UnsupportedOperationException();
    }

    /**
     * Adds new category in Admin Panel.
     * @param categoryName
     */
    public void createCategory(String categoryName) {
        // TODO implement logic for new category creation
        //throw new UnsupportedOperationException();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()",
                driver.findElement(By.xpath("//*[contains(@class, 'title')][contains(text(), 'категории')]")));

        waitForContentLoad();
        driver.findElement(By.className("process-icon-new")).click();

        waitForContentLoad();
        driver.findElement(By.id("name_1")).sendKeys(categoryName);
        driver.findElement(By.id("category_form_submit_btn")).click();
    }

    public void searchCategory(String categoryName){
        driver.findElement(By.name("categoryFilter_name")).sendKeys(categoryName);
        driver.findElement(By.id("submitFilterButtoncategory")).click();
    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {
        // TODO implement generic method to wait until page content is loaded
        // wait.until(...);
        // ...
        //wait.until(driver -> ((JavascriptExecutor)driver).executeScript("return document.readyState") == "complete");
        wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    public boolean IsElementPresent(By by)
    {
        try
        {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

}
