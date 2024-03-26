package VirtualThread;

public class Work {


    public static  void heavyWorkLoad( int i )  {

        try {
            System.out.println("Starting the task "+ i);
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }


}
