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
                for (int i = 0; i < 100; ++i) {

                    while (resource.field == 5) {
                        try {
                            resource.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    RESOURCE_PROCESSOR.increase(resource);
//                    System.out.println(resource.field);
                    resource.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
