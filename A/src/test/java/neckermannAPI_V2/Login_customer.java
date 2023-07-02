package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Login_customer {
//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//		
//		data.put("email", "lenare6997@orgria.com");//
//		data.put("password", "Lenare6997@");//
//		
//		given()
//		
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/auth/login")
//		
//		
//		 .then()
//		 
//		 .log().ifError() //for getting the error message
//		 .statusCode(200)
//	
//		 .log().all();
//
//		
//	}
	
	
	@Test
	public  void postmethod()
	{
		HashMap<String, String> data=new HashMap<String, String>();
		
//		data.put("email", "linih66716@saeoil.com");
		data.put("password", "Linih66716@");
		
		given()
		
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/auth/login")
		
		
		 .then()
		 
		 .log().ifError() //for getting the error message
		 .statusCode(200)
	
		 .log().all();

		
	}
}
	
	
	
	
//	@Test
//	public  void postmethod()
//	{
//		HashMap<String, String> data=new HashMap<String, String>();
//		
//		data.put("email", "yaredet810@terkoer.com");//
//		data.put("password", "Yaredet810@");//
//		
//		given()
//		
//		.contentType("application/json")
//		.body(data)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/auth/logine")
//		
//		
//		 .then()
//		 
////		 .log().ifError() //for getting the error message
//		 .statusCode(200)
//	
//		 .log().all();
//
//		
//	}
//
//}
