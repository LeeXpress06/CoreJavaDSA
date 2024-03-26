package VirtualThread;

public class PlatformThread {


    private static  final int max = 50_000;

    public static void main(String[] args) {

        platformthreadCreate();

    }
    public static  void platformthreadCreate(  ){
       Thread.Builder.OfPlatform builder = Thread.ofPlatform().name("mythread", 1);

        for(int i = 0; i<max; i++){
            int j = i;
            Thread thread = builder.unstarted(()-> Work.heavyWorkLoad(j));
            thread.start();

        }

    }
}
