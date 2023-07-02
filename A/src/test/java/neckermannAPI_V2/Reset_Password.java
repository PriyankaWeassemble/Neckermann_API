package neckermannAPI_V2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Reset_Password {


//
//
	@Test
	public  void postmethod()
	{
		HashMap<String, String> data=new HashMap<String, String>();

		data.put("newPassword", "P1@222");
		data.put("repeatedPassword", "Ps111 @222");
		given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/accounts/reset-password/dcdcs12f41ec2876ccbd87bdedcc44802e678fde3b9b89734152f80459638b13a1157da5bebc6045898f38b3852465caeb86b2ac456894000b71c3cf7a637a9eb321426d2929a21acba55c285efb79176e580d5253e83302d255ee8b792111627e438995fffd02bef07b8cde21885c7d48e2f19d1d5743bb21a8b4cda1344b2d4307b400ee4f96648490ca94247deabda010d5d4abacf102b0f44e63eebe24841819aa3e7bfdefa965dd3e8e16bdd7f786e69")
		
		
		 .then()
		 .log().ifError()
		 .statusCode(200)

		 .log().all();


}
}
