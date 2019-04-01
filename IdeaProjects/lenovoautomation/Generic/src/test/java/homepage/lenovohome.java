package homepage;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lenovohome extends CommonAPI {
    @Test
    public void test1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Lenovo Official US Site | Computers, Smartphones, Data Center");
    }
}

