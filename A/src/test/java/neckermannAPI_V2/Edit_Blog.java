package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Edit_Blog {
//	
	@Test
	public  void putmethod()
	{
		HashMap<String, String> data=new HashMap<String, String>();
	
//		data.put("title", "tetsing-3");
//		data.put("excerpt", "testing edited sample1 ...");
//		data.put("content", "<p>This is patch testing edited...</p>");
//		data.put("heroImage", "gfdsdrfgdf");
//		data.put("isFeatured", "false");
//		data.put("author", "shubha342m");
//		data.put("author", "[\"fdxfdfh\"]");

		String payload= "{\r\n"
				+ "      \"title\": \"tetgfvsing-2\",\r\n"
				+ "      \"excerpt\": \"tefvfvsting 2sample ...\",\r\n"
				+ "      \"content\": \"<p>tfreerresting sampe content ...</p>\",\r\n"
			
				+ "      \"isFeatured\": true,\r\n"
				+ "      \"author\": \"tefvdfvster \",\r\n"
				+ "      \"tags\": [\"popular\"]\r\n"
				+ "    }";
		
		given()
		.contentType("application/json")
		.body(payload)
		
		
		.when()
		.patch("https://apidev.neckermanntravel.co.uk/blogs/64115c32ac46ee93f84138d5")
		
		 .then()
		 .log().ifError() 
		 .statusCode(400)
	
		 .log().all();


	      }
}
