package christian.week06.gameOfLife;

public class Cell {
    enum Status{ALIVE,DEAD}
    public Status status;
    public int rowPosition;
    public int colPosition;

    public Cell(int rowPosition, int colPosition){
        this.rowPosition = rowPosition;
        this.colPosition = colPosition;
        status=Status.DEAD;
    }

}
