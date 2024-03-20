package automation_practice;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Neckermann_Search_Hotel {
	@Test 
	public void hotelsearch() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.neckermanntravel.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement acceptcookie =driver.findElement(By.xpath("//button[text()='Accept Cookies']"));
		acceptcookie.click();
		
		
		WebElement hotelclick =driver.findElement(By.xpath("//span[text()='Hotel']"));
		hotelclick.click();
		
		WebElement destinationtextboxclick =driver.findElement(By.xpath("//input[@class='search-widget-form_searchWidgetInput__3chrH search-widget-form_destinationInput__Oj8E7']"));
		destinationtextboxclick.click();
		
//		List<WebElement> selectdestinationbox =new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='destination-dropdown_dropdownRegion__alBR3 false']")));
//		selectdestinationbox.get(4).click();
		
		WebElement selectdest =driver.findElement(By.xpath("(//span[text()='Ibiza (All Resorts)'])[2]"));
		selectdest.click();
		
		WebElement calandarclick =driver.findElement(By.xpath("//input[@id='travelDatesButton']"));
		calandarclick.click();
		
//		  WebElement nextMonthButton = driver.findElement(By.className("/html/body/div[1]/div[1]/div/section/section/div/section[2]/form/div[2]/div[2]/div[2]/div/div/button[2]"));
//		  WebElement imageelement = driver.findElement(By.cssSelector(".react-datepicker__navigation-icon.react-datepicker__navigation-icon--next"));
//		  imageelement.click();
		  ////			nextMonthButton.click();-->Psuedo element can not handl by selenium
		
        
        // Find and click on the specific day element (e.g., 15th)
        WebElement checkindayElement = driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, April 17th, 2024']"));
        checkindayElement.click();
        WebElement checkoutdayElement = driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, April 20th, 2024']"));
        checkoutdayElement.click();
      
    
        
        Thread.sleep(1000);
        //search
        WebElement search = driver.findElement(By.xpath("//button[@type='submit' and @class='search-widget-form_submitButton__0ByQy']"));
        search.click();
        



        // Optionally, you can also input the date directly into the input field
        // dateInput.sendKeys("03/15/2024");
		
		
	}

}
