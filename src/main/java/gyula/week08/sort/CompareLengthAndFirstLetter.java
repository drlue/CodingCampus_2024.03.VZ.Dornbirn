package gyula.week08.sort;

public class CompareLengthAndFirstLetter implements IComp{
    @Override
    public int compare(String a, String b) {
        if (a.length() == b.length()){
            if (!a.isEmpty()){
                return a.charAt(0) - b.charAt(0);
            }
            return 0;
        }
        return a.length() - b.length();
    }
}
