package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Capture_And_Cancel_API {
	@Test
	public void Capture()
	{

//		public void getusers()
		//GET Method
//		{
		HashMap<String, String> data=new HashMap<String, String>();
		data.put("sessionId", "SMjoc9NWzizJG_bvwJEXwE6Bc");
		
		given()
		.contentType("application/json")
		.body(data)
			
			
			.when()
			    .get("https://apidev.neckermanntravel.co.uk/capture?sessionId=SMjoc9NWzizJG_bvwJEXwE6Bc") //cancel
			    //Request query means path parameter  after end point ?sessionId=value
			    
			 .then()
			 .log().ifError()
			     .statusCode(200)
			     .log().all();
		}


}
