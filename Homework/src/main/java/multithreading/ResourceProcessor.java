package multithreading;
/*
Task 2
*/
import lombok.NonNull;

public class ResourceProcessor {
    public void increase(@NonNull Resource resource) throws InterruptedException
    {
        for (int i = 0; i < 10; ++i) {

            while (resource.field >= 5) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(resource.field);

            resource.field++;

            resource.notifyAll();
        }
    }

    public void decrease(@NonNull Resource resource) throws InterruptedException
    {
        for (int i = 0; i < 10; ++i) {

            while (resource.field < 1) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(resource.field);

            resource.field--;

            resource.notifyAll();
        }
    }
}
