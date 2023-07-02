package RestAssPractice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class GetMethodNekarman {
	
@Test
public void getmethod()
{


		given()//if dont have anything we can remove and remove . befor ethen() because thats our 1st method
		
		.when()
		    .get("http://localhost:5000/customers/me") //for getting all response
		
		 .then()
		     .statusCode(200)// for getting status code
		     .body("page",equalTo(2))   //for compairing the data from the body
		     .log().all();// for getting all body and at the end we have to give ;
	}


}
