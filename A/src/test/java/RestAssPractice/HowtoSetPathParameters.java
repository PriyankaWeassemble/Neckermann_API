package RestAssPractice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class HowtoSetPathParameters {
	//https://reqres.in/api/users?page=2&id=5
	@Test
	public void getmethod()
	{

//		public void getusers()
		//GET Method
//		{
			given()//if dont have anything we can remove and remove . befor ethen() because thats our 1st method
			.pathParam("mypath", "users")
			.queryParam("page", 2)
			.queryParam("id", 5)
			//write the query parameter in given method 
			
			.when()
			    .get("https://reqres.in/api/{mypath}") //for getting all response
			
			 .then()
			     .statusCode(200)
			     .log().all();
		}

}
