package commonFunctionPackage;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class API_Common_Function
{
	public static int res_statusCode(String baseURI,String requestbody,String resource) 
	 {
		

		RestAssured.baseURI=baseURI;	
		
		int statusCode=given().header("Content-type","application/json").body(requestbody).when().post(resource).then().extract().response().statusCode();
		
		return statusCode;
		}
			
		
			
		public static String responsebody(String baseURI,String resource,String requestBody) 
		{	                 
		
		RestAssured.baseURI=baseURI;
		
		String responseBody=given().header("Content-type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
		return responseBody;
	    }
}


