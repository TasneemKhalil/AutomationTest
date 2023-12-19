package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
    public static Properties prop=new Properties();
    public static FileReader fr;
    
    @BeforeTest
    public void Setup() throws IOException {
    	if (driver==null) {
    		FileReader fr = new FileReader("C:\\Users\\dell\\TestAoutomation_workspace\\TestAoutomation\\src\\test\\resources\\configfiles\\config.propreties");
    	    prop.load(fr);
    	
    	}
    	
       if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Resources\\chromedriver.exe");
   		   driver = new ChromeDriver();
   		   driver.get(prop.getProperty("testurl"));
   		   driver.manage().window().maximize();
       }
//       else if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
//    	   
//    	   System.setProperty("webdriver.firefox.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Resources\\chromedriver.exe");
//   		   driver = new FireFoxDriver();
//             driver.get(prop.getProperty("testurl"));
 //            driver.manage().window().maximize();
//       }
    	
    	
    }
    
    @AfterTest
    public void  tearDown() {
    	driver.close();
    }
    

}
