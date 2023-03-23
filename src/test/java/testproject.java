import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testproject {
    WebDriver driver;

        @BeforeMethod
        public void setUp ()
        {
            System.setProperty("webdriver.msedge.driver", "C:\\Users\\Deepa Deva\\msedgedriverr.exe");

            WebDriver driver = new EdgeDriver();

            driver.manage().window().maximize();
            driver.get("https://testproject.io/");
        }

//        @AfterMethod
//        public void tearUp ()
//        {
//            driver.quit ();
//        }

        @Test
        public void readTestProjectBlog ()
        {
            driver.findElement(By.xpath("//*[@id=\'menu-item-525\']/a")).click();
        }

//        @Test
//        public void freeTestProjectSignUp ()
//        {
//            driver.findElement(By.linkText("Free Sign Up")).click();
//        }

        @Test
        public void logIntoTestProject ()
        {
            driver.findElement(By.xpath("//*[@id=\'menu-item-901\']/a")).click();
        }
    }

