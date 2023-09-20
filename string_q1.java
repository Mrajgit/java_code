import java.util.Locale;

public class string_q1 {
    public static void main(String[] args) {

        String name="WELCOM TO IDEA";
        name=name.toLowerCase();
        System.out.println(name);

        String n="welcome to dsmnru";
        n=n.replace(" ","_");
        System.out.println(n);

        String letter="hello monu, thanks a lot";
       letter= letter.replace("monu","raj");
        System.out.println(letter);

        String s1="this string   double and triple spaces";
        System.out.println(s1.indexOf("  "));
        System.out.println(s1.indexOf("    "));

        String l="dear sir \n\t welcome to dsmnru\n\tthank you";
        System.out.println(l);
    }
}
