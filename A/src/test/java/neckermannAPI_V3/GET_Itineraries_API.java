package neckermannAPI_V3;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class GET_Itineraries_API {
	
	
	//*****GET Itineraries for Package***********
	//use this  ( "departure": "LDY","destination": "S000000875")
	//from this we get the rates of the rooms and surety of the availability of the rooms
                       
	
	@Test //(enabled=false)
	public  void getitenariesforpackage()
	{
		String payload="{\r\n"
				+ "  \"key\": \"9jctgjHeCh64WmY+UPJU3O5XSDlND5H8pU2lDsIP5rFaOG/M5LGn1ew+Gvfc9tbPvBLo1Ms7OfCUB609vb86VC6AeRVu1xWoWDaIYB7lu5gBnBYq7RWlfuMf3ZT3INZVgBZKvEKv9Pazxlw6rkXqnCSIbXfCDj8+ftyNyRGVYL92XXXU6LLFP0F9papxIASb7McCOtglTpDwC2Yt1Rf53rrSj/NQ9Mt5+HusnF5OP6Au2kVY8lPvxW1XSkBsztnG5sqiFDqsdKzsab2yunuRyN70KBzn22Pjq5sxKcKKImvAqFvwd8/2IDEV9FUJUGydvxuwb9xNav7d6HEc77UcJ/lhnEyb5P3pVzQXoWx7YBZHydAZbXqMyQ77EKeRjZTKj7s8PmgfVPxp4zkrgY/k5z1jgrlgcMHNb95eQK5+4nH8jCx0GYOrhOXxKkRv459MfcbFxZOxS7/olQFJO2OVQ0EtmJYc0hfoeeJOknB6WffbMifsKDSkSidn/WqRtrnhMi5+I91Cgq0hTUgdmmUeOXrSnsPXinQBwce0O/rV9SyTymvImbNmxvW5VnRJzPVtyqGfrVE8/uTi3tFT7PdfgSkkimksEHY5vAjEsNJXRdCHw+9S12kEJU9ILC7OMrNZNzLpPsvJUE8fN8cZLslqOxZvKzHed4aN0TqYtbnuu2O/hoyDkwR9GXx0L3X6W6wPVkVCZTf2B2WGvWK/Q9yZIsUBme5Wwxt3wOmNzY5akUHumhqDEB+Ed2dul/9UdMXZZzdxpXDL/5eeuF/xDo5i8YZ/1s4QNCeNjqWKMFRwis1it+cY2h33ugqdToy8eTj/5rtLxnyYdrv7xoN63AmM2zR5/9zK3e3jl0LJt2mMPw46fkW0HAYKj2+r4Xp28C74wjEPVzmHnb2Uyom4yCKI4GSq6RGGyg+6Cxq/hgbe+DEBqVtUz0pWQ7Y/zLYni2ryPVYlhX4Dfu5vqNUCr8/icfM38l5QWSA1rE2AMLSsjvRAhnpbROBvOiAG0YBGwMPdxSm/AT7mvroxZUoLLavS75mNOgEXG6gBu3EJWhrcdbPX6Ji+z3wMFJJAyP4Rg9SIX0XsJCmaXvI9ibjipTCmFHQCDayM2xkV6MKH9CETyOPZuy+J4t/fiapiOx9udW5RA3OINX7xO9+Vk7SFLW6yqK3JJlqc/Txv4Goeltn/0KuY8D6D7C7o5EbLTSwiMSLOFO7l73gngZbKp/ZhRYOcUWY0cSVUYEe8wPlewepB/CHkoTp/0cloH+9+svthQ/fGx16ry47e3vK54HT6lATYfJnH7H0+n1+XuGY3ePODwqU0pr19DZTnJ53bDxDrDL+vb66jzcT4IcR2ssHjkXBJBjrRmeJ2BjvnabZNHvyc6DPWPkzbhPzQ0fQyWqTL3gMkakc+zWIX8xkPDFgje5UB+IPzQA+FEnUsN5VsahT0144cT8/anEX2Dhuun3Zab330oVfmqjmAFxG2wSnk/I+G4k4/V77rPWrIejqcSp54F0PFNt/Vbpn1LO+KCxp1HXAcpPHoE2ZArVs9g2VOpzydmUtKuUx8XNUO8XV3iKP2nk0X4gic5Rizb6gTxzb9sWCxMALKGeT8bxHS/q2FqQceLfEQE6WvYGD0tLXm1ImjRypdgu8gtNGLjb9BjJHddJDOLhlCsL/MJxn7xJlTK2c3+wX06f8A69nuOIYh7jdfVOnM0sR4cc2bnF8U2ZouLuRI\",\r\n"
				+ "  \"rates\": [\r\n"
				+ "    {\r\n"
				+ "      \"key\": \"Xd+2ML/vDhqay3sBZ4PZGMgGIr8gW1Ik1saVlWqiCTrHcqoz81bnFJ/p0BfKyGTHbVCyrfFlFikAfmOBiApHKA98eI6ACs6qqiYBRlnl5JTw1hC6PdFUP9TqrtqVS8EOHoVLe1VxMG3eD6UqdpTOgJwuPS8BthB3+wFMf+AX9wDMYDONHtb6BcuGBsMl5grte10fpzt+otKBuvnYH+hQ0d4j5Xg33Uax27rcj6cMd328qwO495j7S8DvyglSmXkxEeUVepUUAZvS1HzxUeqPZySVc64iATdt0RPkM1SQWJgtrF9hPzUbmp+vjILL1ZScGTcPz5eT/fiK5snQy1iPPlAd31JucCgRmwMz6quBIQ/2/hFqoQLyyzygjCpml6VQ05+V2rXBWbPevYZTJnDintI6LqUawaL8a2mRybzeVfnd8glVD0Kd3aF30doFWbYIgHMewFTsD79k/EGvILuD8gSz4lv6tEyR98cVk25tyu8oBQY10RFSZWD8aiARAu5pvrZXIfTqpfDKB7Luu0JTOZ9Z+A9ByefDKbddmqy54urmml4oSEO5DpFmYdzV+yApomuhky6tFjcuvnpU4QKxvFCB+t1i9jzPiMJg42y1izlCn1Nqb+a5Tarj8AiJpEzxCxPYcNlloSrUW/bnq1q4HoIvJdwH0BHdIACMClt/1iVpAMe9Wix92bC2SqKgw1llzsbS7KOdddTeyZgLA8jHWjKwFL9GtWy3hkvl4uIuZiA96g4bRyagPt4fu7Sm4udSMJ3+7+Bqr8S9XZi/5wtzbPdupcjVwAYJVK1Ojc/4H4mb5mbhKyhJPVLCzoKjObAmgUTDkbcjDmGc8s3kn8fidM9k9DLyH6IBsVmexuSSIYMGQMztanA59ZSWjHv3CYcLQhifDxLT62lFeOKbL1kI7OB40iG/RBLi222SUvb4Z7fahWk7BjoP0wUjwyBNSkZLPKYgbPAN+2d6ji5dF/O7a8axv+Xk4uAk0nlxJjPLEEG39nPSRMEKrY1/wCdsXEh4\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"flightKey\": \"LfsW0gYpBTTw6s0/vxmWJGXhgq0qah9hL6bU2TBRrn9wdX1gxPQ+EYFW8mzYeDXQQpt4c9Ojv+5p11j1fRDRAsYfV8bI1o05xcB9dAEtm3s3v7jgETxAw7tgw6fxTEwyOswHqViWwikz5KzCfiZ8wYyz7bK1KlbFsqRiyr+xqs7VKZy1nT3NxzkIcGxW5gqLANVNpeW86t5KM2TMxzMs/HovbLazf+eCZnDy4B7Kc1l+MojNDhsRmimb8wKmN7BBOVsaqVm8+tW3uF5J13N8KsbQI98yeBQH4rtac9ineSYz3SbhXM/8vdCjEltDsnrtnuTlY5yB+gJ5ATdblRbEdHBG06HEwAFsO5tV0vfoj/+ZTJeqhzXbvigp+VH2P6sJEAcNX05S/nwhPHCo7ujDci9Pn3qndGP69tsbXCbYYWVSHgp+8fJ6rcZGUOIGgFmQq+6Yj8inS62e9kBR+6vrZuPzg3EwuLId/akpZB5xvfSabZtay0ChmmnqxGk+hlDl561b8YFtC/f9PEZdvJIbpJ+niiAME5cyu++O57yfsfR/yBxfMj1/JY+HAf4s+Xd6l3hEEAKw/ZKLhdm6HddFt3QVycCc58Fddfw3EYMUTOQK5PaQ3J8YJm6AKgG0etVUc0LHPkfPOTMkRAZnkJ+DruTAuIDkDRfAArAvaNry4jE2tTz5icTP6rXuiMMhWMAOw9w71BKf8zbhdgB/Dw/kuWwu+qsjGs0z5k+xJxSE1qI3V6L1GVbA2jTZxFlZ8vR0rgqIfqbBTCpseCwysaqd5MbvmyUcOpbOj4ZU7ir1G9UXkdUMwEhPYAWPtOIxZDRIBqRqgqCuDVP+knED6BuinacIKu93gz3UETkJUsR8CJ8VbFlHzMd5xUMsp0FO2zDyJg9dY6EW26uBnlLoCf+/Axjx89PDpxMceK1CFDatxzEDlMGMtKnafFcQDvKL/oiiog+REeJzy1nEFjFQSG4cx6h4wTEqaybhtkaTpZ7tRx/W8QenHZyYnh9dW2y2vdimtqNfRTHCEGrZecU3rxWXDr/xvchIWVbgDY1KtaTdRfCWMHlbkrdY4zZttjrMQHZIoH38ECHMqg7pQNTOVGITEK6tr6q/ULYamsEGTRovnKCGTUxSLj1CgaXAYAZtJnyF0f3nYbCD1Tv2wMl4H/WqHylIJUhD1Z8mBqUTNIi83FSx8BiHjMlilHMa1zoiaUraG+tQezwlMobq0R6q1FJOcb0Ln4LjUSw20ucKUlq61S18aHVTgw5LatXjsCDexsRIk5LKmEr+2jJtCYIiqc2gmMJpE3q+oiv3frquGypqh+H4Yf8QpWD114WgcrEC0B8+Is6rF3xMypgbtkOKm9fU/9onoCY/H0XEGhQebjo1SEegN96xZxpu2yqjFLs2/LJyoSw61JSlxkfzwTibubIO+7jYJ7XIPobj+p1hWGCfDNwhemiqPm8h5TWB8Zy6pV1Aqb8eJSpY/akk4XdPjk+xdJgkqEpwT33vw5UDeTFv/qL20BBUnu9Agzw0voFwbOk0w2Kg5tkx4Lk5ljK2v2vd4TSbtM3FGBGVpU6LRreIu3aMmzG3SP0NCBqUzaDeevo6u+pauMK+ENUQv7YqUT+riuxghdSnzq6GCy8sD0dv4v724sIdNiWc+dghqH9Myo6q\",\r\n"
				+ "  \"journeys\": [\r\n"
				+ "    1,\r\n"
				+ "    2\r\n"
				+ "  ]\r\n"
				+ "}";
		given()
		.contentType("application/json")
		.body(payload)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/itineraries")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(200)
	
		 .log().all();

		
	}
	
	//*****GET Itineraries for Hotel***********
	// "destinations": [ "A000000729"]
	//Keys are changes always so we have to run package enquiry(Listing)and package details always before running this
	
	@Test(enabled=false)
	public  void getitenariesforhotel()
	{
		String payload="{\r\n"
				+ "  \"key\": \"qac3NzR+MU2bSb5jcFtFO6YsGMJfkbr3H20+MMBGx0/jTukN7hWvruvTzb7JRYZTFYmmkaP23cNz7O1nBm82wZ1XCX1YSxyHRPWd0E+fV5m0Sd6mtRfp3kRycQTW+6XoEOLOk6WE0ZJEfP+FyJ8aFk/9cpf4HOGodXw8D3X2ZBCHbPubTejNOluIKL+tcdOS6fbJZzDi5D9mVV1fSclz0QBsjO2Ngw7P+cXqOQM0mrliFM4Rt1VSN/J5Og8WfzunsP1jVjKeJhZzE/jn4EZbj3uFqppYTbNBoPUaPfE4pbkcoelvVjvTU9EThrC+t2Y+pBJCMAD84j9HXXiZ2CjxKvDsWJhKADOMLJRbzLI7Wh9caAQHmnwKQRJjnrIIImUcYXEitG7i4ZVNTWfHQNV0Qa3MQ7rxXJUP7KWTomDbaqVmX9XiW1iTxKBVC1MBF/phsadD4onD2WZq1IxXsQGI3bG9NDYCISzdpAqO3HASGfnBGXoUwD9Gt07wbffKNdUw0F86hMPhZyfhfVFuPWi30hZ1zsFJskB0kFC2m9gTOTbNTaPawtcJhGUFJaEwrUD1uhT0k2XmCNRGLsge+PHBWuDPHPgY4KxkKyLEO0Q0OsxW3UimT1h96PeRRdTqwZl5C4Xbo2+6T0jjuU/A60ZPXmTe4dLFHP8xsOfi2bx5PhfJRqZNlrFFdH86jKgaKnTvlOXwvHFjam3PgchuakXe57dbs9VR4rf+ABQfxG2yQWAoOqDN9WnVkVjnLuR7K+HLgQ3Wp7kEFksRnybI02zBjkp3aVYBGE1bFAR0eRU8vfcb8ViM+0GBL6p0nGNiHsNU1AEAmyxAJRvE9NRVvLPIlbweRSxY6gvTpglSQL+5nQgXlGkDtvEBLdn6VbSZxQHIbjVJb9xspvW4ZrDD+V9FtB0Lx81W5bNkF88PpDSBqf/9PoTo39VAQaKqgvzRKmkmPtuK/KdcWBInqeNkX+xDgCJTm9bTEkvWgAvxZcwsuidt00m+KAPLFm3+0dwyyPsIS4r5h4HM9POS6cZaQCs0aRroRZGRmHZ21rBnAMNgM0hpv0IqkLJNdKzYUG4KC0F7eQUt4+/LLlPDctExLTPicoyDAjwbVX1P9U7K2qjg1+rBjoOQSTMkJG7484/M8klMvGdW7YFh009NMgMGU7HMvSYdMEY0vW7fKmZj00JiQoOwhv6xgd6GS1yGzwV66sd0MFniLLBBy2mt4Sukjedfzu4A9hcqEQQ2ME0GaCwyPrdxmoMwKlWd3+/mTgLP2gp0gRL2CM1030lQmMX+4Jafz3bfeN8Tre7C6SamhmJkosuO/z+2fP1hdNhhxmQHzfJpdhRTYgUNyu55zr/iQ56hG0VOEJN1k696GokSa+9MKvpUKB97lMXV38vS+SamHSX269dAE1mY4uXja3EDmD9FhaekUQxulE5YThP6MbgOVKN2pb3SJshBOc1Bt+rzpkwI8b7deM09eU1tLmkXeW7TX2pfwqavS6C4TMV0Hupg1M5WErI/lKJoILC0lCA8xZ0HTmtszGNHz/+BEyMaJOAoX4g4yf5WRTCHZv+ykenPdvdalJ38wKl6iVAPdylX0b5SZFjs8QOY4rh4+BvojrCcgQO02++Q8UdOsEvLhhXTJc+QLC8coYD21GOd8NoYwFIk8Gih7sjKg1oaLA7XclWKlhnxld3ew3ValVnt/q9NUsk2impNDdBg9k4eIVAlNJTEwuw+NLRIatTQ7JWhqV/sMJ98zBzgRfYo4vbYwD2vyH+Nw+8VUYY0fwN+Ky2V014m\",\r\n"  //package key in hotel enquiry
				+ "  \"rates\": [\r\n"
				+ "    {\r\n"
				+ "      \"key\": \"u4CEvgKCGjxT4DUQSLYzZxEvseRgyWrTVsEclNtTwdcYaK02v78DngGTo7HWsrC/zVNbfgkY64vUc7gH2oLNRBmHplBk90BmKM+weNGxF7y3q8cCjkB8HsxPzO675CmehHO09vVdvinklpjIkn2fNhv7xo5+m1amaeAJd2N3tUdJuhriQzbVJZ8BSDKDQq5/e9eQ/Ik3xiLYlze16O9w/RQwvXsunuMu2Pf4W20BHfs1V6lGP39xl2L08LUYRvxSh6C7PldEKx2f0vYiLrz0+1+EmAfr0vwh14UOvkmpvabzVLCoWQAt3030a1pW6xxJbQs3GyOIkXzCjtO0uGxmE50QraUHwIFuGYmj+T5xkffZ9Cv9hDnALm39WF2e3ScWyyV4lGLtKcDdDXMcxUlxJl5EGRmOGg90/VS24GvYRTiZOblGGsHDoThJ54196F/xMoPaP1IIs4NGw+UucQSDJkPFejTnFNNvyPLibpQHwLidbrRAESCjDjScaSnODGdqiMOlmYM0C4kDQ76d7fR5ff15i6mfjV6FqO7PJ1A6IV1P1WH4BCRM7y2t2jGaYm7Ytjqo3GjdPlsntMoSbUPumRcOFPll4gtxkwCm4wC/9NJK9VI6jAxyZ8m4WtiOMiKqTufIBDs6eldivMVsW4cexo0aX2gxbkSDK1eU8RDHOJYh6/nWntYXtnOpIUh69Ayr1fUa7E2l82eAtQ1fKyhkh9p4oU/GHahaj82BYS7PbZX0VbeegsgA8Jc9MZwzmASE9BAYBI0b2nQWaLNZC5lydxa8mbA5dmNGFBdKm5WisrJoR6Jf2sJgC8dEXNs/3U7q+kSZASKCz2plrZYTONQ323CwswBekTX5GB9Z9T9J69YYcOLMJZ5I/F2h+WbwKrMPCaAlAyfqY/Jm/r/GojUDOKSEVkHd54ZJnspVyAtKFEv3fjINJUGrWC3EvCxI+0kQgxea25plX1l1WShxDyFgw5TUyWCaU8NB330Qg9oipDGw8flRHUzpD56CAWp5mGGMrep5DH8WKpjAL32x+482XWZp/FyCf0etMmCRHNgoxMRYMvJnMKcR+m4LqvrztAb/iauF/SIM5l9MUgYxku3BzlCK0Se65w7C5G/tCbHK/BmgQGWqYjTfZ0ownVhQfWrr5iS3cslX8nx6y7Z3Omu7z5Y2jlXBwkXqjbHh4siGDOg=\"\r\n"  //rate key in hotel details
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		given()
		.contentType("application/json")
		.body(payload)
		
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/itineraries")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(200)
	
		 .log().all();

		
	}
	
	
	
	
	
	
	
	
	
	

}
