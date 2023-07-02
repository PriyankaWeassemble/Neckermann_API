package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_Customer {
	
	@Test
	public void getmethod()
	{


			given()
//			.header("Authorization", "Bearer d93a2503390596d2d94bf693dcf72c10d6fafdebcd1aafe102267ff8116c143ca8e037aaa8fb6b676fb92dd63ea6bb42e4586dbad4103f6c7c759e2e310868da49a482a047555aae65b878dcffff6dfaf63b422f53fa2dc517738062a1e61d9f6bff49c0f4f5655aac516755081954d2b3e6787d853be0524a8f5df703674edacc86c885593989c20e610806cd543339849f519a5d3287a1d3ef8025766df914988795208c9ddc98d55af43c9647075b")
			
			.when()
			    .get("http://apidev.neckermanntravel.co.uk/customers/me") //for getting all response
			
			 .then()
			 .log().ifError()
			     .statusCode(200)
			     .log().all();
		}
	
	
	

}
