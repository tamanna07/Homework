package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDealsBuTTON  extends CommonAPI {

    @Test
    public void testDeals(){
        driver.findElement(By.xpath("//*[@id=\"header-block\"]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/a")).click();


    }


}
