package ardijanla.week06.FotoApparatExtended;

public class FotoLabor {
    private static FotoLabor _instance = null;
    private String name = "Foto Labor in Feldkirch";

    private FotoLabor(){
    }

    public static FotoLabor getInstance() {
        if (_instance == null) {
            _instance = new FotoLabor();
        }
        return _instance;
    }

    @Override
    public String toString() {
        return name;
    }
}
