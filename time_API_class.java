import java.time.*;

public class time_API_class {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println("time zone of india : "+c.getZone());
        System.out.println("date and time : "+c.instant());

        Duration d = Duration.between(LocalTime.MIN,LocalTime.NOON);
        System.out.println(d.isNegative());
        Duration d1 = Duration.between(LocalTime.MAX,LocalTime.MIN);
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);
        System.out.println(d2.isZero());
        Duration d3 = Duration.between(LocalTime.MAX,LocalTime.MIN);
        System.out.println(d3.isZero());

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);


    }
}
