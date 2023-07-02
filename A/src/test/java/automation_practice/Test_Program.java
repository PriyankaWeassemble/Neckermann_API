package automation_practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test_Program {
	@Test 
	public void testprogram() throws InterruptedException
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	

WebDriver driver=new ChromeDriver(opt);
driver.get("https://www.neckermanntravel.co.uk/");
driver.manage().window().maximize();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebElement cookie=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
cookie.click();
//
//String expected=driver.getTitle();
//System.out.println(driver.getCurrentUrl());
//String actual="Neckermann Travel | Home Page"; 
//if(actual==expected)
//	{System.out.println("Home page title is correct");}
//else
//	{System.out.println("Home page title is incorrect");}



//Hamburger menu selection code

//WebElement hamburger=driver.findElement(By.xpath("//button[@class='header_navHamburger__dXcUC']"));
//hamburger.click();
//
//List<WebElement> destinations=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='header_subMenuContainer__RUh3T']//div/a")));
//for(int i=0;i<destinations.size();i++)
//{
//	if(destinations.get(i).getText().contains("Cyprus"))
//	{
//		destinations.get(i).click();
//		break;
//	}
//}
//WebElement cookie1=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
//cookie1.click();
//System.out.println("cookie accepted");



//Atol page all links selection code
//WebElement atolprotected=driver.findElement(By.xpath("(//a[text()='ATOL Protected'])[1]"));
//atolprotected.click();
//System.out.println("ATOL protected click");
//
//WebElement cookie1=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
//cookie1.click();
//System.out.println("cookie accepted");
//
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scroll(0,600)");
//Thread.sleep(3000);
//
//List<WebElement> ATOLTabs=new ArrayList<WebElement>(driver.findElements(By.xpath("//button[@class='AtolProtected_readMoreBtn__V0Y_1']")));
//for(int i=0;i<ATOLTabs.size();i++)
//{
//	{
//		ATOLTabs.get(i).click();
//		WebElement closepopup=driver.findElement(By.xpath("//button[@tabindex='0']"));
//		closepopup.click();
//	}
//}
//System.out.println("all links are clikable");
//driver.quit();

//WebElement logo=driver.findElement(By.xpath("//a[@class='header_brandGroupWrap___jKO_']"));
//logo.click();
//System.out.println("Come back to home page");

//about us page 
WebElement aboutus=driver.findElement(By.xpath("//a[text()='About Us']"));
aboutus.click();
WebElement cookie1=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
cookie1.click();
System.out.println("cookie accepted");

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scroll(0,1600)");
Thread.sleep(3000);

WebElement contactusonaboutus=driver.findElement(By.xpath("//a[text()='Contact Us']"));
contactusonaboutus.click();



//driver.quit();
}
}