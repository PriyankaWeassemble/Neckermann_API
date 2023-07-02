package neckermannAPI_V3;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class GET_Selected_Flight_Alternate_Flight {
	
	@Test
	public  void postmethod()
	{
		String payload= "{\r\n"
				+ "  \"packageKey\": \"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\",\r\n"
				+ "  \"flightKeys\": [\r\n"
				+ "    \"1vegjZcaSU/yI+DvZcCpBLi95yHbhKcK19bnBcp7oWJwmC14E9PIuSXsOhNlJuNXabh7XmhOW7v/NmLCW66j02hVmAk4xNBBPs/R/5UXpH9eOYbZoqoR0ZvbXWe0CheZIlziDQlBb4hn9gSJttLhMrwWw2uXCF4uB/nOVPuz2zfseMlthwEuXpCCBW3XEY5P0uZF1teNr7g1pN6ZW0lzyIDLx9fCDl584ui+WyE+ORXA7nNUOPIh2Ep7ln6unYK+SycDTXYEzZS126WylflX4Q2MdgJ5kDFJToMzkII6nKgCqq8WxREaCPDtcdhMzkKHUVuWnvU3azfmy0JN+DJU7YCwzBZ5cw174Ykc5yb3waTJg90B3d7odAmUyI/lj7gkQ3UzJu6sQw/0NAJmYyAEgYUQJjnpv8aJP0a4gsJV6CznWSoPilfNbgO49wDYgwsevD1Rioo/u4y2yYn+xiW8Hgy4Q/mIK5ECXL9cfcX7CZz7zqXw03FA7a18guvGRNpRbLyX0ehykc7AG0Ka0XiixSqkHk+AstiPFcISBPEY222gTE+kSvX58uBeuaWBaWHwaGzDtdHXSpsxRIqMV8/nEcRmRaCQoKUQ4vKrawN71ATXLdXD7g3tFTleUjCnb6lIMbwoLo8C1DkOtz9C1mBNHiyMZQAluiU6rf0rg305T2jgDKolZAmr19DnyylwzLPZmFymf9yT5F56hxVuuKSUR2aI+lnBbOBUlznzfQDK8qkmqVJhzH83IeZbfQdm8dli/ojgIyVIMbFVmy61pITDib2EOfl1E8Uou5te8roeo9poEt/pnOBPGwVTbB1LAd73uoRD9aFzsmjmkb8VP7ZLGHwwb33c5Tu2zNzeQj0bvJNPQt/mc14H+JJZgpdX4DnQXV5BvGws1eR6DFxQzc+kcknKiV2X49lHvGCMocnpS+feG5IIOglIpKhfTJL9giCEIkXE2Av+EDaTqJ5kUHV56YoCSuJiUkxc9IcjVMXuntidgo+hs7UO4tkGrrDIrP4Zb0QCbbO2kcvqlzaorIVJ+47ceOMz1h02sEEcM19AAWYzOLZc6Ya2EQGX3/0xoSNL84ncIVL7Oe9DWmBgC06KapD6cGbfVqAvU9B3M4KTAPW4lWV2KNoa/iGQXZH3NEoX4qTM3Ay6dF5fliY6heYbApnNJkETlf4dahZHI1I+Q/gEExuax2y9b6cfKBXyAQlIPQfQPc3G9/vgU/wS1J6XW0xFwX4dT05aDDgRjRqBrq8RuNYKPfG64BmBJ0GZmX/+x/V8MvxJlcN8JlPEp52K2eRKdz3C/JWk7wsdXYYeuRvcnNPPwu7aaCGTXZ2WYJewed8PiXg1fNH1MaTISAVLyYExgiAz2TCNm4+gHjW3Af94WiwdgAOG2oJZNdj4geFlWFqOTIUZ3WnvQXrwF888eT6M77DGnyM+DWUMoQp6gD/MFNN+VTNXXaFdOuI5bnDdaJzAa+9sCoBex66V42FCsPOkqu+FRMUfpBEOsWPgTiYXy5ULk5QlFROQOXXqUz3kjPPNkvq96n+G5l1Rm9solLKCBsIKA67VSqLLQAqz6IE=\",\r\n"
				+ "    \"RA51/wCBlQHf+eIGNdeewD9YgMOsOI9C2AQpe0KITfkJmFZKCI2LM1LnwpRsPb8h68r3PIqETNAX1wheP8U91vuCD/9J/w+vlk9lscUW3QGC3gf1wDvGcxXienxV+EiSH1GRtp0rDl0s4dzqDHWEzG7DAQvUrGsSbLg4sDW7Bk/Dl9m9NPB4a2VWlYqbSsFAVWxFqaPy29nAXmaXzUfJJc0poi0kASlEbump+Mhr/S5jbDG7TVn4JYBkeBXY9piqoWl5Q3/wHlsef/hfL1AwglPcA8kskt681xsVM9MsRP17z9MXsKstITA636rws+4QJ6UhFvLJMAkXulYhc1t479OLHHMVzWE7Y046A7nlYBTwWoXVc/uHGDH91yNSgzhtCXIKzIBdo6kYaDpQ5gFd0eJ5rtjEFWUuRopyC6kqFdztNcfmVW69cur8LjWzTUYF3Z8wdlROT1ImD6ND+srpDxZSImL+tAMTTJdGlS+HK1i3RfkMaOo2iqaa4elIs150oaMzwcQubyNuBgE+FulmDDiWe925208KbeTNHUXVEUAFJAlxhBIPzMwqKO+VA10qUHNqiBNVVDb7SO1JOYUq99+xCP7BD/VgZzQCI8pbIJhJasEh7PDgDamk6ftaTSl8VD8i3CA6BdPHYL15mCj/iopm5L1kPtjqOtfXkc4YAdFyefwuXtL4WlGuIBgxrfxGF04NQ6MWdcs0dJAQDc+ACigaDwnm88rGZZJKJgfqGZWrEuSHU5EX5ot5eW016zbkfJlQbATYzpc4QbfDMNqngOMGRHlct0O4dqb7VNbxLoVMoA4FJFn3ayvfDSU3UKviYr5tXKsExk6d/QQ82IzwB/1hNUN+xntxPY9ld/LVEsPgj/9/gw6R0cxlzzvOrxe5LzgW6WUmXFPXtwcsO8WLHX2QksvWkgGo4jL30+wb1Obj+bbcKMcM7WGmmnhRrWEZIHimSMGWxiTgxFZyk7JLr5vhA+BSU5QSP57lrT8uBsnlNilHA7hI0DZz2SY2/n7jMw2qxbnhdqRQCuaH3Vow7U5Ki8WZ+xp+xWZkLc79eFutgI7OjoMFmT7nyg99eg4HDiS0PHkA554DY4DPUPcq+K+G8zwey1qDttFhr2b06gSYL7tVsL2tJLL57enWsbsxPElKaPp1CLWyOGWm5uAMTM++pocLzxQI0LRQf092ilv/nClKUUFGgSbGpDY4hIW0cwlhz7CaDDCe2kCqu+NF76ZxtRNyWYFI26GwT7xD2tV0MU2NU78Xz3RtogC8R4kGBm8RQvyCdfjS9gqRXWGqtqaMxihsRnCU1krsPDU6BEeepRs/6vaR2evRVkglcAOWZIJVGzgHkaAxlA8YC/W8w3oX3m0hZU4iG8dEax05opd3UK4bpf27yuBGfooKsc7aOzECnCXnLvJBupfe72GK9mDWP6p2nMYyT6ugUNeArM9sajpts/hBNk+tfUpp0575BUfnxi3oQj2w+wbAZC4RwxAdyJVxQbHfLjth+VGSnAx7gXv9b+LUUcO2iHkgYl6q0uy5tsAnUCQHzz0qmkNmdQ==\"\r\n"
//				+ "    \"LfsW0gYpBTTw6s0/vxmWJILChGgfNnJvlSTEu4v4vzT5kvrsVTDoXZ4sgvVsrAhAIYBO3xYyFDzjBZHXyNutOe/tWSixYeiknRxV5uRC0bZkEIdCDMrZ8Uq+TgWH7f3BweaJGhLwt5elsOaoiw7L9uzXEQ4wiGv/7DvuBshQZTclapHJdxClWPv521wXIqxnaYrj9DUFkuEKjynqReBFU/j9Ri7h6uSljEfaCKIW6918LglWdGSL1Dc4AT6ZC5guh0Fw5pFm6fCISpC8MdL5E3m/zVTIXrMwhEycl6HFFFo2frsHmQbpaX9DTMDur6u7JxTQaVA+Fy6Lk5RPqOsHhijTRbTWevIRjefT3T3zzY+z+w5qoYAQkbDswYAYGU6bJRD3akDw+XMAt/b7MEmIIugMjNocDtYUi3cY7cVIEqkvqM2GVn4A0zvRAm+OU8lY297yFmwp1o1kYEpSxYDAMhJ2dRCQJYjS0YbOmnmGBuwMbDMbJBKxcHuKWNfYGN6rnJQhaUONwBJRtFjQlcaZkvAChy8tqRzauTG/OK5VdpiF6IjHEQOJJlckC8/RbTh7c8INWHA93Xk6Oh8fPYBBo6CEiprnXZyE/O1RHZL6mUUuGObzin205ThpHAWbvV3Ka143hJgEw4JlzkzkUJGNlIMphI33dfRQ605WaMiXUi9ttZILYUuI2DN6YrCimXU1YEVcfes1fe0sWKl10WOLmFcZZAsUjDJic0uQQ6o9HF3bmTJQfa3WKDypNjT0DoWeRzfe/v1CUDwJoADNiX2gZ8SkqrrC6asD8ONatZfhZHludmZH/CyEaKUANuVemWI219XVIrOAWRSvaYJzpRbepKow6QN6mLP/31OF/Qzrm7AXx2pYGFip4WR8xvxE4KT4a2aGbeSyytJk4d1O7w6nQZuJ0AlqZl3mLWG6F7MyDFtRVB8incP0AtEA73U9o6UeIRF//lLLeeVHrC5pIpwEQ2wd7mNCzwIVy5yY6yyjwpwpl5q1Hb42GfrXE7PJTPh6Fw8tMxcFhnKCcDpO/+ZEnndW8B/MYBwHzdjNqRN1c9tMDPVRAC5VWUtOvQrPJcJoMxNhds5EUPdHlMPLpBVFFhVCSVJc0okW3arvY2W8ZqXQup2EuqRlMuKPuQIXNsc/8ELwcTSimMySzEBI+mJh+YdvqYiaBu7eiPa9HOSGQ6UVMPEeq0RMG9jXdSPHG4xNA0dH6XmiyNMCLlGBnY50/mvvUGVMrL7AecUS60biBX25c5uZr7nl7uZnu7xxJftzyXqVZ7N6gbYY5I6Jj2/qrACjVTnHr0nCACKXcExn937Nzp08LepGV8y0Qqt0ALU+Edj8pQhQprbOGhz1mS3lyi4ud1qO/UExd70J0bLC1q360oN0e+sUT9k7LA++F2RGKM5QGDPUUFCQAzuvIkQ5Qez+k8Tuuu8wK7Tf3BKrX0mOqdwbat3LnIk62rfCfWzC3qRNIL0VNaK4W8hbUgRIdh5CUlda38y6YNETGFFjXei1xKdzJmpsfp0MiPE6fw5XlkkL2S5myc/wCoyL4XTCCuv8ygAGO6Zkqo4MwDArJy+5qqF6aXHZG1Xq7l6cE9AH\",\r\n"
//				+ "    \"74g3xjvYFKYcm8IGabYFQkwBhs6CAE2evwadHliAgrR1k435MwtZvoBPJ4hDiShHhfUyfKTWQFBUqXovAVviW0R/Q3QCbRL2N3ARzM35ebMTfuNIV7evZMshcskaF83FsGZgCe+b7JDyuQOKCWe5GD7PVGZKlSBSrKPyHVL97w55Sif5zetcxzPyz5QdaqknnKeX0nBFzLgZaA4cTwWer5qQwIq5n8ES7YpghRDpfB+Bpk6ZITKvrSmihwFzNe0KAS1e48wFueTQ3B6dEAyNsskow2LewfW1h9ul39Zv2CoMW6QiIpihKbK0SfcnS76+R+DPbg16B0jwmMor7j/ECOAZrdOLAF5qWkkOk4sB/jUkBzS9O/lXLDA33iVFiNwyhWxmGx4JDdkQ2CTtzdcHV8P7QWu6F4JJhnGJrsceVbsb7icledchiSxy+TL2mIWCO/TTPb7mEKox1DuR2j+AmiRCuZC1X0dF1ekOOoO0MT4+urxsl8BdrUj9ydIBMr93f0WzYxzJAaAXh1ST2p8tBkCJbW8K7n05OTANe7kB8+6/1DSqzQngl2vD6gtlzNfnF5hphiFOxIYeQHOIUI6MJOOCN7Kx6tyjMQcI2YM/HcbBKZNNQiz8naJHtoJYBcD5+RR9dgX2fl0PcF3d66FWSJ9CiPFfqe+LGQYUNXauGjQn4RrTVpUXeO0hJ/0GhFpGYsjEXUG2SH5AfF/j2ZTFoZ+VBV3talnW5KF7X7A67/+j5hMXeyLo9Fme1ZFJQwiINjU7AHxxw6LF9Gek47e+x8yg5risjLBWParc37hmQyzOClBl1xj5y3ADiQwyjZQFdhu+9vaxKpNzuui1wv0uKNwMazLkEEQSBYK7VArELC3aSUQN2CuhfoKBFHi8zzxzBn/0mT9l9JISWiwd2mP1Ob7c72ZrYfVxG6jE9P2HfS9zH2juW8pN1G54MPIz63wnlEG/vBXGlg09uElI0Iyd2WYjGhAp+TCBt0k6zgN3IkKPTcc1nNBgeCj29Sj19Wzo0G8/Md/WrMLcnPVg33QJ1DCs7qDfD/K4vZMzy9+1cDSFQ+iFdlOQsjz83CtGtdAKUERFTkLP2FypJuBuCCDa6FdY2c/mnrRU/fBoF9NOuT30UymV1jzgOo62JqNSGZhUY9ivRSn3Qr7nQ13yS+81yRiP2NvrArg00cj4T35/Ci2Oy23TILxnS+ZxcPPMS3BUkgRnTOCmy3ZgjkSdHg8Ys6W3seTqNShC9k1r7OKLVAzJPS8DT101rqf9pUfNiu6Ra9EaiICRDzaaJhD+2nA6i+U+DlARFg2EB5bhAKjuc3DRA322xr6B4oCxS4lGZn0sU7+wwykYkDqeEl4P1HMF2xW8N115f+oCdsbqMH2DEomyGgklht5f1Oy8kERGHRWCtrcFKwJgV1vrP6+SqRiuXcUiTJNRw+yV5ItwGMuU4mqWRMYhSQdxCFydvkXeewC8Aj35jOINLlfFV9X8LgfIubR0nBpmPuOF7jACrRaP87o=\",\r\n"
//				+ "    \"moZCqyFwrVtYOuMNqkfk615MRtv9X1ivpKI6ypfVGVzNo1Bs8DifwA4FsrRvXdRf8Sqy+J/ZRjXUTnEwtK80zrXHfrFq3x5+ZpCGJ1Wxs7s+doA463+pEqPjNiEFrBD0Hu/I3IE5W6r7/sBu2qphpw386+POCUy9xoCmOISq+tj7I8duYs71u4/Y8jOsB7Z6YijWSOOfbjZDHCVeII3vVFaFXKhbO9w9zOOkoi3uuNEXqiUAEJJ6xYa6gQtVS8KbjqfwtoADeNQlJAUkzOof0XyzFmOyG2bwQGnbkTP26wX9+Uywq/wuqBgiICjHfoYnah/fQhFwvN0Y1rHOqMeAa8bYp3bYlSq8zo+zmGcCbnE9BCrQqFQvjIl3HwGc6dOTrvIdTZdFTjxg9MIt0jzvxGlceESPOkLGwPvqQyDYXcEabTlLA+2qjIf7FsMihdntMqOxuYbCcSA1MwLWUKdwej9q1w6Fqs69qUpua0Rt1HxBrOzOVcxY9EFIojJidxmHHnLpydqzc721uQguYdcxytTMp5ehMCzYcf3wBmysXxwNKFpUsY2KsG82E+x1b+JmRpZJgf5ZovjfewdljrDBQ1VyWfQZd0Yw2kf2yNSf/DTh6SkICa0D5F6Xm2pRC6Bg9+BNny+TCizirZzVB24Bovi0QGnzxdtT75D/x+v/6PSjWMbgRq9w7q6dVEyfoDoZJ9L3MVkqDTGqWp/5Do2wuAWxvDv2zUbzCKTqAKzLzLLfq0U3qRfxy9ACv0jNWM8kZ6/uFl4aY9bgxvCo7TuNZglPGf6jkoKieIx/BrxEj0YipPpT0HN9oqxXUj7k3yr4U7dv59/lxDbHw82nf8m3trFJi5D2R7k/yxC1ob6mFKYLQzmcpcMtf4mZlPsTd+que7WTzv+303yUoxczFG0gMGsOeSCSkhCkIOIN7lLbKc+bBQgrQd9ZkWbS4fjwLcQOQ40/+7zLeDYagVsbcfkP6pDK0FGgjb+JTLNws17Rm4HKv/ENo2AXZWTMm85tDRt74MHJyIcCR2ten5kieA0Gf0m/qA4XtcMTly6CdWdBwOAHNc7hxWIdpK2unX7MWfMK/5WiUkmhxqKm/uderpHOhcyCauHDkOaoInAWJfLc1BXl9Mm1K+Ok/jahfRv8yhC7xk+ETx79Dn8io6/6Q+tlKYgtV2ABHpUbk5GD4CfwMyXjlku3trVXEWzRi6/UbkDxXA1GdPFBhlEAqTauQ8BdvTjoTU822mF/PPzloeSH97eqeIVNmkTn4NJnHScWLD1ZZY9Cbrm4Tj84hC0I55YGDVaKD+GqVlwONBaddV5tlzBMEleto+TBYFmABPMntEHPVXIqrgqocKLLwr2+n43pXFB3H4u2USnQZ4FZyl637K27rm1+UEO0hprzZTRzNi6R/CETkljwhvcu56safxERGkSZm004Z/bqlj+p61JOmdz+OWhh2mWRCWI4qTFESP12YN1kPtDj6+W7LDPvcrMeirlbdF/KSKb+QY5MKX1Y+ecWUXaIVhd8t7BQgcv2/X/+cs5XJF83tejnN6e6TlGC7d/3VcqEY7MTk8IbZls2yyawQiykznHH3tchMgdW4baH2Bt0MBroMCik8khkajSGAd2NmFg19OlssznJnOdIQ9FjhjHR5DOQLE0do0GMI9RS8bxpO/Q7RFvE+2HW51KmHZgAJM7CLft7sTYPlsJO1clTtxD/G8VYxveNoQj9qhaDPol8SkLf272zkUhgkN3QbQ==\"\r\n"
				+ "  ]\r\n"
				+ "}";
		given()
		.contentType("application/json")
		.body(payload)
		
		.when()
		.post("https://apidev.neckermanntravel.co.uk/package-flight-rates")
		
		
		 .then()
		 .log().ifError() //for getting the error message
		 .statusCode(200)
	
		 .log().all();

		
	}
	
//	@Test
//	public  void postmethod()
//	{
//		String payload= "{\r\n"
//				+ "  \"packageKey\": \"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\",\r\n"
//				+ "  \"abc\": \"dcscdscdcdscdc\",\r\n"
//				+ "  \"flightKeys\": [\r\n"
//				+ "    \"RA51/wCBlQHf+eIGNdeewD9YgMOsOI9C2AQpe0KITfkJmFZKCI2LM1LnwpRsPb8h68r3PIqETNAX1wheP8U91vuCD/9J/w+vlk9lscUW3QGC3gf1wDvGcxXienxV+EiSH1GRtp0rDl0s4dzqDHWEzG7DAQvUrGsSbLg4sDW7Bk/Dl9m9NPB4a2VWlYqbSsFAVWxFqaPy29nAXmaXzUfJJc0poi0kASlEbump+Mhr/S5jbDG7TVn4JYBkeBXY9piqoWl5Q3/wHlsef/hfL1AwglPcA8kskt681xsVM9MsRP17z9MXsKstITA636rws+4QJ6UhFvLJMAkXulYhc1t479OLHHMVzWE7Y046A7nlYBTwWoXVc/uHGDH91yNSgzhtCXIKzIBdo6kYaDpQ5gFd0eJ5rtjEFWUuRopyC6kqFdztNcfmVW69cur8LjWzTUYF3Z8wdlROT1ImD6ND+srpDxZSImL+tAMTTJdGlS+HK1i3RfkMaOo2iqaa4elIs150oaMzwcQubyNuBgE+FulmDDiWe925208KbeTNHUXVEUAFJAlxhBIPzMwqKO+VA10qUHNqiBNVVDb7SO1JOYUq99+xCP7BD/VgZzQCI8pbIJhJasEh7PDgDamk6ftaTSl8VD8i3CA6BdPHYL15mCj/iopm5L1kPtjqOtfXkc4YAdFyefwuXtL4WlGuIBgxrfxGF04NQ6MWdcs0dJAQDc+ACigaDwnm88rGZZJKJgfqGZWrEuSHU5EX5ot5eW016zbkfJlQbATYzpc4QbfDMNqngOMGRHlct0O4dqb7VNbxLoVMoA4FJFn3ayvfDSU3UKviYr5tXKsExk6d/QQ82IzwB/1hNUN+xntxPY9ld/LVEsPgj/9/gw6R0cxlzzvOrxe5LzgW6WUmXFPXtwcsO8WLHX2QksvWkgGo4jL30+wb1Obj+bbcKMcM7WGmmnhRrWEZIHimSMGWxiTgxFZyk7JLr5vhA+BSU5QSP57lrT8uBsnlNilHA7hI0DZz2SY2/n7jMw2qxbnhdqRQCuaH3Vow7U5Ki8WZ+xp+xWZkLc79eFutgI7OjoMFmT7nyg99eg4HDiS0PHkA554DY4DPUPcq+K+G8zwey1qDttFhr2b06gSYL7tVsL2tJLL57enWsbsxPElKaPp1CLWyOGWm5uAMTM++pocLzxQI0LRQf092ilv/nClKUUFGgSbGpDY4hIW0cwlhz7CaDDCe2kCqu+NF76ZxtRNyWYFI26GwT7xD2tV0MU2NU78Xz3RtogC8R4kGBm8RQvyCdfjS9gqRXWGqtqaMxihsRnCU1krsPDU6BEeepRs/6vaR2evRVkglcAOWZIJVGzgHkaAxlA8YC/W8w3oX3m0hZU4iG8dEax05opd3UK4bpf27yuBGfooKsc7aOzECnCXnLvJBupfe72GK9mDWP6p2nMYyT6ugUNeArM9sajpts/hBNk+tfUpp0575BUfnxi3oQj2w+wbAZC4RwxAdyJVxQbHfLjth+VGSnAx7gXv9b+LUUcO2iHkgYl6q0uy5tsAnUCQHzz0qmkNmdQ==\"\r\n"
//				+ "  ]\r\n"
//				+ "}";
//		given()
//		.contentType("application/json")
//		.body(payload)
//		
//		.when()
//		.post("https://apidev.neckermanntravel.co.uk/package-flight-rates")
//		
//		
//		 .then()
//		 .log().ifError() //for getting the error message
//		 .statusCode(200)
//	
//		 .log().all();
//
//		
//	}
	
	
	
	
	
	

}