package generics;

public class ServiceB implements ExternalService<String, String> {
    public String sendRequest(String request) {
        //...
        return "success";
    }
}