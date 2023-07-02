package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_Destination {
	//
		@Test
		public void getmethod()
		{

//			public void getusers()
			//GET Method
//			{
				given()
				
				.when()
				    .get("https://apidev.neckermanntravel.co.uk/destinations/canary-islands") 
//				  Canary-Islands
//				    Balearics
//				    Greece
//				    Turkey
//				    CYPRUS
//				    The United Arab Emirates (UAE)
//				    Egypt
//				    spain

				    
				 .then()
				 .log().ifError()
				     .statusCode(200)
				     .log().all();
			}

		

	
}
