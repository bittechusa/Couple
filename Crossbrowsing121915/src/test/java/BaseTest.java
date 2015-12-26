import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest 
{
	WebDriver dr;
	@Before
	public void startBrowser()
	{
		String s=System.getProperty("browser");
		if(s.equals("f"))
			{
			dr=new FirefoxDriver();
			dr.get("http://bittechusa.com");
			}
			else if(s.equals("c"))
			{
				System.setProperty("webdriver.chrome.driver", "C:/Users/bittech/Desktop/jar/chromedriver.exe");
				dr=new ChromeDriver();
				dr.get("http://bittechusa.com");
			}
			else if(s.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver", "C:/Users/bittech/Desktop/jar/IEDriverServer.exe");
				dr=new InternetExplorerDriver();
				dr.get("http://bittechusa.com");
			
			}
			else
				dr=new FirefoxDriver();
		       dr.get("http://bittechusa.com");
				
		
		
		
	}
	@Test
	public void m1()
	{
		
	}
	@After
	public void end()
	{
		dr.quit();
	}

}
