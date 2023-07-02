package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_specific_blog {
	
	@Test
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()
			
			.when()
			    .get("http://apidev.neckermanntravel.co.uk/blogs/6405d61269c1b59f76c71b0f") 
			    
			 .then()
			 
			      .log().ifError()
			     .statusCode(200)
			     .log().all();
		}

}
