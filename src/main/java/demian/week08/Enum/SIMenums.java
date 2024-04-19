package demian.week08.Enum;

public class SIMenums {

    public static void main(String[] args) {

        String rot = KonsolenFarben.RED.getCode();
        String blau = KonsolenFarben.BLUE.getCode();
        System.out.println(rot + "Rot" + blau + " Blau");
        System.out.printf("%sGRÜN %sBLAU %sFarbe zurückgesetzt%n", KonsolenFarben.GREEN.getCode(),KonsolenFarben.BLUE.getCode(),KonsolenFarben.RESET.getCode());
        System.out.println("TEST");

        int eins = ZahlenEnum.EINS.getzahl();
        System.out.println(eins);
    }
}
