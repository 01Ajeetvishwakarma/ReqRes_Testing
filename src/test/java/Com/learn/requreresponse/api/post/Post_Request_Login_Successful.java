package Com.learn.requreresponse.api.post;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Post_Request_Login_Successful {
    public static void main(String[] args) {

        String body = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";

        Response response = given().contentType(ContentType.JSON)
                .body(body)
                .post("https://reqres.in/api/login");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==200)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.err.println("Validation Failed");
            System.out.println("Expected: "+200 + " Found: "+ response.getStatusCode());
        }
    }
}
