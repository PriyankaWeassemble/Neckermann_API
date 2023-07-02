package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.openqa.selenium.remote.tracing.Tags;
import org.testng.annotations.Test;

public class Post_Blog {
	
//	*************************with valid data****************************
//	@Test
//	public  void postmethod()
//	{
//		String payload= "{\r\n"
//				+ "      \"title\": \"tetsing-2\",\r\n"
//				+ "      \"excerpt\": \"testing 2sample ...\",\r\n"
//				+ "      \"content\": \"<p>testing sampe content ...</p>\",\r\n"
//				+ "      \"heroImage\": \"\",\r\n"
//				+ "      \"isFeatured\": true,\r\n"
//				+ "      \"author\": \"tester \",\r\n"
//				+ "      \"tags\": [\"popular\"]\r\n"
//				+ "    }";
//		
//		given()
//		.contentType("application/json")
//		.body(payload)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/blogs")
//		
//		
//		 .then()
//		 .log().ifError() 
//		 .statusCode(201)
//	
//		 .log().all();
//		
		
		
//	*************************validations****************************
			
		
@Test
public  void postmethod()
{
	String payload= "{\r\n"
			+ "      \"title\": \"tetsing-2\",\r\n"
			+ "      \"excerpt\": \"testing 2sample ...\",\r\n"
			+ "      \"content\": \"<p>testing sampe content ...</p>\",\r\n"
			+ "      \"heroImage\": \"\",\r\n"
			+ "      \"isFeatured\": false,\r\n"
			+ "      \"author\": \"tester \",\r\n"
			+ "      \"tags\": [\"popular\"]\r\n"
			+ "    }";
	
	given()
	.contentType("application/json")
	.body(payload)
	
	
	.when()
	.post("https://apidev.neckermanntravel.co.uk/blogs")
	
	
	 .then()
	 .log().ifError() 
	 .statusCode(201)

	 .log().all();

	      }
}


