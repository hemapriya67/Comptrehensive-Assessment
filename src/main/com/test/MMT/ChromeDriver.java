package main.com.test.MMT;

import org.openqa.selenium.WebDriver;

public class ChromeDriver{
    // Calling Chrome and opening make my trip
        WebDriver driver1;
        System.setProperty("webdriver.chrome.driver","users/lib/drivers/chromedriver");
        driver1= new ChromeDriver();
        driver1.get("https://www.makemytrip.com/");
        Thread.sleep(2000);

  UtilityMethods utility1 = new UtilityMethods;

  //Flights 
  WebElement flights = driver1.findElement(By.xpath("//*[@id="SW"]/div[1]/div[2]/div/div/nav/ul/li[1]/span/a"));
  utility1.clickElement(flights);
  
  //One way
  WebElement oneWay = driver1.findElement(By.xpath("//*[@id="root"]/div/div[2]/div/div/div/div[1]/ul/li[1]"));
  utility1.selected(oneWay);

  //From xpath   
  WebElement from1 = driver1.findElement(By.xpath("//*[@id="fromCity"]"));
  utility1.clickElement(from1);

  //Enter Chennai
  utility1.enterValue(from1);
  Thread.sleep(2000);

// Select Chennai from list  
  WebElement source = driver1.findElement(By.xpath("//*[@id="react-autowhatever-1-section-0-item-0"]/div/div[1]"));
  utility1.waitForAnElementText(source,"Chennai"); 
  utility1.clickElement(source);

  //To xpath
  WebElement to1 = driver1.findElement(By.xpath("//*[@id="toCity"]"));
  utility1.clickElement(to1);

  //Enter Banglore
  utility.enterDeparture(to1);
  Thread.sleep(2000);

  //Select Bengaluru from list 
  WebElement destination = driver1.findElement(By.xpath("//*[@id="react-autowhatever-1-section-0-item-0"]/div/div[1]"))
  utility1.waitForAnElementText(destination,"Bengaluru");
  utility1.clickElement(destination);
   


    
    
}