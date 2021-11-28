package CesarSchoolWebsite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;


public class InicializaCesarWebsite {

    private WebDriver driver;


    @Before
    public void InicializaSite(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gabriela\\Desktop\\Gabi\\drivers\\chromedriver.exe")   ;
        driver = new ChromeDriver();
        //maximizando a janela do navegador
        driver.manage().window().maximize();
        //abrindo o site solicitado
        driver.get("https://www.cesar.school/");

    }

    @After
    public void FecharNavegador(){
        driver.quit();
    }

    @Test
    public void AcessarSecaoQuemSomos(){
        driver.findElement(By.partialLinkText("Quem Somos")).click();
        //iniciando o Javascript para utilizar o scroll de pagina
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        System.out.println("O CESAR School encontra-se no endereço: \n");
        System.out.println(driver.findElement(By.cssSelector("body > div.onde > p")).getText());

    }


}
