package main.com.test.MMT;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethods{
     WebDriverWait webDriverWait1;

     public void clickElement(WebElement elementToBeClickedReceived){
        elementToBeClickedReceived.click();
     }

     public void selected(WebElement elementToBeSelected){

       boolean selectOneWay = elementToBeSelected.isSelected();
       if(selectOneWay.eqauls(false)){
        clickElement(elementToBeSelected);
       }
     }

     public void enterValue(WebElement elementToBeEntered){
        elementToBeEntered.sendKeys("Chennai");
     }

     public void enterDeparture(WebElement elementToBeEntered){
        elementToBeEntered.sendKeys("Bengaluru");
     }

     public void waitForAnElementText(WebElement elementToBeVisible,String startingPoint){
        webDriverWait1.until(ExpectedConditions.textToBePresentInElement(elementToBeVisible,startingPoint));

     }




}