package upskill.api.restassured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.io.File;

public class UserRestAssuredActions {
	
	public void createUser() {
		
		given().
		    body(new File(System.getProperty("user.dir")
		    +"/src/test/resource/ApiRequestPayloads/2CreateUserRequest.json")).
		when().
		header("Content-Type", "application/json").
		    post("https://petstore.swagger.io/v2/user").
		    
		then().
		    log().body().
		and().
		    assertThat().statusCode(200).
		and().
		    body(matchesJsonSchema(new File(System.getProperty("user.dir")
		    		+"/src/test/resource/ApiResponseSchemas/2CreateUserResponse.json")));
		    
		 
	}
	
	public void getUser() {
		
		given().
	    when().
		header("Content-Type", "application/json").
	    get("https://petstore.swagger.io/v2/user/Sun").
	then().
	    log().body().
	and().
	    assertThat().statusCode(200).
	and().
	    body(matchesJsonSchema(new File(System.getProperty("user.dir") 
	    		+"/src/test/resource/ApiResponseSchemas/2GetUserResponse.json")));
		
	}
	public void updateUser() {
		given().
	    body(new File(System.getProperty("user.dir")
	    		+"/src/test/resource/ApiRequestPayloads/2UpdateUserRequest.json")).
	when().
	header("Content-Type", "application/json").
	    put("https://petstore.swagger.io/v2/user/Sun").
	then().
	    log().body().
	and().
	    assertThat().statusCode(200).
	and().
	 body(matchesJsonSchema(new File(System.getProperty("user.dir") 
	    		+"/src/test/resource/ApiResponseSchemas/2UpdateUserResponse.json")));
		
	}
	
	
	public void deleteUser() {
		given().
	    
	when().
	header("Content-Type", "application/json").
	    delete("https://petstore.swagger.io/v2/user/Sun").
	then().
	    log().body().
	and().
	    assertThat().statusCode(200).
	and().
	 body(matchesJsonSchema(new File(System.getProperty("user.dir") 
	    		+"/src/test/resource/ApiResponseSchemas/2DeleteUserResponse.json")));
		
	}

}
