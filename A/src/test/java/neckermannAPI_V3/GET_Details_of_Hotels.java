package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class GET_Details_of_Hotels {
	
	@Test
	public  void postmethod()
	{
		HashMap<String, String> data=new HashMap<String, String>();
		data.put("key", "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");
		
		 given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/hotel-detail")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(200)
	
		 .log().all();

		
	}

}
