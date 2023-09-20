import java.util.Date;

public class date_and_time {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println("current date : "+System.currentTimeMillis());
        Date d = new Date();
        System.out.println("today date and time : "+d);
        Date d1 = new Date(1665242095982l);
        System.out.println("the date calculated form Mili-Seconds is : "+d1);
        System.out.println("date or time is same or not : "+d1.compareTo(d));
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
