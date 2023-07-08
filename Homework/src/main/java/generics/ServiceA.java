package generics;

public class ServiceA implements ExternalService<Integer, Double> {
    public Double sendRequest(Integer request) {
        //...
        return 1.0;
    }
}
