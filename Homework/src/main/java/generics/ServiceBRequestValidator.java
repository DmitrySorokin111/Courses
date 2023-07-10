package generics;

import java.util.Objects;

public class ServiceBRequestValidator implements RequestValidator<String> {
    @Override
    public boolean isValidRequest(String request) {
        //...
        return Objects.equals(request, "yes");
    }
}
