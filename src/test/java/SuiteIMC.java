import Core.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Gilvan Reis on 21/11/2019.
 */
public class SuiteIMC extends BaseTest {

    @Test
    public void calculoImc() {

        driver.findElement(By.id("quest1")).sendKeys("170");
        driver.findElement(By.id("quest2")).sendKeys("65");
        driver.findElement(By.id("quest3")).sendKeys("34");
        driver.findElement(By.id("quest4")).sendKeys("Homem");
        driver.findElement(By.className("form-imc__row__input-submit")).click();
        String str = driver.findElement(By.className("imc_result-label")).getText();
        Assert.assertEquals("O SEU IMC É DE 22.49", str);

    }

    @Test
    public void verifyHomePage() {

        String str = driver.getCurrentUrl();
        Assert.assertEquals("https://www.meu-imc.com/", str);
    }

    @Test
    public void verifyRedirectPage() {

        driver.findElement(By.linkText("Guia de perda de peso")).click();
        String str = driver.getCurrentUrl();
        Assert.assertEquals("https://www.meu-imc.com/guia-de-perda-de-peso", str);


    }
}