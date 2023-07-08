package multithreading;

public class TestMultithreading
{
    public static int test1(Resource resource) {
        //Task 4, 5

        Increaser inc1 = new Increaser(resource);
        Increaser inc2 = new Increaser(resource);
        Increaser inc3 = new Increaser(resource);


//        Decreaser1 dec1 = new Decreaser1(resource);
//        Decreaser1 dec2 = new Decreaser1(resource);
//        Decreaser1 dec3 = new Decreaser1(resource);
//
//        Thread d1 = new Thread(dec1);
//        Thread d2 = new Thread(dec2);
//        Thread d3 = new Thread(dec3);

        inc1.start();
        inc2.start();
        inc3.start();

//        d1.start();
//        d2.start();
//        d3.start();

        try {
            inc1.join();
            inc2.join();
            inc3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(resource.field);
        return resource.field;
    }

    public static int test2(Resource resource, int incsCount) {
        //Task 7

        Increaser1[] increasers = new Increaser1[5];

        for (int i = 0; i < incsCount; ++i) {
            increasers[i] = new Increaser1(resource);
            increasers[i].start();
        }

        Decreaser decreaser1 = new Decreaser(resource);
        Thread dec = new Thread(decreaser1);

        dec.start();

        try {
            for (int i = 0; i < incsCount; ++i) {
                increasers[i].join();
            }
            dec.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(resource.field);     //при равном кол-ве increaser`ов и decreaser`ов
                                                //вернёт то же число, что и было, иначе программа
                                                //не завершится из-за условий задачи.
        return resource.field;
    }
}
