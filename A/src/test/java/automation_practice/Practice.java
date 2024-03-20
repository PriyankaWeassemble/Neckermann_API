package automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice {
	@Test 
	public void testprogram() throws InterruptedException
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	

WebDriver driver=new ChromeDriver(opt);
driver.get("https://staging.neckermanntravel.co.uk/");
driver.manage().window().maximize();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebElement cookie=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
cookie.click();

WebElement trustcard=driver.findElement(By.xpath("//section[@class='trustCards_section__TC2zA']"));



driver.quit();

}
}