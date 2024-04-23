package gyula.week08.sort;

public class CompareByAlpha implements IComp {
    private boolean ascending;

    public CompareByAlpha(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(String a, String b) {
        return ascending ? a.compareTo(b) : -1 * a.compareTo(b);
    }
}
