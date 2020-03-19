package Bank;

import Bank.AccountInfo;
import org.junit.Assert;
import org.junit.Test;

public class AccountInfoTest {
    @Test
    public void getId() {
        AccountInfo accData = new AccountInfo(1000, "Basic", "basic@gmail.com", 500, "basic");
        int expected = 1000;
        int actual = accData.getId();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getName() {
        AccountInfo accInfo = new AccountInfo(1000, "Basic", "basic@gmail.com", 500, "basic");
        String expected = "Basic";
        String actual = accInfo.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEmail() {
        AccountInfo accData = new AccountInfo(1000, "Basic", "basic@gmail.com", 500, "basic");
        String expected = "basic@gmail.com";
        String actual = accData.getEmail();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getBalance() {
        AccountInfo accData = new AccountInfo(1000, "Basic", "basic@gmail.com", 500, "basic");
        float expected = 500.00f;
        float actual = accData.getBalance();
        Assert.assertEquals(expected,actual, 0.0);
    }

}

