package generics;

interface ExternalService<Q, S> {
    S sendRequest(Q request);
}