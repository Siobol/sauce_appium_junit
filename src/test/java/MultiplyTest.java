import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;

public class MultiplyTest extends TestBase {
//    @Test
//    public void firstMultiplyTest() {
//        simple.digit_7.click();
//        simple.multiply.click();
//        simple.digit_3.click();
//        simple.calEquals.click();
//        System.out.println(simple.bottom.getText());
//        Assert.assertEquals(simple.bottom.getText(), "21");
//    }

    //@Test
//    public void firstMultiplyTest() {
//        simple.digit_7.click();
//        simple.plus.click();
//        simple.digit_3.click();
//        System.out.println(simple.getResult());
//        System.out.println(simple.getFormula());
//        Assert.assertEquals(simple.getResult(), "10");
//        Assert.assertEquals(simple.getFormula(), "7+3");
//        simple.calEquals.click();
//        System.out.println(simple.getResult());
//        Assert.assertEquals(simple.getResult(), "10");
//    }

    @Test
    public void sinusTest(){
        driver.rotate(ScreenOrientation.LANDSCAPE);
        advanced.sinus.click();
        simple.digit_0.click();
        simple.calEquals.click();
        Assert.assertEquals(simple.getResult(), "0");

        advanced.cosinus.click();
        simple.digit_0.click();
        simple.calEquals.click();
        Assert.assertEquals(simple.getResult(), "1");
    }
}