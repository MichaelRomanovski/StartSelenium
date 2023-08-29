import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableTest {

    WebDriver wd;

@BeforeMethod
public void precondition(){
    wd=new ChromeDriver();
//wd.get("https://telranedu.web.app/home");
    wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

}

    @Test

    public void testcss() {
        String text = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child")).getText();
        Assert.assertEquals(text, "Canada");
        Assert.assertTrue(text.contains("da"));
    }
    @Test
    public void testcss1()
    {       List<WebElement> elements = wd.findElements(By.cssSelector("#customers tr th"));
        System.out.println(elements.size()+" columns");
        List<WebElement> elements1= wd.findElements(By.cssSelector("#customers tr"));
        System.out.println(elements1.size()+" rows");
        wd.findElement(By.xpath("//table[@id='customers']//tr[3]"));
wd.findElement(By.cssSelector("th:nth-child(3)"));

    }








    @AfterMethod
    public void postcondition(){
//wd.close();
//wd.quit();


    }








}