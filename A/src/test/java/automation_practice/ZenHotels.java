package automation_practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZenHotels {
	@Test 
	public void captchaHandle() throws MalformedURLException, IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zenhotels.com/");
		driver.manage().window().maximize();
//		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement acceptcookiepolicy=driver.findElement(By.xpath("//button[text()='Accept and close']"));
		acceptcookiepolicy.click();
		
		//Search widget
		WebElement destinations=driver.findElement(By.xpath("//input[@data-testid='destination-input']"));
		destinations.click();
		
		//Select one destination
		
		List<WebElement> Selectdestination=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='Popup-module__popup--1hfCp']/div[@class='Suggest-module__region--K7vk1']/div[@class='Suggest-module__destination--17nJ9']/div[@class='Suggest-module__destinationTitle--25P3C']")));
		Selectdestination.get(2).click();
		
		//select checkin and checkout date
		
		WebElement checkindateclick=driver.findElement(By.xpath("(//div[@class='Input-module__wrapper--2q9rr Input-module__wrapper_view_primary--_8Y7g Input-module__wrapper_pseudo--2kLCk Datepicker-module__input--2z3vQ']//label[@class='Input-module__label--1p3o1 Input-module__label_size_m--PyZym'])[1]"));
		checkindateclick.click();
		
		List<WebElement> Selectmonth=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='Month-module__wrapper--R5qge']")));
		Selectmonth.get(2).click();
		
		WebElement checkin=driver.findElement(By.xpath("//div[@data-day='Mon May 06 2024 00:00:00 GMT+0530 (India Standard Time)']"));
		checkin.click();
		
		Thread.sleep(4000);

		WebElement checkout=driver.findElement(By.xpath("//div[@data-day='Wed Jun 05 2024 00:00:00 GMT+0530 (India Standard Time)']"));
		checkout.click();
		
		
		
		
		
		
//		WebElement selectcheckindate=driver.findElement(By.xpath("(//div[@class='Day-module__wrapper--193jI']/div[text()='6'])[1]"));
//		selectcheckindate.click();
//		
//		Selectmonth.get(2).click();
//		
//		WebElement selectchekoutdate=driver.findElement(By.xpath("(//div[@class='Day-module__inner--y2nlD' and text()='8'])[1]"));
//		selectchekoutdate.click();
//		  
		
		
		
		
		
		
		
		
		
		
//		driver.quit();
	}
}
