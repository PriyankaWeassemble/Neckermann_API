package neckermannAPI_V2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Verify_customer {
	@Test
	public void getmethod()
	{


			given()
			
			.when()
			    .get("https://apidev.neckermanntravel.co.uk/accounts/verify/12f41ec2876ccbd87bdedcc44802e678fde3b9b89734152f80459638b13a1157da5bebc6045898f38b3852465caeb86b203d18ccca11d35fefbd59508699eae98aa64dfdd635494c79aa7fcb335f43a4c697f0bc118f31a8cc0ab17375e0b0d878b657b154cc656b357caa51556f9113e9c9e74a6e084663fae672d80020d59d63b69a49b2efaa2945fbbde300928e2e6d58967e0cb732d775d30634a8c9398c775dee73ba3499da46d93f011136f126")
			
			 .then()
			 .log().ifError()
			     .statusCode(400)
			     .log().all();
		}

	

}
