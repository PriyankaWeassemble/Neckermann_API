package RestAssPractice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetMethod {
	
//	given()//prerequisites
//	when()//requests
//	then()//validation
	
	
	
@Test
public void getmethod()
{

//	public void getusers()
	//GET Method
//	{
		given()//if dont have anything we can remove and remove . befor ethen() because thats our 1st method
		
		.when()
		    .get("https://reqres.in/api/users?page=2") //for getting all response
		
		 .then()
		     .statusCode(200)// for getting status code
		     .body("page",equalTo(2))   //for compairing the data from the body
		     .log().all();// for getting all body and at the end we have to give ;
	}

//}
}