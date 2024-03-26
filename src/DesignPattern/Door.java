package DesignPattern;

public class Door {

   private boolean open ;

    public Door(boolean open) {
        this.open = open;
    }

    public void open( ){
        open = true;

        System.out.println("Opening the door");
    }
    public  void close( ){
        open = false;
        System.out.println("close the door");
    }
    public boolean isDoorOpen( ){



        return open;
    }






}
