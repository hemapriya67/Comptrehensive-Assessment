package test.vir.MMT;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestRunner extends Driver {

    @BeforeMethod
    public void fetchLogo() throws InterruptedException{
        firefoxDriver();
        chromeDriver();

    }

    @Test
    public void name(){
        assertEquals(isLogopresent(),true);
        Reporter.log("The Logo is present");
    }
}


