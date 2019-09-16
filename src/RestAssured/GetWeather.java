package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWeather {
	
	@Test
	public void getWeather(){
		
		RestAssured.baseURI= "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response= httpRequest.get("/Hyderabad");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200, "Correct status code returned");
		
	}

}
