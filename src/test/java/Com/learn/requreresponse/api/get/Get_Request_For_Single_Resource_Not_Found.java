package Com.learn.requreresponse.api.get;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Get_Request_For_Single_Resource_Not_Found {
    public static void main(String[] args) {

        Response response = given().contentType(ContentType.JSON)
                .get("https://reqres.in/api/unknown/545445");

        response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode());

        if (response.getStatusCode()==404)
        {
            System.out.println("Validated Successful");
        }
        else
        {
            System.out.println("Validation Failed");
            System.out.println("Expected: "+404 + "Found: "+ response.getStatusCode());
        }

    }
}
