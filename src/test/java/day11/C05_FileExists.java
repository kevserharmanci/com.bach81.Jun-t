package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_FileExists extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {

        //https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //test.txt dosyasını indirelim
        driver.findElement(By.xpath("//*[@href='download/text.txt.txt']")).click();
        Thread.sleep(2000);
        //Ardından isExist( )  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosya= "C:\\Users\\user\\Downloads\\text.txt.txt";
        Assert.assertTrue(Files.exists(Paths.get(dosya)));
        //İndirildiğini konsolda gösterin
        System.out.println(Files.exists(Paths.get(dosya)));


    }
}