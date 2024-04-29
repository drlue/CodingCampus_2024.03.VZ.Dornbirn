package gyula.week08.sort;

public class CompareByAlpha implements IComp {
    private boolean ascending;

    public CompareByAlpha(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(String a, String b) {
        return a.compareTo(b) * (ascending ? 1 : -1);
    }
}
