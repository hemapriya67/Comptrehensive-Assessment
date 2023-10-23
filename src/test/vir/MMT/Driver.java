package test.vir.MMT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver{

    private boolean isLogoPresent;
    //creating a driver object
    WebDriver driver1;
    WebElement logo ;

    public Driver(){
        this.isLogoPresent= false;
    }

    // Firefox
    public void firefoxDriver(){

        //Setting location for webdriver

        System.setProperty("webdriver.gecko.driver","users/lib/drivers/geckodriver");
        driver1=new FirefoxDriver();
        driver1.get("https://www.makemytrip.com/");
        driver1.maximizeBrowser();
        Thread.sleep(2000);

         logo = driver1.findElement(By.xpath("//a[contains(@class, 'mmtlogo')]"));

        if(logo.isDisplayed()){
            isLogoPresent = true;
            System.ou.println("Make my trip logo is present in Firefox");
        }
    }

    public void chromeDriver(){

        System.setProperty("webdriver.chrome.driver","users/lib/drivers/chromedriver");
        driver1= new ChromeDriver();
        driver1.get("https://www.makemytrip.com/");
        Thread.sleep(2000);

        logo = driver1.findElement(By.xpath("//a[contains(@class, 'mmtlogo')]"));
        if(logo.isDisplayed()){
            isLogoPresent= true;
            System.out.println("Make my trip logo is present in Chrome");
        }
 }


    }

