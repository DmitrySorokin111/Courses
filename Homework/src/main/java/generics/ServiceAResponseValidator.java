package generics;

import java.util.Objects;

public class ServiceAResponseValidator implements ResponseValidator<Double> {
    @Override
    public boolean isValidResponse(Double response) {
        //...
        return Objects.equals(response, 23);
    }
}
