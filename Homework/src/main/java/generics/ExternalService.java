package generics;

public interface ExternalService<Q, S> {
    S sendRequest(Q request);
}