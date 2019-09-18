package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestBellIcon  extends CommonAPI {



    @Test
    public void testBellIcon(){
        driver.findElement(By.xpath("//*[@id=\"gh-Alerts-i\"]")).click();


    }




}
