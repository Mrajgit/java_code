import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian_calendar_class {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("2000 is leap year : "+c.isLeapYear(2000));
        System.out.println("2001 is leap year : "+c.isLeapYear(2001));

        System.out.println("calendar : "+c.getTime());
        System.out.println("the hashcode for this calendar is : "+ c.hashCode());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
