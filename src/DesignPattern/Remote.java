package DesignPattern;

public class Remote {

    private Door door;

    public void open( ){
    }

    public void closeDoor( ){
       if (door.isDoorOpen() ) {
           door.close();
       }
        else {
           System.out.println("Door is already closed");
       }
    }
    public void openDoor( ){

        if(!door.isDoorOpen()){
            door.open();
        }
        else {
            System.out.println("Door is close");
        }

    }





}
