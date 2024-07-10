package RestAssuredTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class Test1 {
	
	@Test
	public void test1() {
	
	Response response=get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	}
	
	@Test
	public void test2() {
		baseURI ="https://reqres.in/api";
		given().get("/users?page=2").
		then().
		statusCode(200).
		body("data.id[1]",equalTo(8)).
		log().all();
		
		
		
		
	}
}	


