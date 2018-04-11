import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AdvCalPage extends SimpleCalculatorPage {
    @AndroidFindBy(id = "fun_sin")
    public WebElement sinus;

    @AndroidFindBy(id = "fun_cos")
    public WebElement cosinus;
}
