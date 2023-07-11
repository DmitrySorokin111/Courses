package generics;

import java.util.Objects;

public class ServiceBResponseValidator implements ResponseValidator<String> {
    @Override
    public boolean isValidResponse(String response) {
        //...
        return Objects.equals(response, "success");
    }
}
