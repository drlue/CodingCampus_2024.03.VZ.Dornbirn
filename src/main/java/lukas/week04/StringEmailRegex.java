package lukas.week04;

public class StringEmailRegex {
    public static void main(String[] args) {
        String regex = "^[a-z]{1}[\\w_\\-\\.]+@[\\w_\\-]+\\.[a-z]{2,4}";
       System.out.println("alfons@drlue.at".matches(regex));  //true
       System.out.println("rambina.alfons@drlue.at".matches(regex)); //true
       System.out.println("rambina1.1alfons@drlue.at".matches(regex)); //true
       System.out.println("1rambina1.alfons@drlue.at".matches(regex)); //false
       System.out.println("@drlue.at".matches(regex)); //false
       System.out.println("drlue.at".matches(regex)); //false
       System.out.println("asdf@drlue".matches(regex)); //false
       System.out.println("asdf@microsoft.c".matches(regex)); //false

    }

}
