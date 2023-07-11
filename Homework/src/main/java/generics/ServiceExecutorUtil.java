package generics;

public class ServiceExecutorUtil<Q, S> {
    private final ExternalService<Q, S> service;
    private final RequestValidator<Q> requestValidator;
    private final ResponseValidator<S> responseValidator;

    public ServiceExecutorUtil(ExternalService<Q, S> service,
                               RequestValidator<Q> requestValidator,
                               ResponseValidator<S> responseValidator) {
        this.service = service;
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
    }

    public void execute(Q request) {
        if (requestValidator.isValidRequest(request))
        {
            S response = service.sendRequest(request);

            if (responseValidator.isValidResponse(response)) {
                System.out.println("Запрос обрабатывается");
            } else {
                System.out.println("Ответ некорректен");
            }
        } else {
            System.out.println("Запрос некорректен");
        }
    }
}
