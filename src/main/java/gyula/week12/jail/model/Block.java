package gyula.week12.jail.model;

import java.util.Date;
import java.util.Vector;

public class Block {
    private int id;
    private String name;
    private Date constructed;

    private Vector<Cell> cellList;

    public Block(){
        cellList = new Vector<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConstructed(Date constructed) {
        this.constructed = constructed;
    }

    public int getId() {
        return id;
    }

    public void addCell(Cell c){
        if (!cellList.contains(c)){
            cellList.add(c);
            c.setBlock(this);
        }
    }

    public void printStructure(){
        System.out.printf("    Block: %s consturcted in %tY%n", name, constructed);
        for (Cell c : cellList){
            c.printStructure();
        }
    }
}
