package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_Packages_Listing_Page {
	
//	//1
//	@Test
//	public  void postmethodforgetpackage()
//	
//	{
//	
//	String payload=  //for the single guest selected
//			"{\r\n"
//			+ "    \"departure\": \"LCY\",\r\n"
//			+ "    \"destination\": \"A000000729\",\r\n"
//			+ "\r\n"
//			+ "    \"departureDate\": \"2023-06-27\",\r\n"
//			+ "    \"returnDate\":    \"2023-06-28\",\r\n"
//			+ "\r\n"
//			+ "    \"rooms\": [\r\n"
//			+ "        {\r\n"
//			+ "            \"guests\": [\r\n"
//			+ "                {\r\n"
//			+ "                    \"type\": \"adult\",\r\n"
//			+ "                      \"age\": 34\r\n"
//			+ "                }\r\n"
//			+ "            ]\r\n"
//			+ "        }\r\n"
//			+ "    ]\r\n"
//			+ "}";
//	
//	
//	given()
//	.contentType("application/json")
//	.body(payload)
//	
//	
//	.when()
//	.post("https://apidev.neckermanntravel.co.uk/package-enquiry")
//	
//	
//	 .then()
//	 .log().ifError() //for getting the error message
//	 .statusCode(200)
//
//	 .log().all();

	//2. 
	
//		@Test
//		public  void postmethodforgetpackage()
//		
//		{
//		
//		String payload=  //for the single guest selected
//				"{\r\n"
//				+ "    \"departure\": \"LCY\",\r\n"
//				+ "    \"destination\": \"H000000192\",\r\n"
//				+ "  \r\n"
//				+ "    \"departureDate\": \"2023-06-24\",\r\n"
//				+ "    \"returnDate\":    \"2023-06-28\",\r\n"
//				+ "\r\n"
////				+ "   \"cabinClass\": \"economy\", \r\n" //economy,premium, business, first
//		
//				+ "\r\n"
//				+ "    \"rooms\": [\r\n"
//				+ "        {\r\n"
//				+ "            \"guests\": [\r\n"
////				+ "                {\r\n"
////				+ "                    \"type\": \"adult\",\r\n"
////				+ "                      \"age\": 34\r\n"
////				+ "                },\r\n"
//				+ "                 {\r\n"
//				+ "                    \"type\": \"child\",\r\n"
//				+ "                       \"age\": 2\r\n"
//				+ "                },\r\n"
//				+ "                {\r\n"
//				+ "                    \"type\": \"infant\",\r\n"
//				+ "                       \"age\": 1\r\n"
//				+ "                }\r\n"
//				+ "\r\n"
//				+ "  		]\r\n"
//				+ "              }\r\n"
//				+ "           ]\r\n"
//				+ "}";
//		
//		
//		given()
//		.contentType("application/json")
//		.body(payload)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/package-enquiry")
//		
//		
//		 .then()
//		 .log().ifError() //for getting the error message
//		 .statusCode(200)
//
//		 .log().all();
	@Test
	public  void postmethodforgetpackage()
	
	{
	
	String payload=  //for the single guest selected
			"{\r\n"
			+ "    \"departure\": \"LON\",\r\n"
			+ "    \"destination\": \"H000000192\",\r\n"
			+ "\r\n"
			+ "    \"departureDate\": \"2023-07-28\",\r\n"
			+ "    \"returnDate\":    \"2023-07-30\",\r\n"
			+ "\r\n"
			+ "    \"rooms\": [\r\n"
			+ "        {\r\n"
			+ "            \"guests\": [\r\n"
			+ "                {\r\n"
			+ "                    \"type\": \"adult\"\r\n"
//			+ "                    \"age\":23\r\n"
			+ "                }\r\n"
			+ "            ]\r\n"
			+ "        }\r\n"
			+ "    ]\r\n"
			+ "}";
	
	
	given()
	.contentType("application/json")
	.body(payload)
	
	
	.when()
	.post("https://apidev.neckermanntravel.co.uk/package-enquiry")
	
	
	 .then()
	 .log().ifError() //for getting the error message
	 .statusCode(200)

	 .log().all();

	}
	
	
	
	//working Codes--->
	
 //   	 "departure": "LDY",
//	    "destination": "S000000875",
	
	
	
	

}
