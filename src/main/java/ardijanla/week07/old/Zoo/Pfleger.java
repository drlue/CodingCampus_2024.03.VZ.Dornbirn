package ardijanla.week07.old.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Pfleger {
    String name;

    List<Gehege> gehegeList;
    String favoriteGattung;

    public String getFavoriteGattung() {
        return favoriteGattung;
    }

    public void setFavoriteGattung(String favoriteGattung) {
        this.favoriteGattung = favoriteGattung;
    }

    public Pfleger(String name) {
        this.name = name;
        this.gehegeList = new ArrayList<>();
    }

    public void addGehege(Gehege gehege) {
        gehegeList.add(gehege);
    }

    public List<Gehege> getVerantwortlicheGehege() {
        return gehegeList;
    }
    @Override
    public String toString() {
        return name;
    }
}
