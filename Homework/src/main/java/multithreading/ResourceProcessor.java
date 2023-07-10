package multithreading;
/*
Task 2
*/
import lombok.NonNull;

public class ResourceProcessor {
    public synchronized void increase(@NonNull Resource resource) throws InterruptedException
    {
        resource.field++;
    }

    public synchronized void decrease(@NonNull Resource resource) throws InterruptedException
    {
        resource.field--;
    }
}
