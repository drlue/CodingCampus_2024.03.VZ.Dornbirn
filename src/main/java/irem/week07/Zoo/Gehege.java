package irem.week07.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Gehege {

    private String name;
    private List<Tiere> tiereList;

    public Gehege(String name) {
        this.name = name;
        this.tiereList = new ArrayList<>();
    }

    public void addTiere(Tiere tiere) {
        tiereList.add(tiere);

    }

    public void removeTiere(Tiere tiere) {
        tiereList.remove(tiere);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("├── Gehege: " + name + "\n");
        if (tiereList.isEmpty()) {
            sb.append("│   ├── (leer)\n");
        } else {
            for (Tiere tier : tiereList) {
                sb.append("│   ├── " + tier.toString() + "\n");
            }
        }
        return sb.toString();
    }

}


