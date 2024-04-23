package gyula.week08.sort;

public class CompareByLength implements IComp {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
}
