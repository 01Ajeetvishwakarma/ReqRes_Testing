package Com.learn.requreresponse.api.post;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Post_Request_For_Register_User_Unsuccessful {
    public static void main(String[] args) {

        String bodyString = "{\n" +
                "    \"email\": \"sydnegffdfdfy@fife\"\n" +
                "}";

        Response response = given().contentType(ContentType.JSON)
                .body(bodyString)
                .post("https://reqres.in/api/register");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==400)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.err.println("Validation Failed");
            System.out.println("Expected: "+400 + " Found: "+ response.getStatusCode());
        }
    }
}
