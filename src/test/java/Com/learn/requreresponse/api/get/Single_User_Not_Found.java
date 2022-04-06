package Com.learn.requreresponse.api.get;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
public class Single_User_Not_Found {
    public static void main(String[] args) {

        Response response = given().contentType(ContentType.JSON)
                .pathParams("id","78")
                .get("https://reqres.in/api/user/{id}");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==200)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.out.println("Validation Failed");
            System.out.println("Expected: "+200 + "Found: "+ response.getStatusCode());
        }

    }
}
