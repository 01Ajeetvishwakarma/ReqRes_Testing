package Com.learn.requreresponse.api.delete;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
public class Delete_Request {
    public static void main(String[] args) {

        Response response = given().contentType(ContentType.JSON)
                .pathParams("id","1")
                .delete("https://reqres.in/api/user/{id}");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==204)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.err.println("Validation Failed");
            System.out.println("Expected: "+204 + "Found: "+ response.getStatusCode());
        }

    }
}
