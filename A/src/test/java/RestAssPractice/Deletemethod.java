package RestAssPractice;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class Deletemethod {
		
	@Test
	public void deletemethod()
	{
		 given()
		 
			.when()
			  .delete("https://reqres.in/api/users/2") 
			
						.then()
			   .statusCode(204)
			   .log().all();//it not shows any response but get some header information
		
	}

}
