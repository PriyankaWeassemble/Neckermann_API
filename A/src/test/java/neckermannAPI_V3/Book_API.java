package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Book_API {
	@Test
	public void Capture()
	{

//		public void getusers()
		//GET Method
//		{
		RestAssured.baseURI="https://apidev.neckermanntravel.co.uk";
			
			HashMap<String, String> data=new HashMap<String, String>();
			data.put("sessionId", "SMjoc9NWzizJG_bvwJEXwE6Bc");
			
			given()
			.contentType("application/json")
			.body(data)
			
			.when()
			    .post("/book")
			    
			 .then()
			 
			 
			 
			 .log().ifError()
			     .statusCode(200)
			     .log().all();
		}

}
