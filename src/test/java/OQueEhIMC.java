import Core.BaseTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Gilvan Reis on 21/11/2019.
 */
public class OQueEhIMC extends BaseTest{


    @Test
    public void verifyOqueEhImc() {
        driver.findElement(By.linkText("O que é o IMC?")).click();
        String str = driver.getCurrentUrl();
        Assert.assertEquals("https://www.meu-imc.com/o-que-e-o-imc",str);
    }

}
