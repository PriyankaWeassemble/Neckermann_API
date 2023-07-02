package automation_practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot_code {

	
	static WebDriver driver;
	
	
		public void screenshotmethod(String screenshotname) throws IOException
	{
		
		Date d=new Date();
		DateFormat d1 = new SimpleDateFormat("mm-dd-yy & hh-mm-ss");
		String date =d1.format(d);
				
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./Screenshots\\"+screenshotname+date+".jpeg");
		FileHandler.copy(source, Dest);
		
		
		
	}
		
	@Test
	public void maincode() throws IOException
	{
		Logger log=Logger.getLogger("A");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(opt);

	PropertyConfigurator.configure("log4j.properties");
	
	driver.get("https://neckermanntravel.co.uk/");
	log.info("webside open");
	driver.manage().window().maximize();
	log.info("maximize window");
	screenshotmethod("cookies");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement cookie=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
	cookie.click();
	log.info("cookies are accepted");
	
	screenshotmethod("homepage");
	
	driver.quit();
	
}
}
