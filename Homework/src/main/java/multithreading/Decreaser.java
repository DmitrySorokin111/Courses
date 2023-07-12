package multithreading;
/*
Task 6
 */
public class Decreaser implements Runnable{
    private static final ResourceProcessor RESOURCE_PROCESSOR = new ResourceProcessor();
    private final Resource resource;

    public Decreaser(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //Task 7

        synchronized (resource) {
            try {
                RESOURCE_PROCESSOR.decrease(resource);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
