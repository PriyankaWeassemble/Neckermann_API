package automation_practice;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Captcha_Handle {
	@Test 
	public void captchaHandle() throws MalformedURLException, IOException, InterruptedException, TesseractException
	{
	
		WebDriver driver = new ChromeDriver();
		
		
//	try {
		driver.get("https://2captcha.com/demo/geetest");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		WebElement verify=driver.findElement(By.xpath("//div[@class='geetest_radar_tip']"));
		verify.click();
		

//		WebElement sliderelement=driver.findElement(By.xpath("//div[@class='geetest_slider_button']"));
//		sliderelement.click();
		
		WebElement slideButton = driver.findElement(By.cssSelector(".geetest_slider_button"));// use css selector not xpath

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Example: Move the slide button 100 pixels to the right
        actions.clickAndHold(slideButton).moveByOffset(100, 0).release().perform();
		
		
		
		
        
        
        
        
        

		
		
		
        WebElement imageelement = driver.findElement(By.cssSelector(".geetest_wrap"));
//		WebElement imageelement=driver.findElement(By.xpath("//canvas[@class='geetest_canvas_slice geetest_absolute']"));
//		
		File src=imageelement.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Priyanka Lanjekar\\git\\Neckermann_API\\A\\CaptchaImages\\captcha.png";
		FileHandler.copy(src, new File(path));
		
		Thread.sleep(2000);
		
		ITesseract image =new Tesseract();
		String str=image.doOCR(new File(path));
		System.out.println("image OCR done");
		System.out.println(str);
		
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println("Exception caught:"+e.getMessage());
//	}
		
        
//      // Find the element and image elements
//      WebElement element = driver.findElement(By.cssSelector("your_element_selector"));
//      WebElement image = driver.findElement(By.cssSelector("your_image_selector"));
//
//      // Get the location of the element and image
//      Point elementLocation = element.getLocation();
//      Point imageLocation = image.getLocation();
//
//      // Calculate the distance between the element and image
//      double distance = Math.sqrt(Math.pow(elementLocation.x - imageLocation.x, 2) + Math.pow(elementLocation.y - imageLocation.y, 2));
//
//      System.out.println("Distance between the element and image: " + distance + " pixels");
//		
		
		
	      
               
		
//		driver.quit();
	}

}
