package RestAssPractice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class AllMethods {
	
	@Test(priority=-1)
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()//if dont have anything we can remove and remove . befor ethen() because thats our 1st method
			
			.when()
			    .get("https://reqres.in/api/users?page=2") //for getting all response
			
			 .then()
			     .statusCode(200)// for getting status code
			     .body("page",equalTo(2))   //for compairing the data from the body
			     .log().all();// for getting all body and at the end we have to give ;
		}

	//}
	
int id;
	
	@Test(priority=0)
	public  void postmethod()
	{

		HashMap data=new HashMap();
		data.put("name", "pavn");
		data.put("job", "trainer");
		
		id = given()// we store all things in id
		.contentType("application/json")
		.body(data)// we store data in body
		
		.when()
		  .post("https://reqres.in/api/users")
		   .jsonPath().getInt("id"); //id contains all the body of post method
		
		
//		.then()
//		   .statusCode(201)
//		   .log().all();
		
	}
	
	@Test(priority=1,dependsOnMethods="postmethod")
	public void putmethod()
	{//if testng then use dependsonmethod post becz it based on post method

		HashMap data=new HashMap();
		data.put("name", "pfdfgn");
		data.put("job", "tgfdfdr");
		
		 given()
		.contentType("application/json")
		.body(data)
		
		.when()
		  .put("https://reqres.in/api/users"+id) 
		
		
		.then()
		   .statusCode(200)
		   .log().all();
		
	}	
	//in output 1st we get status code as in then method
	//then we get header files 
	//then we get body
	
	
	
	

}
