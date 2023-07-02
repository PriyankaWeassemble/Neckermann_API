package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Destination_api {
	@Test
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()
			
			.when()
			    .get("http://apidev.neckermanntravel.co.uk/hotels") 
			    
			 .then()
			 
			      .log().ifError()
			     .statusCode(200)
			     .log().all();
		}
	

}
