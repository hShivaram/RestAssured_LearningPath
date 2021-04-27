package sample.APITest.restAssuredPractice;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
 

public class APITests 
{
 
	JdbcConnection jD = new JdbcConnection();
  
    @Test
    public void getCategories() {
    	
    	String endpoint = "http://localhost:3306/api_testing/category/read.php";
    	
    	var response = given().when().get(endpoint).then();
    	
    }
    
    @Test
    public void getProducts() {
    	String endpoint = "http://localhost:3306/api_testing/product/read.php";
    	
    	var response = 
    			given().
    			    queryParam("id", 2).
    			when().
    				get(endpoint).
    			then();
    	
    }
}
