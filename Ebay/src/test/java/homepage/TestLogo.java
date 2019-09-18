package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLogo  extends CommonAPI {



    @Test
    public void testCategory(){
        driver.findElement(By.xpath("//*[@id=\"gh-logo\"]")).click();


    }



}
