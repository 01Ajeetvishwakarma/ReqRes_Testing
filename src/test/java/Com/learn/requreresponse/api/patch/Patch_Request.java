package Com.learn.requreresponse.api.patch;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
public class Patch_Request {
    public static void main(String[] args) {

        String bodyString = " {\n" +
                "            \"id\": 7,\n" +
                "            \"email\": \"ajeet.weaver@reqres.in\",\n" +
                "            \"first_name\": \"MRx\",\n" +
                "            \"last_name\": \"Vishwakarma\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\n" +
                "        }";

        Response response = given().contentType(ContentType.JSON)
                .body(bodyString)
                .patch("https://reqres.in/api/users");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==200)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.err.println("Validation Failed");
            System.out.println("Expected: "+200+ " Found: "+ response.getStatusCode());
        }
    }
}
