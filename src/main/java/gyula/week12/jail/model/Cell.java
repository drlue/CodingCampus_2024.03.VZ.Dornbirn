package gyula.week12.jail.model;

public class Cell {
    private int Id;

    private String name;
    private int capacity;

    private Block block;

    public Cell(){}

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return Id;
    }

    public void printStructure(){
        System.out.printf("        Cell: %s for %d inhabits.%n", name, capacity);
    }
}
