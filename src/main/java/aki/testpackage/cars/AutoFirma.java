package aki.testpackage.cars;

public class AutoFirma {
    private String firmenName;

    public AutoFirma(String firmenName){
        this.firmenName = firmenName;
    }

    public String getFirmenName() {
        return firmenName;
    }

    public void printFirmenListe(){
        System.out.println(getFirmenName());
    }
}
