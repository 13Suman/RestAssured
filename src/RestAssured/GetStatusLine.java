package RestAssured;


import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetStatusLine {
	
	@Test
	public void getWeatherStatusLine() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest= RestAssured.given();
		Response response= httpRequest.get("/Hyderabad");
		String statusLine=response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK", "Correct status code returned");
	}

}
