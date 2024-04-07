package lambdas;

import java.util.Map;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.common.base.Joiner;
import lambdas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthLambda implements RequestHandler<Map<String, String>, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String handleRequest(final Map<String, String> event, final Context context) {
        System.out.println("Received event: " + event);
        final String msg = Joiner.on(" ").join("Hello", "from", "Java!");
        System.out.println(msg);
        Map<String, String> response = Map.of("message", "Hello from Java Lambda!");

        return userRepository.saludar("Herman");
    }
}