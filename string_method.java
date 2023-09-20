import java.awt.*;
import java.util.Locale;

public class string_method {
    public static void main(String[] args) {
        String a="     raj     ";
        System.out.println(a);
//        int val = a.length();
//        System.out.println(val);
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());
        System.out.println(a.substring(6));
        System.out.println(a.substring(2,7));
        System.out.println(a.replace('r','m'));
        System.out.println(a.replace("ra","mra"));
        System.out.println(a.startsWith(" "));
        System.out.println(a.endsWith(" "));
        System.out.println(a.charAt(6));
        System.out.println(a.indexOf("r",7));
        System.out.println(a.lastIndexOf("r",4));
    }
}
