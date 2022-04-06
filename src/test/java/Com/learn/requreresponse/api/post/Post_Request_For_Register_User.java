package Com.learn.requreresponse.api.post;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Post_Request_For_Register_User {
    public static void main(String[] args) {

        String bodyString = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";

        Response response = given().contentType(ContentType.JSON)
                .body(bodyString)
                .post("https://reqres.in/api/register");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==200)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.err.println("Validation Failed");
            System.out.println("Expected: "+200 + "Found: "+ response.getStatusCode());
        }
    }
}
