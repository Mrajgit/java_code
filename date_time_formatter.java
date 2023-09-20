import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        System.out.println("the current date is : "+d);
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        DateTimeFormatter df = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;
        String myDate = d.format(df);
        System.out.println("date after formatting : "+myDate);
    }
}
