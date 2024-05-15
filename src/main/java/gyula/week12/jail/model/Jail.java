package gyula.week12.jail.model;

import java.util.Vector;

public class Jail {
    private String name;
    private Vector<Block> blockList;


    public Jail(String name){
        this.name = name;
        blockList = new Vector<>();
    }

    public void addBlock(Block b){
        if (!blockList.contains(b)){
            blockList.add(b);
        }
    }

    public Block getBlockById(int id){
        for (Block b : blockList){
            if (b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public void printStructure(){
        System.out.printf("Welcome in %s%n", name);
        for (Block b: blockList){
            b.printStructure();
        }
    }
}
