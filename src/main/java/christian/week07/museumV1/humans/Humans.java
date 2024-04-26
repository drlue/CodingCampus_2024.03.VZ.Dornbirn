package christian.week07.museumV1.humans;


import christian.week07.museumV1.art.Art;
import christian.week07.museumV1.rooms.Room;

import static christian.week07.museumV1.MainV1.rnd;

public abstract class Humans {
    private String name;
    enum Status{ACTIVE,IDLE}
    private Status status;

    public Humans(String name){
        this.name = name;
        this.status = Status.IDLE;
    }
    //===========================================================================================get==================
    //==========================================================================================set===================
    //==========================================================================================add/remove============
    //==========================================================================================alter=================
    //==========================================================================================simulate==============
    public boolean possibleChange60percent(){
 return rnd.nextInt(0,100)>40;
    }

    public void simulateActivity(int hour, Room rndRoom, Art rndArt){
        switch (status){
            case IDLE -> {}
            case ACTIVE -> {}
        }
    }
}
