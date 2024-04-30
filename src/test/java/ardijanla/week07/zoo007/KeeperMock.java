package ardijanla.week07.zoo007;

public class KeeperMock implements IKeeper{
    public int countCallPerformDuties = 0;
    public int lassCallCounter = 0;

    @Override
    public void performDuties() {
        ++countCallPerformDuties;

        ++EnclosureMock.callCounter;
        lassCallCounter = EnclosureMock.callCounter;
    }

    @Override
    public void printStructure() {

    }
}
