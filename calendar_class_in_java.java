import java.util.*;

public class calendar_class_in_java extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("calendar type : "+c.getCalendarType());
        System.out.println("how many weeks in this year : "+c.getWeeksInWeekYear());
        System.out.println("how many weeks in this year : "+c.getMaximum(Calendar.WEEK_OF_YEAR));

        System.out.println("current year is : "+c.get(Calendar.YEAR));
        System.out.println("current  month is  : "+c.get(Calendar.MONTH));
        System.out.println("current day is : "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("current hour is : "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("current minute is : "+c.get(Calendar.MINUTE));
        System.out.println("current second is : "+c.get(Calendar.SECOND));

        System.out.println("current date si : "+c.getTime());
        c.add(Calendar.YEAR,4);
        System.out.println("after 4 years is : "+c.getTime());
        c.add(Calendar.YEAR,-20);
        System.out.println("before 20 years is : "+c.getTime());
        c.add(Calendar.MONTH,4);
        System.out.println("after 2 month is : "+c.getTime());
    }
}
