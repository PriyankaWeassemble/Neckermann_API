package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Flight_Seat_maps_API {
	@Test
	public  void postmethodforgetpackage()
	
	{
	
	String payload=  //for the single guest selected //for the package Itenaries also
			"{\r\n"
			+ "  \"flightKey\": \"t0+hsQDGdb5+FR+QSSSILdsuuSQBSzLcnIqcZkWMubb51c2hKkoLL6+e+heTAksQz4EGa+P7fX17ciqVU7ftR0mykm4dBZI1srAnskksHCciTKKxzt+2RsPyjEXLnrgPL7apclk5IvRmPrgo4pQ77kVIIHvHrFBviA4WeKMmXhNmGQyBzsGD35RIkLCKtgv/+rrfATX6bF6hYhR16e/Qg1aiRvhf9d1h+nhx0VbuqFl6P8ptstUKvxpDMGGCKolroBL7OYHV253kcRTl9h9ov0gF5Asvba4dk+sUC/kPAwl4cIzpcPqVVgtYzZufL2wMgwi0M31G92s/9HozQrnqUpR/RtGNFlfLYB6tr0c8gvP5fgjx43CPrwBj4F/Nx4FBOMc2k4UqRsOXUTKcxCXDHjux2eLFMP6t8l36r8XESD+BD3hNOuaYW3e+ZDAyOR3k6IRMoGvq3CpQxopORRSWA/saLVtFfQtKC/fm2XlxY4qaxwJxfhUQ3OpbuDcDKVlpplendCsjVv2hbsV5nYEmHzj8EBqvGxgBwz9qdftlS/BQgo6LmQZk5/u2YrZta22HRzGk7PQWPkgs0nMlfvDUMuvTgjzLDySoMyDuxwSQD+a+TNg5Zw168xzbMPbhMGB2UrAxmtEJbDRI2ODXpEIDIh/l7IyUKTCLklHEIXhdMiLUcb8VRokUaVx1OdFoOUXOVTW8U3vomshPtUDpFW0xx28M9pPDQYqi4vn4frmvbHdjAnQ+2YuaoQ93ifARyXkTGysnNhNi0rZXF9bBIgiqMeuccSDBHHlghOYOUpE5FsbhxXXsjLsmTd/LhELW1qCvOw5dz6HTo1ooXW1KNcOXlUt8txiKdHE51CICwLBO6GhP3hbpFgx9g535j9XnDj08+B8pvgMjvyyHyY5UBEvkIts3vm3UEUJi8d1JICWaZKk1XA2YIOr946uNaeMg+U33ZFdsCJYOyeB97N6fNjS6w03dAo/wp2n4+8Eh++sMqQvUhdLjwsHHT2N74WtExoyBgiL/1Uj4FVFOVYbNo9GD7oIxj4pUlmBpToRbVHSftpt7FExYTDGCt+W8u2h5Ey7tc+DuM/B5fnxu+ab+qOstVotNvOOx4o68gZso4M3jGxmAxpWSD1B7lhJMnSU7RqWDQ/zyYJzsK9ZyEvzb6LRibq1QdO7xwp88dLLS/ziRoFNXnC5bAY9mjNBMtJq0o4FPwcHCGHunnEtxlGMCBzyH8Zoxv/+cOf9VRJKEarybrGmczsEZfgWFyAI3tVoTjVC6j9cLSXpT68640GOKtcezUTJTsU0hY2U4peKfAPUCxfCZQvrTqirLv2ku4rL4asHEK7qsXAfAWcFeM/h1s5MJTTvMpCknQuboyzXpCA7dzy0mWNbv+VeXA6PyoCyNdBUj+mUbqtM0VOfJsHig4bw6NDk9BxGVzFV+14tKi9hiOMcIatQdMJCtFFXXOfts+ayCW7HmrSOC1dwOa5d9HWLHV0s4OdWQOwfYSjZZWte0wINvGFSe9CbA5aVZFbuHXk/ulKzDm1zzgiw+3dXzJ/m3LkEkv6m0DXzZJfVVsSpFiSIv/PQzrTL5NKFiiM+3WUWVWkCh6XjSgiiy+F5eDvhv9/YyjuParfZqvVKYFY+RXdu/T9W19H0zIgPEEg3V9O0uzrLmnhsNcrNXx60yc1wjPpg6rsozoan+5kn+nKJktQP8383WgZZ2GOzYMGZ/7Kne8nVX35OxUTomENtxA15kU7iDNi92RRJKw7y2x/4E0DuLHsavpyHcA1j5YGuoXfcI\",\r\n"
			+ "  \"journeys\": [\r\n"
			+ "    1,\r\n"
			+ "2\r\n"
			+ "  ]\r\n"
			+ "}";
	
	
	given()
	.contentType("application/json")
	.body(payload)
	
	
	.when()
	.post("https://apidev.neckermanntravel.co.uk/flight-seat-maps")
	
	
	 .then()
	 .log().ifError() //for getting the error message
	 .statusCode(200)

	 .log().all();

	}

}
