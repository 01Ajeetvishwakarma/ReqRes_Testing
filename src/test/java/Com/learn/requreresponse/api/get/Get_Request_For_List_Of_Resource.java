package Com.learn.requreresponse.api.get;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
public class Get_Request_For_List_Of_Resource {
    public static void main(String[] args) {

        Response response = given().contentType(ContentType.JSON)
                .get("https://reqres.in/api/unknown");

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
