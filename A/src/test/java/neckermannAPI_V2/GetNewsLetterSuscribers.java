package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetNewsLetterSuscribers {
	
	@Test
	public void getmethod()
	{


			given()

			.when()
			    .get("http://apidev.neckermanntravel.co.uk/newsletter/subscribers") 
			    
			 .then()
			 
			 .log().ifError()
			     .statusCode(200)
			     .log().all();
			
		}

}
