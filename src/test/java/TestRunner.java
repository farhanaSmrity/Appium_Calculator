import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup{
    @Test
    public void runTest() throws InterruptedException {
        PageObjectsCalculation testCase = new PageObjectsCalculation(driver);
        String result = testCase.doSum();
        Assert.assertEquals(result,"14");
    }
}
