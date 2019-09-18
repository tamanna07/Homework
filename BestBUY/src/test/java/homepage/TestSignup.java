package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSignup  extends CommonAPI {

    @Test
    public void testSIGNUP(){
        driver.findElement(By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[1]/button/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"account-menu-app\"]/div/div[4]/div/div/a/button")).click();



    }


}
