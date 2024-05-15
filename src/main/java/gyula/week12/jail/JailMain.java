package gyula.week12.jail;

import gyula.week12.jail.model.Cell;
import gyula.week12.jail.model.Jail;
import gyula.week12.jail.service.BlockService;
import gyula.week12.jail.service.CellService;

public class JailMain {
    public static void main(String[] args) {
        Jail jail = new Jail("Sing Sing");

        new BlockService().readBlocks(jail);
        CellService cs = new CellService();
        cs.readCells(jail);

        Cell c = cs.createNewCell("B / 01 / 02", 2, jail.getBlockById(2));
        jail.printStructure();


        cs.updateName("abcd", c);
        jail.printStructure();
    }
}
