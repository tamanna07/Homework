package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLogInPos extends CommonAPI {

    @Test
    public void testLoginPositive(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("BRISTY@GMAIL.COM");
        driver.findElement(By.xpath("//*[@class=\"a-button-input\"]")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("12346");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

    }






}
