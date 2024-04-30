package ardijanla.week07.zoo007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZooTest {

    public Zoo generateZoo(){
        Zoo zoo = new Zoo("Tierpark Feldkirch", 1967);
        return zoo;
    }

    @Test
    public void simulateDayTest(){
        // Prepare
        Zoo zoo = generateZoo();
        EnclosureMock eMock = new EnclosureMock();
        zoo.addEnclosure(eMock);

        // Test
        zoo.simulateDay();

        // Evaluate
        assertEquals(1, eMock.countCallSimulateDay);
    }

    @Test
    public void simulateDayTestAddSameEnclosure(){
        // Prepare
        Zoo zoo = generateZoo();
        EnclosureMock eMock = new EnclosureMock();
        zoo.addEnclosure(eMock);
        zoo.addEnclosure(eMock);
        zoo.addEnclosure(eMock);
        zoo.addEnclosure(eMock);

        // Test
        zoo.simulateDay();

        // Evaluate
        assertEquals(1, eMock.countCallSimulateDay);
    }

    @Test
    public void simulateDayTestWithoutEnclosure(){
        // Prepare
        Zoo zoo = generateZoo();
        KeeperMock km = new KeeperMock();
        zoo.addKeeper(km);

        // Test
        zoo.simulateDay();

        // Evaluate
        assertEquals(1, km.countCallPerformDuties);
    }

    @Test
    public void simulateDayTestWithEnclosureAndKeeper(){
        // Prepare
        Zoo zoo = generateZoo();
        EnclosureMock eMock = new EnclosureMock();
        zoo.addEnclosure(eMock);
        KeeperMock kMock = new KeeperMock();
        zoo.addKeeper(kMock);

        // Test
        zoo.simulateDay();

        // Evaluate
        assertEquals(1, eMock.countCallSimulateDay);
        assertEquals(1, kMock.countCallPerformDuties);
        assertTrue(eMock.lastCallCounter < kMock.lassCallCounter);
    }

}
