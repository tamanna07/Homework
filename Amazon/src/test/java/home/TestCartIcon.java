package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCartIcon extends CommonAPI {
    @Test

    public void testCart (){

        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();


    }



}
