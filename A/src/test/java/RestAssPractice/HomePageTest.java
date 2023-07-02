package RestAssPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test
	public void HomePageFunctionality()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
//	driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

}

}
