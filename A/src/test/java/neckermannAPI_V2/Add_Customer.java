package neckermannAPI_V2;

import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;


import java.util.HashMap;

import org.testng.annotations.Test;

public class Add_Customer {

	@Test
	public  void postmethod()
	{
		HashMap<String, String> data=new HashMap<String, String>();
		
		data.put("name", "Narsimha");
		data.put("email", "linih66716@saeoil.com");
		data.put("password", "Linih66716@");
		
		given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/customers")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(201)
	
		 .log().all();

		
	}
	
	
	
	
	
	
	
	
	
	

//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//		data.put("name", "nimesh");
//		data.put("email", "depim79793@otanhome.com");
//		data.put("password", "Dempi@3ye");
////		data.put("id", "123");
//
//		
//		given()
//		.contentType("application/json")
////		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/customers")
//		
//		
//		 .then()
////		 .log().ifError()
//		 .statusCode(400)
//		 .log().all();

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//		
//		data.put("name", "Ramdwd");
//		data.put("email", "efsdcgmail.com");
//		data.put("password", "Ram@2432");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/customers")
//		
//		
//		 .then()
//		 .log().ifError() //for getting the error message
//		 .statusCode(201)
//	
//		 .log().all();
//
//		
//	}
//@Test
//public  void postmethod()
//{
//	HashMap<String, String> data=new HashMap<String, String>();
//	data.put("name", "necker");
//	data.put("email", "wekomi5830@mirtox.com");
//	data.put("password", "Necker@2V");
////	data.put("id", "123");
//
//	
//	given()
//	.contentType("application/json")
//	.body(data)
//	
//	
//	.when()
//	.post("https://apidev.neckermanntravel.co.uk/customers")
//	
//	
//	 .then()
//	 .log().ifError()
//	 .statusCode(201)
//	 .log().all();
//	
//	
//}
	//after fixing bug
	
//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//		data.put("name", "lena");
//		data.put("email", "lenare6997@orgria.com");
//		data.put("password", "Lenare6997@");
//
//
//				given()
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/customers")
//		
//		
//		 .then()
//		 .log().ifError()
//		 .statusCode(201)
//		 .log().all();
//		
//		
//	}
	
//	//Verification link expiration send (2.56pm) check at 3.30pm
//	
//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//		data.put("name", "priya");
//		data.put("email", "priyanka@weassemble.team");
//		data.put("password", "Priyank@w2");
//
//
//				given()
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/customers")
//		
//		
//		 .then()
//		 .log().ifError()
//		 .statusCode(201)
//		 .log().all();
//		
//		
//	}
	





}