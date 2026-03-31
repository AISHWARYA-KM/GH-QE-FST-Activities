package RESTAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Activity3 {

    public static long petId;

    @Test(priority = 1)
    public void addNewPetWithoutId() {

        System.out.println("Creating new pet");

        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("name", "Riley");
        reqBody.put("status", "alive");

        System.out.println("Sending POST request with body: " + reqBody);

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .body(reqBody)
                .when()
                .post();

        response.prettyPrint();

        petId = response.jsonPath().getLong("id");
        System.out.println("Pet created successfully with ID: " + petId);

        response.then().statusCode(200);
    }

    @Test(priority = 2)
    public void getPetDetails() {

        System.out.println("START: Fetching pet details");
        System.out.println("Fetching details for Pet ID: " + petId);

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .pathParam("petId", petId)
                .when()
                .get("/{petId}");

        response.prettyPrint();

        System.out.println("Pet details retrieved successfully");

        response.then().statusCode(200);
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 3)
    public void updatePetStatus() {

        System.out.println("===== START: Updating pet status =====");
        System.out.println("Updating Pet ID: " + petId + " to status = sold");

        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", petId);
        reqBody.put("name", "Riley");
        reqBody.put("status", "sold");

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .body(reqBody)
                .when()
                .put();

        response.prettyPrint();

        System.out.println("Pet status updated successfully");

        response.then().statusCode(200);
        response.then().body("status", equalTo("sold"));
    }

    @Test(priority = 4)
    public void verifyUpdatedPetStatus() {

        System.out.println("===== START: Verifying updated status =====");

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .pathParam("petId", petId)
                .when()
                .get("/{petId}");

        response.prettyPrint();

        System.out.println("Verifying status is 'sold'");

        response.then().statusCode(200);
        response.then().body("status", equalTo("sold"));
    }

    @Test(priority = 5)
    public void deletePet() {

        System.out.println("===== START: Deleting pet =====");
        System.out.println("Deleting Pet ID: " + petId);

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .pathParam("petId", petId)
                .when()
                .delete("/{petId}");

        response.prettyPrint();

        System.out.println("Pet deleted successfully");

        response.then().statusCode(200);
    }

    @Test(priority = 6)
    public void verifyPetNotFound() {

        System.out.println("===== START: Verifying pet deletion =====");

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .pathParam("petId", petId)
                .when()
                .get("/{petId}");

        response.prettyPrint();

        System.out.println("Verifying pet is not found (404)");

        response.then().statusCode(404);
        response.then().body("message", equalTo("Pet not found"));
    }
}