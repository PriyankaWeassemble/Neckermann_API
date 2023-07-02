package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class POSTNewsletterSuscribers {
	@Test
	public  void postmethod()
	{
		HashMap<String, String> data=new HashMap<String, String>();
		data.put("email", "dcd.cbdh5cds@dddc.cdv");
	
		
		given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/newsletter/subscribers")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(201)
	
		 .log().all();

		
	}

}
