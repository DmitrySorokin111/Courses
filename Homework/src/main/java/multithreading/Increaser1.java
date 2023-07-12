package multithreading;
/*
Task 7
*/
public class Increaser1 extends Thread {
    private static final ResourceProcessor RESOURCE_PROCESSOR = new ResourceProcessor();
    private final Resource resource;

    public Increaser1(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //Task 7

        synchronized (resource) {
            try {
                RESOURCE_PROCESSOR.increase(resource);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
