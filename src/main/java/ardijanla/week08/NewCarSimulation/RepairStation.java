package ardijanla.week08.NewCarSimulation;

import gyula.week06.example2.Motor;

import java.util.ArrayList;
import java.util.List;

public class RepairStation {
    private List<Engine> engines;
    private List<Tank> tanks;

    public RepairStation() {
        engines = new ArrayList<>();
        tanks = new ArrayList<>();
    }

    public void addEngineToInventory(Engine engine){
        engines.add(engine);
    }

    public void addTanksToInventory(Tank tank){
        tanks.add(tank);
    }
}
