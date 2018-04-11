import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleCalculatorPage {
    @AndroidFindBy(id = "digit_2")
    public WebElement digit_2;

    @AndroidFindBy(id = "digit_1")
    public WebElement digit_1;

    @AndroidFindBy(id = "digit_0")
    public WebElement digit_0;

    @AndroidFindBy(id = "digit_3")
    public WebElement digit_3;

    @AndroidFindBy(id = "digit_4")
    public WebElement digit_4;

    @AndroidFindBy(id = "digit_5")
    public WebElement digit_5;

    @AndroidFindBy(id = "digit_6")
    public WebElement digit_6;

    @AndroidFindBy(id = "digit_7")
    public WebElement digit_7;

    @AndroidFindBy(id = "digit_8")
    public WebElement digit_8;

    @AndroidFindBy(id = "digit_9")
    public WebElement digit_9;

    @AndroidFindBy(id = "op_add")
    public WebElement plus;

    @AndroidFindBy(id = "op_sub")
    public WebElement minus;

    @AndroidFindBy(id = "op_div")
    public WebElement divide;

    @AndroidFindBy(id = "op_mul")
    public WebElement multiply;

    @AndroidFindBy(id = "del")
    public WebElement delete;

    @AndroidFindBy(id = "formula")
    public WebElement top;

    @AndroidFindBy(id = "result")
    public WebElement bottom;

    @AndroidFindBy(id = "eq")
    public WebElement calEquals;

    public String getFormula(){
        return top.getText();
    }

    public String getResult(){
        return bottom.getText();
    }


}