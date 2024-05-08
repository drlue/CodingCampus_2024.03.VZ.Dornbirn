package ardijanla.week07.zoo007;

public class EnclosureMock implements IEnclosure {
    public static int callCounter = 0;
    public int countCallSimulateDay = 0;
    public int lastCallCounter = 0;

    @Override
    public void simulateDay() {
        ++countCallSimulateDay;

        ++callCounter;
        lastCallCounter = callCounter;
    }

    @Override
    public void printStructure() {

    }
}
