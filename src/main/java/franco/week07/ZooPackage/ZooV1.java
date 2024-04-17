package franco.week07.ZooPackage;

public class ZooV1 {
    private String name;
    private int establishedYear;


    public ZooV1(String name,int establishedYear){

        this.name=name;
        this.establishedYear=establishedYear;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isBlank()){
            System.out.println("Please enter a valid name...");
        }else{
        this.name = name;}
    }
    public int getEstablishedYear() {
        return establishedYear;
    }
    public void setEstablishedYear(int establishedYear) {
        if(establishedYear<0){
            System.out.println("Enter a positive year...");
        }else{
        this.establishedYear = establishedYear;}
    }
}
