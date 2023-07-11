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

        synchronized (resource) { //монитор на ресурс для корректной работы
            try {
                for (int i = 0; i < 100; ++i) {

                    while (resource.field <= 0) { //Меньше 1, но не больше 0 == меньше или равно 0 для Z...
                        try {
                            resource.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    RESOURCE_PROCESSOR.decrease(resource);
//                    System.out.println(resource.field);
                    resource.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
