import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsCalculation {

    @FindBy(id = "com.google.android.calculator:id/digit_8")
    MobileElement btn_8;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
    MobileElement btn_6;

    @FindBy(id = "com.google.android.calculator:id/result_preview")
    MobileElement result;

    public  PageObjectsCalculation(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum() throws InterruptedException {
        Thread.sleep(3000);
        btn_8.click();
        btnPlus.click();
        btn_6.click();
        return result.getText();
    }
}



