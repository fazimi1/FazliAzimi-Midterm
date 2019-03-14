package contact;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class contactlenovo extends CommonAPI {
    @Test
    public void search() {
        driver.findElement(By.id("contact")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}