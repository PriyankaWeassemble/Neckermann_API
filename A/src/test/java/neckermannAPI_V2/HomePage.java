package neckermannAPI_V2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class HomePage {
	@Test
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()
			
			.when()
			    .get("https://apidev.neckermanntravel.co.uk/homepage") 
			    
			 .then()
			 
			     .statusCode(200)
			     .log().all();
		}

	

}
