package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class TestCaRT extends CommonAPI {


    @Test
    public void testCart(){
        driver.findElement(By.xpath("//*[@id=\"shop-cart-icon-b907c2d8-af1a-44fe-b3b7-1db3e4bf77c0\"]/div/div/div/a")).click();


    }
}
