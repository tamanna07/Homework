package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestGetDeals extends CommonAPI {

    @Test
    public void getDealsText (){

        String i = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).getText();
        System.out.println( i);



    }



}
