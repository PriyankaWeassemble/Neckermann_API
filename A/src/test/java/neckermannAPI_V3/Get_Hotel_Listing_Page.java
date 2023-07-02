package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_Hotel_Listing_Page {  //*********//NV-306//*********//
	@Test
	public  void postmethodforgethotellistingpage()
	
	{
		//it's a template
		
//		String payload=  //for the single guest selected
//				"{\"stay\": {\r\n"
//				+ "    \"checkIn\": \"yyyy-mm-dd\",\r\n"
//				+ "    \"checkOut\": \"yyyy-mm-dd\"\r\n"
//				+ "  },\r\n"
//				+ "  \"rooms\": [\r\n"
//				+ "    {\r\n"
//				+ "      \"guests\": [\r\n"
//				+ "        {\r\n"
//				+ "          \"type\": \"adult,child\",\r\n"   //adult, child, infant
//				+ "          \"age\": 0,9\r\n" // age as per the sequence
//				+ "        }\r\n"
//				+ "      ]\r\n"
//				+ "    }\r\n"
//				+ "  ],\r\n"
//				+ "  \"destinations\": [\r\n"
//				+ "    \"string\"\r\n"
//				+ "  ]}";
		
		//for multiple guest selected template
//		String payload1="{\r\n"
//				+ "  \"stay\": {\r\n"
//				+ "    \"checkIn\": \"string\",\r\n"
//				+ "    \"checkOut\": \"string\"\r\n"
//				+ "  },\r\n"
//				+ "  \"rooms\": [\r\n"
//				+ "    {\r\n"
//				+ "      \"guests\": [\r\n"
//				+ "        {\r\n"
//				+ "          \"type\": \"adult\",\r\n"
//				+ "          \"age\": 0\r\n"
//				+ "        },\r\n"
//				+ "{\r\n"
//				+ "          \"type\": \"child\",\r\n"
//				+ "          \"age\": 0\r\n"
//				+ "        },\r\n"
//				+ "{\r\n"
//				+ "          \"type\": \"infant\",\r\n"
//				+ "          \"age\": 0\r\n"
//				+ "        }\r\n"
//				+ "      ]\r\n"
//				+ "    }\r\n"
//				+ "  ],\r\n"
//				+ "  \"destinations\": [\r\n"
//				+ "    \"string\"\r\n"
//				+ "  ]\r\n"
//				+ "}";
		
		
		
//		//1. for 1 room and 1 guest (adult)
//		String payload=  //for the single guest selected
//				"{\r\n"
//				+ "  \"stay\": {\r\n"
//				+ "    \"checkIn\": \"2023-06-25\",\r\n"
//				+ "    \"checkOut\": \"2023-06-29\"\r\n"
//				+ "  },\r\n"
//				+ "  \"rooms\": [\r\n"
//				+ "    {\r\n"
//				+ "      \"guests\": [\r\n"
//				+ "        {\r\n"
//				+ "          \"type\": \"adult\"\r\n"
////				+ "          \"age\": 0\r\n"
//				+ "        }\r\n"
//				+ "      ]\r\n"
//				+ "    }\r\n"
//				+ "  ],\r\n"
//				+ "  \"destinations\": [\r\n"
//				+ "    \"A000000728\"\r\n"
//				+ "  ]\r\n"
//				+ "}";
//		
//		
//		given()
//		.contentType("application/json")
//		.body(payload)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/hotel-enquiry")
//		
//		
//		 .then()
//		 .log().ifError() //for getting the error message
//		 .statusCode(200)
//	
//		 .log().all();

		
		//1.1
		String payload11=  //for the single guest selected
				"{\r\n"
				+ "  \"stay\": {\r\n"
				+ "    \"checkIn\": \"2023-06-23\",\r\n"
				+ "    \"checkOut\": \"2023-06-29\"\r\n"
				+ "  },\r\n"
				+ "  \"rooms\": [\r\n"
				+ "    {\r\n"
				+ "      \"guests\": [\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"adult\",\r\n"
				+ "          \"age\": 3\r\n"
				+ "        }, {\r\n"
				+ "          \"type\": \"child\",\r\n"
				+ "          \"age\": 2\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"infant\",\r\n"
				+ "          \"age\": six\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"destinations\": [\r\n"
				+ "    \"A000000729\"\r\n"
				+ "  ]\r\n"
				+ "}";
		
		
		given()
		.contentType("application/json")
		.body(payload11)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/hotel-enquiry")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(200)
	
		 .log().all();
//		
//		//2. for 1 room and 3 guest-->1 guest,1 child, 1 infant
//				String payload1=  //for the single guest selected
//						"{\r\n"
//						+ "  \"stay\": {\r\n"
//						+ "    \"checkIn\": \"2023-06-19\",\r\n"
//						+ "    \"checkOut\": \"2023-06-29\"\r\n"
//						+ "  },\r\n"
//						+ "  \"rooms\": [\r\n"
//						+ "    {\r\n"
//						+ "      \"guests\": [\r\n"
//						+ "        {\r\n"
//						+ "          \"type\": \"adult\"\r\n"
//					//  + "          \"age\": 0\r\n"
//						+ "        },\r\n"
//						+"           {\r\n"
//						+ "          \"type\": \"child\"\r\n"
//						+ "          \"age\": 4\r\n"
//						+ "        },\r\n"
//						+ "       {\r\n"
//						+ "          \"type\": \"infant\"\r\n"
//						+ "          \"age\": 4\r\n"
//						+ "        }\r\n"
//						+ "      ]\r\n"
//						+ "    }\r\n"
//						+ "  ],\r\n"
//						+ "  \"destinations\": [\r\n"
//						+ "    \"A000000728\"\r\n"
//						+ "  ]\r\n"
//						+ "}";
//				
//				
//				given()
//				.contentType("application/json")
//				.body(payload)
//				
//				
//				.when()
//				.post("https://apidev.neckermanntravel.co.uk/hotel-enquiry")
//				
//				
//				 .then()
//				 .log().ifError() //for getting the error message
//				 .statusCode(200)
//			
//				 .log().all();
//
//		
		
		
		//3. for 2 rooms and 4 guest-->2 guest,1 child, 1 infant
//		String payload3=  //for the single guest selected
//				"{\r\n"
//				+ "  \"stay\": {\r\n"
//				+ "    \"checkIn\": \"2023-06-19\",\r\n"
//				+ "    \"checkOut\": \"2023-06-29\"\r\n"
//				+ "  },\r\n"
//				+ "  \"rooms\": [\r\n"
//				+ "      {\r\n" //1st room
//				+ "      \"guests\": [\r\n"
//				+ "        {\r\n"
//				+ "          \"type\": \"adult\"\r\n"
////				+ "          \"age\": 0\r\n"
//				+ "        },\r\n"
//				+"           {\r\n"
//				+ "          \"type\": \"child\"\r\n"
//				+ "          \"age\": 5.4\r\n"
//				+ "        },\r\n"
//				+ "       {\r\n"
//				+ "          \"type\": \"infant\"\r\n"
//				+ "          \"age\": 5.4\r\n"
//				+ "        }\r\n"
//				+ "      ]\r\n"
//				+ "        },\r\n"
//				+"       {\r\n" //2nd room 
//						+ "      \"guests\": [\r\n"
//						+ "        {\r\n"
//						+ "          \"type\": \"adult\"\r\n"
////						+ "          \"age\": 0\r\n"
//						+ "        }\r\n"
//				+ "  ],\r\n"
//				+ "  \"destinations\": [\r\n"
//				+ "    \"A000000728\"\r\n"
//				+ "  ]\r\n"
//				+ "}";
//		
//		
//		given()
//		.contentType("application/json")
//		.body(payload3)
//		
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/hotel-enquiry")
//		
//		
//		 .then()
//		 .log().ifError() //for getting the error message
//		 .statusCode(200)
//	
//		 .log().all();


		
		
		
		
		
	}
	
	
}
