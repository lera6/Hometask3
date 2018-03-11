package myprojects.automation.assignment3.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {
    @Override
    public void	afterAlertAccept(WebDriver driver) {

    }
    //This action will be performed each time after Alert.accept()
    @Override
    public void	afterAlertDismiss(WebDriver driver) {

    }
    //This action will be performed each time before Alert.dismiss()
    @Override
    public void	afterChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend) {
        System.out.println("Change value to " + keysToSend);
    }
    //Called after WebElement.clear(), WebElement.sendKeys(...)}.
    @Override
    public void	afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Element clicked");
    }
    //    Called after WebElement.click().
    @Override
    public void	afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Element found");
    }
    //    Called after WebDriver.findElement(...), or WebDriver.findElements(...), or WebElement.findElement(...), or WebElement.findElements(...).
    @Override
    public void	afterNavigateBack(WebDriver driver) {

    }
    //    Called after navigate().back().
    @Override
    public void	afterNavigateForward(WebDriver driver) {

    }
     //   Called after navigate().forward().
     @Override
     public void	afterNavigateRefresh(WebDriver driver) {

     }
     //   Called after navigate().refresh().
    @Override
    public void	afterNavigateTo(java.lang.String url, WebDriver driver){
        System.out.println("Navigated to "+url);
    }
     //   Called after get(String url) respectively navigate().to(String url).
    @Override
    public void	afterScript(java.lang.String script, WebDriver driver){
        System.out.println("Script executed");
    }
     //   Called after RemoteWebDriver.executeScript(java.lang.String, java.lang.Object[]).

     @Override
     public void	beforeAlertAccept(WebDriver driver){}
    //    This action will be performed each time before Alert.accept()
    @Override
    public void	beforeAlertDismiss(WebDriver driver){}
    //    This action will be performed each time after Alert.dismiss()
    @Override
    public void	beforeChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend){
        System.out.println("Changing value");
    }
    //    Called before WebElement.clear(), WebElement.sendKeys(...).
    @Override
    public void	beforeClickOn(WebElement element, WebDriver driver){
        System.out.println("Clicking the element");
    }
     //   Called before WebElement.click().
     @Override
     public void	beforeFindBy(By by, WebElement element, WebDriver driver){
         System.out.println("Searching for element");
     }
       // Called before WebDriver.findElement(...), or WebDriver.findElements(...), or WebElement.findElement(...), or WebElement.findElements(...).
    @Override
    public void	beforeNavigateBack(WebDriver driver){}
        //Called before navigate().back().
        @Override
        public void	beforeNavigateForward(WebDriver driver){}
        //Called before navigate().forward().
        @Override
        public void	beforeNavigateRefresh(WebDriver driver){}
        //Called before navigate().refresh().
        @Override
        public void	beforeNavigateTo(java.lang.String url, WebDriver driver){
            System.out.println("Navigating to "+url);
        }
        //Called before get(String url) respectively navigate().to(String url).
        @Override
        public void	beforeScript(java.lang.String script, WebDriver driver){
            System.out.println("Executing script");
        }
        //Called before RemoteWebDriver.executeScript(java.lang.String, java.lang.Object[])
        @Override
        public void	onException(java.lang.Throwable throwable, WebDriver driver){}
        //Called whenever an exception would be thrown.
}
