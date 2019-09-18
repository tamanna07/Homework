package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLogInNeg extends CommonAPI {


    @Test
    public void testLoginNegetive(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("abc@GMAIL.COM");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("12346");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

}
