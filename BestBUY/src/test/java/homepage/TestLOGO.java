package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLOGO  extends CommonAPI {

    @Test
    public void testLOGO(){
        driver.findElement(By.xpath("//*[@id=\"header-block\"]/div[2]/div[1]/div/div[1]/a/img")).click();


    }






}
