package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Forgot_password {
//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//
//		data.put("email", "depim79793@otanhome.com");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/accounts/forgot-password")
//		
//		
//		 .then()
//		 .log().ifError()
//		 .statusCode(201)
//
//		 .log().all();
//
//
//}
	
	//unverified customer
//	
//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//
//		data.put("email", "wekomi5830@mirtox.com");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/accounts/forgot-password")
//		
//		
//		 .then()
//		 .log().ifError()
//		 .statusCode(201)
//
//		 .log().all();
//
//
//}
	

	@Test
	public  void postmethod1()
	{
		HashMap<String, String> data=new HashMap<String, String>();

		data.put("email", "hexodog436@raotus.com");
		
		given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/accounts/forgot-password")
		
		
		 .then()
		 .log().ifError()
		 .statusCode(200)

		 .log().all();


}
	
	
	
	
	
}

