package perfios;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Sign implements RequestHandler<String, String>{

    public String handleRequest(String payload, Context context) {
        return payload;
    }
}
