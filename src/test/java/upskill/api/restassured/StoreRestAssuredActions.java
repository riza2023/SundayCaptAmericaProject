package upskill.api.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class StoreRestAssuredActions {
	
	public void createstore() {
		given().
	    body(new File(System.getProperty("user.dir")
	    +"/src/test/resource/ApiRequestPayloads/3CreateStoreRequest.json")).
	when().
	header("Content-Type", "application/json").
	    post("https://petstore.swagger.io/v2/store/order").
	    
	then().
	    log().body().
	and().
	    assertThat().statusCode(200).
	and().
	    body(matchesJsonSchema(new File(System.getProperty("user.dir")
	    		+"/src/test/resource/ApiResponseSchemas/3CreateStoreResponse.json")));
	   	 
}
	 public void getstore() {
    	given().
	    
	when().
	header("Content-Type", "application/json").
	    get("https://petstore.swagger.io/v2/store/order/5").
	    
	then().
	    log().body().
	and().
	    assertThat().statusCode(200).
	and().
	    body(matchesJsonSchema(new File(System.getProperty("user.dir")
	    		+"/src/test/resource/ApiResponseSchemas/3GetStoreResponse.json")));
			}
    public void deletestore() {
    	
    	given().
	  
	when().
	header("Content-Type", "application/json").
	    delete("https://petstore.swagger.io/v2/store/order/5").
	    
	then().
	    log().body().
	and().
	    assertThat().statusCode(200).
	and().
	    body(matchesJsonSchema(new File(System.getProperty("user.dir")
	    		+"/src/test/resource/ApiResponseSchemas/3DeleteStoreResponse.json")));
	
}
	
	}
	
