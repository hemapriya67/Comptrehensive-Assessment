package main.com.test.MMT;

import java.time.Duration;

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