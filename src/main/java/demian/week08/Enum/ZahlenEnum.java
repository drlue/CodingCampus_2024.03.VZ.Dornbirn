package demian.week08.Enum;

public enum ZahlenEnum {
    EINS(1),
    ZWEI(2),
    DREI(3);

    private final Integer i;

    ZahlenEnum(Integer i) {
        this.i = i;
    }

    public int getzahl() {
        return i;
    }
}

