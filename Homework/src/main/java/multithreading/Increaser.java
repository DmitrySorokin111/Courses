package multithreading;
/*
Task 3
*/
public class Increaser extends Thread {
    private static final ResourceProcessor RESOURCE_PROCESSOR = new ResourceProcessor();
    private final Resource resource;

    public Increaser(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //Task 3

        for (int i = 0; i < 6; ++i) {
            try {
                RESOURCE_PROCESSOR.increase(resource);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
