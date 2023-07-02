package RestAssPractice;

import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers.*;


public class CookiesDemo {
	
	
	@Test
	void testCookies()
	{
		given()
		
		.when()
		   .get("https://www.google.com/")
		
		.then()
		.cookie("AEC","ARSKqsIZ43xYbcmn16fg5GOQCm_CGDe8mm-N9_HzSWoVUWVB2wThf0-n5xE")
		.log().all();
		
		
		
		
		
	}
	
	

}
