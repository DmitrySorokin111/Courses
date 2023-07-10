package generics;

interface RequestValidator<Q> {
    boolean isValidRequest(Q request);
}
