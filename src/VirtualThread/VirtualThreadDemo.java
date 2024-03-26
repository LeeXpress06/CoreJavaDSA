package VirtualThread;

public class VirtualThreadDemo {



    public static void main(String[] args) {

    }

    public static void virtualthreadDemo(int k){

         Thread.Builder.OfVirtual builder = Thread.ofVirtual();

         for(int i = 0; i< k; i++){
            int m = k;
             Thread thread = builder.unstarted(( ) -> Work.heavyWorkLoad(m));
         }

    }
}
