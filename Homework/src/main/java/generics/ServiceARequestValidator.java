package generics;

public class ServiceARequestValidator implements RequestValidator<Integer> {
    @Override
    public boolean isValidRequest(Integer request) {
        //...
        return request == 1;
    }
}
