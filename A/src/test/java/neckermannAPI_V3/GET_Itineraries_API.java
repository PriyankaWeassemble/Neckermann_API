package neckermannAPI_V3;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class GET_Itineraries_API {
	
	
	//*****GET Itineraries for Package***********
	//use this  ( "departure": "LDY","destination": "S000000875")
	//from this we get the rates of the rooms and surety of the availability of the rooms
                       
	
	@Test (enabled=false)
	public  void getitenariesforpackage()
	{
		String payload="{\r\n"
				+ "  \"key\": \"DcM0hlFw3ObyEqYtq27hWCgjKbRwNK0RGQTHZcwR2JASra3ZLmeyZrMqyPcnjgMWQgvu2re32uHFhwWNOIL2NHqlI977TGdMH7ahs8vppv4CVtRd+bzHQe+78WRHlSGtcIV1PJ+Pg69GoMDkb5r5Qp8BRkD3VgsCQtVaKNhiiTHslFS0rNklp9DIIoQ7Lb+4oQPPhfYkYKQhBSK7XqgWQ4Z0uoc/2d6m1yfbCMWSi2creilBIxkTCwodsaWS6go9armvRRxOeeSQ74/WntYXDcFt/JY5WLX1h5GmAb+i0Y9BV6SV1IxJciB69icM79v1iWzQRwXgRb8v0+nXfR92/DbNsNoRCW60fz8GZe0iTeJdpoGpNL36hD3kt4VA5Z6v4kf3Ua7WiEFod5Qi2ux2lv68wCJ/zuMEAXq3oHTvgET2fsY+L2/dzpK+fnx7QbjEbnD+q/QqLOOcjN5V2+vlhjeUNIThUT8+wXFe90iH4vnGVcs32+2KeIFxPbLR2lb/tS1FXHx7o/Ngyk98mc3lhLpCKhpm374z4YNfKs6Xh8Ssse68y0WJJsoD0uSBl6vsAAJe5iAPX2l3XX5tgpcxEk1wfLCP2b8VzzlE5HeZRcvWisR1LzA5JfqyfOEfBYNKfR+fLlKo+pdbYta3plR5939A+TmvATWosglAarqzpZ2Iv7tRZsCqAwQtCuNM30OqCegfC7ezJJjgTFJyrcrClU7RD8Jq0/4xnZs3RSD6JDfdAOFJ8yES+MzS9UZL0eLK/j/UwSO7t4Wpi8g6xVwluUh8IBgglMSBo1Ye9GZEcPSCP6Q+Hm/us2n0hc1Mp3JkzrHYBTpzkmA6iL5qwM7oRV4g+Nahirg14izUtYlDZ5zmcDoQhV/USTTur3gijQK3UkE4XeL95gp4XakSztzpSgjJMPJ9zi4ZfP/CDLLHo6UdUkw9ATcRiiYI3gpA8CZ1G+KFBpq3yWz4ACaL16KQ28Cwre5GpzcdcR0KFdNCaA9/6PxAK2P7Gj7w+j1pMa4nLfVSdLFINx9pO0zA8azAbdTQ2/EGaF8mv5Tln6q2HIRk4J/ZRljV8Ie+5xeUf5VZR5Ru7wFwq4EKMbgRqP0pYSAqVenCu2SvHYuskwWN5q40T6BD9w3dZKp80qOcIXnY6dxJNWJQ5cFAEwwJwvhs8gmc57W35EJt8+1owEYdSC5QmbFZz9GSEu98GQARnCILtlL+kU6olMuD4MRm1qgr3QCvjlKAu6NEaflVVy4LaX9sgQrlQfgoC1ssKqOYDQz2UzIEmfGPTnkKNK8Co1PouVhPSnFmazdQW8SzPA86r6g=\",\r\n"  //package key in package enquiry
				+ "  \"rates\": [\r\n"
				+ "    {\r\n"
				+ "      \"key\": \"byKn5I3lUuaF1UCEaZv3J+zVKNKHTF7bj9X/tNU4CYX9Gcpij4E7p7A69KhuELw+f+AACrlOGhannaZBvOtHmtx1y7jyWa+u/ceW9MWJ4M1KWnWoXeFyBS+m1w+gLGutSrZ4GCzbSY3ooKZt6vATMmzqnL5jb1nP9ACharS0NCIAVXiG1Dza+PmQeOxmQiR92s1HYaTuVR8ZY5oeXI6tUO8idUHXTfHCg5FeJZr0dQz2HWC1jEXlKEqz4L+kJaelCeov1NnGDZyMUE9JWILEpZob5kn5bdWaN0QAFLqmMjDaMXViKwhUngkG7S8pFYuBKCfssAjopojEuScnEy7nwN4U2ED/NLFKlDgbfEKMQschY1Wt0lU4aKwzA7X8pzJZEY55MUtdDxrdyePfSwhyq8ek2T+Pwm5Xb5vdYvpNhEAa938Q6Ldr86uyW2mJU18nryYdCWD+4iPxrqUZcKceTleB1mZ2mp2ec8HYlp1uKKNXDJSRwUFJd/z0RyhSPea40bsNvWpuEY46I3PHfCrUWQOLw2qmgNPQKVr42wQPzea2OEjVQimvn+VW3ubbwEzmEHN2D17euh8YqX55nxcVPAATQtrnPgJz0bKZFgxJmcP+7w6WTi6h2+AeJZyTPf0zkEhJoPeDEWgFDe1SJNGKfEq1OpWwVAHnQkiw2JmYHS8MhDQft/RHIKX02os3NwrML7XQvpILdpiYcZBHn2WGeadCtfmlxffIqaHdveDsIQ69lKDgN86563iRHyrg+deWQiC/N5E/tRoJOWC4YxahKIbFcjT8iUwDR/yvFryNgKPw5sjSOTFlSh3UgnC7VgzIgsyGcE0vFhryZgtkz+4z/9UaOj98X4xg8czARyc7YQf/sFUtw9zvKYlceQd3bFGHSkqBFWa3LYWfe7K/yUikjmOiuXoFsdfkuv4/sR/8GReCrMjUAjZehWWAq39Gos7PV4aYks+j6DB0f9Jtj+SqppFMHtArpcgkl2ABrN8/zMMfdilHEnGYopdUs3rZbYrBxraVSpXRBbUTej6MwhsqJg==\"\r\n"   //rate key in package details
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"flightKey\": \"LfsW0gYpBTTw6s0/vxmWJGXhgq0qah9hL6bU2TBRrn9wdX1gxPQ+EYFW8mzYeDXQQpt4c9Ojv+5p11j1fRDRAsYfV8bI1o05xcB9dAEtm3s3v7jgETxAw7tgw6fxTEwyOswHqViWwikz5KzCfiZ8wYyz7bK1KlbFsqRiyr+xqs7VKZy1nT3NxzkIcGxW5gqLANVNpeW86t5KM2TMxzMs/HovbLazf+eCZnDy4B7Kc1l+MojNDhsRmimb8wKmN7BBOVsaqVm8+tW3uF5J13N8KsbQI98yeBQH4rtac9ineSYz3SbhXM/8vdCjEltDsnrtnuTlY5yB+gJ5ATdblRbEdHBG06HEwAFsO5tV0vfoj/+ZTJeqhzXbvigp+VH2P6sJEAcNX05S/nwhPHCo7ujDci9Pn3qndGP69tsbXCbYYWVSHgp+8fJ6rcZGUOIGgFmQq+6Yj8inS62e9kBR+6vrZuPzg3EwuLId/akpZB5xvfSabZtay0ChmmnqxGk+hlDl561b8YFtC/f9PEZdvJIbpJ+niiAME5cyu++O57yfsfR/yBxfMj1/JY+HAf4s+Xd6l3hEEAKw/ZKLhdm6HddFt3QVycCc58Fddfw3EYMUTOQK5PaQ3J8YJm6AKgG0etVUc0LHPkfPOTMkRAZnkJ+DruTAuIDkDRfAArAvaNry4jE2tTz5icTP6rXuiMMhWMAOw9w71BKf8zbhdgB/Dw/kuWwu+qsjGs0z5k+xJxSE1qI3V6L1GVbA2jTZxFlZ8vR0rgqIfqbBTCpseCwysaqd5MbvmyUcOpbOj4ZU7ir1G9UXkdUMwEhPYAWPtOIxZDRIBqRqgqCuDVP+knED6BuinacIKu93gz3UETkJUsR8CJ8VbFlHzMd5xUMsp0FO2zDyJg9dY6EW26uBnlLoCf+/Axjx89PDpxMceK1CFDatxzEDlMGMtKnafFcQDvKL/oiiog+REeJzy1nEFjFQSG4cx6h4wTEqaybhtkaTpZ7tRx/W8QenHZyYnh9dW2y2vdimtqNfRTHCEGrZecU3rxWXDr/xvchIWVbgDY1KtaTdRfCWMHlbkrdY4zZttjrMQHZIoH38ECHMqg7pQNTOVGITEK6tr6q/ULYamsEGTRovnKCGTUxSLj1CgaXAYAZtJnyF0f3nYbCD1Tv2wMl4H/WqHylIJUhD1Z8mBqUTNIi83FSx8BiHjMlilHMa1zoiaUraG+tQezwlMobq0R6q1FJOcb0Ln4LjUSw20ucKUlq61S18aHVTgw5LatXjsCDexsRIk5LKmEr+2jJtCYIiqc2gmMJpE3q+oiv3frquGypqh+H4Yf8QpWD114WgcrEC0B8+Is6rF3xMypgbtkOKm9fU/9onoCY/H0XEGhQebjo1SEegN96xZxpu2yqjFLs2/LJyoSw61JSlxkfzwTibubIO+7jYJ7XIPobj+p1hWGCfDNwhemiqPm8h5TWB8Zy6pV1Aqb8eJSpY/akk4XdPjk+xdJgkqEpwT33vw5UDeTFv/qL20BBUnu9Agzw0voFwbOk0w2Kg5tkx4Lk5ljK2v2vd4TSbtM3FGBGVpU6LRreIu3aMmzG3SP0NCBqUzaDeevo6u+pauMK+ENUQv7YqUT+riuxghdSnzq6GCy8sD0dv4v724sIdNiWc+dghqH9Myo6q\",\r\n"  //package enquiry
				+ "  \"journeys\": [\r\n"
				+ "    1,\r\n"                    //journey keys from package enquiry
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
	
	@Test //(enabled=false)
	public  void getitenariesforhotel()
	{
		String payload="{\r\n"
				+ "  \"key\": \"M+aZ6ma8tUkHS1hl4FgIMNB5RiwV2BdBCLQnoLRwFQg9DhAXVCoI4kt56zYTcILsot4TjT6n043ITr8F7wAJYXxoH6b9Ao8U+visjROEVgYtAsVcjSlykH1pegJzA+njDfVdsr0WXg3z/ksr/u0AGbVnSDlQA9ODI6eSZrzvKArKCnAKUV1SbRm2q4/4MYMHiJNssNOpz3ZUHw44A/6vT+GjNFUvPMIE6nmDVtWwOTgbm5x8/9+iWwLjicv6BPrOn0gHLC/E34b6zze1Q9wQGdHIaEX9aczjO/iVWq7HtWwguYrMfCT2ho3XCzlMA0mfFVtN5py5iWpEPHDNou5quu/9bj8PSGf3CL2m8k51smCl57aQy5SUP6I/is0VbC8qdliGVAerAcoqVfRXlZKsXCIlZWc6l9WWOyN8wP0VYZMASzri76vkyxFe0tzxji7K66c1RGvlWJ4MF3Gnwmo0wnSBB+z27rpv5WMTmPBAFX/sXswWLlVWekgpI/+G2SXCBM4bNWSdXVZiDN/4+jIlJRePEUSDyZ7C3wWUNTikQW/gnnTS0MYkBNIm/V3mg7PiIjDa5JOHKImIqkNIo175+SHIfkSdkkOtUT9ph9gPWof+nwrqAL9619IX3Xy35pL+OswslzN9N/7+czad/ygewY5xpcvfmUPj2TsbQBVlfdjk1k7rDCqNaT9x3SoYghe7FJUbf8yMptNNsgGE1oSO2eVbBJbw/ph4zJjT6skCJK2r78W6WMyhHO95X0jmm4tC12CcAw61kp4iX7lm53c6T25yK7y5GobVRx95jzTmqzX54Zwq7HELQgh61jjX6AhtlkYF7aAsLr4QUwOcrAje0Ah6vMFK8Buls5X6zfk4EKd0D6DkuZfoQrhRK/cBF4H/EILEgE+GnvzR6AxKoBPENMNigxvIOiRQBCz1St+Yp3UC2nEREG20wGX2pnU81v4UtsG+PE67uRmUJPUjpVmEUCyUZh9EkbXiKbJbeVzebhpCdjTNVCQagxuf7qSvmAhJ+TFlWlveTMIkshdeeu01EBAPU9Fwyj1yXO73uMrvsHzwwe01wD+rBxs4w030V3VU2nklWarSsxXEF8VRd7Fzkd5kNCVPkLD9LE+yQ1+E57yLC++OXnqVvjM2xI98TC/MZrKG7uGrjxn2vmU0aEfvNPjNOLQg0qWfOKw8gbiOVfbXHw2+uNOhOg5zGO7tjGgbC44aYieoHVglrxf2IEevwBU6n2TCZhidIAHNXTimM0X6CZ6svMBJ7jALoKNyvKp4LMCs5jJy5IWUlcFoUXiFQU/zsIbz0b+3EKhCeOCKy7W9hr4jDqBdqA2CIpOHZsCOojWMucWIJpD8XaB0h+inlce42+FQxDM6wdvUsL1MhvLQioyZGj2V0NCKDJBlJyIGEhMjjl4+3IHAzkBX98w7l8Gk20mZO1KpuKYoiOzydW+FlKhQPTPbLLaIjELZEEGRnRZVEV8GQtAhp2No/iNzI4MjiDWQo4PAz0e8HUywKG9OAqPVBfpUvoA7XnarQ7CY5+I+HcoApRKV+jeelNex22WvFYXvox7AO+8FJww4N5DrmRQ48AeURKnabhDVpfiLmbgiQt0l4pPg34Apaajz1NCDHQkow20+MVyyNNfHST6OXfrFzGJ+u+VxLpS7SqTYRNKmPdKa6wFknl50hh4KYmJyYFql+cxj6TC7aqaCRMUWnFmgx4PdBDSuH59JRlwwD6jeNd77xl5Z24rVn5MvlwuB/z7sfZ+nUMiZH6lrkhuyTiphE6ZEe9nh22zEXQBh\",\r\n"  //package key in hotel enquiry
				+ "  \"rates\": [\r\n"
				+ "    {\r\n"
				+ "      \"key\": \"PMdRWqPOI6LUIEgFc44jcthwUHbJxd+6lLwCNWvvobRN9DaQpvvI8kF+tpWoLMu/lwJ9xSUsJfEweuHmZjh+OFEcGbWVeLRW74T6vVgbKjRTwuZDQq3TL8CV3wzMn/A22CkMKZj7Q1J0/fa3GBpQSI1E7VV27coQv/ffyXi3eMEqQvz6aI8JJaR/aQek184VmO+6G1DajX2at9oEGAetwuGfcgWeGUdPIPCo+tvjooiwGBvNJbkr1J4kThJeaa9+lnUVzHwc8GIU39U0oDUpGF8nnCO+6hUy2RQtBl5iDk1UeyamDBwprHFBR09UUyE1uCnmEsWPOPD/PhAVDENCsfoXdtzdVrYuLgg85LGIynNQ5Lbf62swnUuyI4kK81ddHIHFKExdRkPn8xvcYUUW7hpdC5i0MI05W6tL5QSTsezrnyB/mh1AHQx2xmOlm51rhMgNNegAtNZws6T0Hf66J9KLfj7/ay9GeaEiQXlthAXPpxQxcIT/Ln1XsnCGmSmleykSNjyYzG/ayolYqIlM1Q3mfczf4gDCfiiR4wTOUiSphmdq53yz8Ltb6TIHysYkHlb68KaULnokuPkTngI/H4/ij1xECzrmDWN0TRW3r0SSWxou5mQefbd6JbU9/m8OEPqIIvknjQer/X8rBVpfKE8u+Nr646Q5wc/lbNmpGpJwGA1TSL+eClCCFomczHjHmfJaXCtFRwAr6AK1JrRuHhRBqfiWu55p/lkbPnnVdmMsaRjN3WelORcF5hJVTly2sebNjTqqV9yf3BmYZvG2vzuijLNmL20Y0aoWmXg8u+LmvBrwv2NqwMLUmN9w3y72mlLMycUBJ++W5vVUKUMpYQEf90YjNpM6oL8ysnBEZ+2kYkmHTszvH6eIm5NMpzlTBgyoz+vD91CjU64W7zrMVQwq/lCSqugaYk8iLVCwN7mMOHMWbD7TPtdGFz2AblGYtgvTqD+nu/V10cWOHAyrijL+NHQaKQsf+/dCOAvBKmiJFqrD0vHu/V3Y70uzwabw7Avi61mzdATj1oGL5AMtjO2EOcQDzWNFH7oyN3Bh3p84tr3UUuBGl5KJcUheqnTW/x2Zi4AaFpdAsCl4Fj4DdBoeOGpUFvI25EaUs/Hrm08Hzluwx6DKCdQw5qFtliTV8YaWICQttheNeK5tDERMxQutWoXecs4AsEuHZf28gsd/zS8OtCtnUPV0BI54RSi2\"\r\n"  //rate key in hotel details
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
