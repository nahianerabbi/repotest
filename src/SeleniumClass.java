import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "E:/selenium/geckodriver.exe");
		WebDriver frDriver = new FirefoxDriver();
	
						
		System.setProperty("webdriver.chrome.driver", "E:/selenium/chromedriver.exe");
		WebDriver chDriver = new ChromeDriver();
		
		
		System.setProperty("webdriver.ie.driver", "E:/selenium/IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		WebDriver ieDriver = new InternetExplorerDriver(caps);
		
		
				
		
		
		frDriver.get("http://newtours.demoaut.com");
		frDriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		frDriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		frDriver.findElement(By.xpath("")).click();
		
		chDriver.get("http://newtours.demoaut.com/");
		chDriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		chDriver.findElement(By.xpath("")).sendKeys("demo");
		chDriver.findElement(By.xpath("")).click();
		
		ieDriver.get("http://newtours.demoaut.com/");
		ieDriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		ieDriver.findElement(By.xpath("")).sendKeys("demo");
		ieDriver.findElement(By.xpath("")).click();


		
	}

}
