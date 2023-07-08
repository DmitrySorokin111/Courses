package generics;

interface ResponseValidator<S> {
    boolean isValidResponse(S response);
}
