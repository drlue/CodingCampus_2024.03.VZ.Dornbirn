package lukas.week08.Museum.Rooms;

import lukas.week08.Museum.Art.Artwork;
import lukas.week08.Museum.Persons.Guard;
import lukas.week08.Museum.Persons.Visitor;

import java.util.List;
import java.util.Vector;

public class ExhibitionRoom extends Room {


    List<Artwork> artworks;
    List<Visitor> visitors;
    List<Guard> guards;

    public ExhibitionRoom(String name) {
        super(name);
        artworks = new Vector<>();
        visitors = new Vector<>();
        guards = new Vector<>();
    }

    //---methods

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
        addPerson(visitor);
    }

    public void addGuard(Guard guard){
        guards.add(guard);
        addPerson(guard);
    }


    //---print


    @Override
    public String printRoom() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.printRoom());
        if(!artworks.isEmpty()) {
            for(Artwork a : artworks) {
                sb.append("   |---");
                sb.append(a.toString());
                sb.append("\n");
            }
        }else {
            sb.append("   |---LEER");
        }
        return sb.toString();
    }
}
