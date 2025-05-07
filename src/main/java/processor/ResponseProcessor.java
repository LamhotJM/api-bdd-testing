package processor;

import io.restassured.response.Response;
import model.ApiResponse;

public class ResponseProcessor {

    public static ApiResponse processResponse(Response response) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatusCode(response.getStatusCode());
        apiResponse.setBody(response.getBody().asString());
        return apiResponse;
    }
}
