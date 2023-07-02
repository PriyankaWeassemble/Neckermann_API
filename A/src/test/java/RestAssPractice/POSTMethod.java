package RestAssPractice;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class POSTMethod {
	
	 int id;
	
	@Test(priority=0)
	public  void postmethod()
	{

		HashMap data=new HashMap();
		data.put("name", "p6vn");
		data.put("job", "trainer");
		
		id = given()
		.contentType("application/json")
		.body(data)
		
		.when()
		  .post("https://reqres.in/api/users")
		   .jsonPath().getInt("id"); 
		
		
//		.then()
//		   .statusCode(201)
//		   .log().all();
		
	}
	
	@Test(priority=1,dependsOnMethods="postmethod")
	public void putmethod()
	{//if testng then use dependsonmethod post becz it based on post method

		HashMap data=new HashMap();
		data.put("name", "pavn");
		data.put("job", "trainer");
		
		 given()
		.contentType("application/json")
		.body(data)
		
		.when()
		  .put("https://reqres.in/api/users"+id) 
		
		
		.then()
		   .statusCode(200)
		   .log().all();
		
	}	

}
