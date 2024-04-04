package lukas.week04;

public class StringReplace {

    public static void main(String[] args) {
        replaceAll();
        replaceAll2();
        replaceAll3();

    }

    public static void replaceAll() {
        String txt = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        String txt2 = txt.replace("wird", "war und ist");
        System.out.println(txt2);
    }

    public static void replaceAll2() {
        String txt = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        System.out.println(txt.replaceAll("[a-z]", ""));
        System.out.println(txt.replaceAll("[A-Z]", ""));
        System.out.println(txt.replaceAll( "\s", ""));
        System.out.println(txt.replaceAll( "!", ""));
    }

    public static void  replaceAll3(){
        String txt = "749813247132984712039487123049871204398712039487";
        System.out.println(txt);
        System.out.println(txt.replaceAll("[0-9]",""));
        System.out.println(txt.replaceAll("[1-9]",""));
        System.out.println(txt.replaceAll("[2-4]",""));
        System.out.println(txt.replaceAll("[1-36-9]",""));
    }
}
