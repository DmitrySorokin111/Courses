package _reflection_;

import java.lang.reflect.Method;

public class PairMethodPriority {
    private Method method;
    private int priority;

    public PairMethodPriority(Method method, int priority) {
        this.method = method;
        this.priority = priority;
    }

    public Method getMethod() {
        return method;
    }

    public int getPriority() {
        return priority;
    }
}
