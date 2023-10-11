package rembe.weblocator_example;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void demoBlazeTest()
    {
        WebDriver edgedriver = new EdgeDriver();
        
        edgedriver.get("https://demoblaze.com/");
        //edgedriver.getTitle();
        
        //WebElement signIn = edgedriver.findElement(By.id("login2"));
        WebElement signInButton = edgedriver.findElement(By.cssSelector("#login2.nav-link"));
        signInButton.click();
    }
}
