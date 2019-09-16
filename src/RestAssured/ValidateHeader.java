package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.xsom.impl.RestrictionSimpleTypeImpl;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateHeader {
	
	@Test
	public void validateAllHeaders() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest= RestAssured.given();
		Response response= httpRequest.get("/Hyderabad");
		
		String contentType= response.header("Content-Type");
		Assert.assertEquals(contentType , "application/json");
		
	}
	
	

}
