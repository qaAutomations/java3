import java.util.Locale;

public class Text {
    public static void main(String[] args) {

        String s1 = "IDan sakat and nina";

        System.out.println(   s1.toUpperCase()   ); // IDAN SAKAT
        System.out.println(   s1.toLowerCase()   ); // idan sakat
        System.out.println(   s1.length()   ); // 19
        System.out.println(   s1.charAt(11)   ); // a
        System.out.println(   s1.indexOf("and")   ); // 11
        System.out.println(   s1.replace('n','z')); // 11




    }
}
