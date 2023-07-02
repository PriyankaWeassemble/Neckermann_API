package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GET_ALl_Collections {
	@Test
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()
			
			.when()
			    .get("https://apidev.neckermanntravel.co.uk/collectionsfgfhf") 
			    
			 .then()
			 .log().ifError()
			     .statusCode(200)
			     .log().all();
		}


}
