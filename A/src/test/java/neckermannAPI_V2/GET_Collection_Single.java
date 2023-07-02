package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GET_Collection_Single {
	@Test
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()
			
			.when()
			    .get("https://apidev.neckermanntravel.co.uk/collectionscxc/adults-only")
			    //Keys-->
//			    luxury
//			    golf-and-sports
//			    family-getaway
//			    city-breaks
//			    all-inclusive
//			    adults-only
			 .then()
			 .log().ifError()
			     .statusCode(200)
			     .log().all();
		}


}
