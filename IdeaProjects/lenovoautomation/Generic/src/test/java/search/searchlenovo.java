package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import static sun.security.jgss.GSSUtil.login;

public class searchlenovo extends CommonAPI {

    String url = "http://www.lenovo.com";


    @Test
    public void search(){
        driver.findElement(By.id("inputSearchText")).sendKeys("laptops", Keys.ENTER);
    }
}
