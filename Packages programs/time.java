import java.time.*;
import java.time.format.DateTimeFormatter;
public class Main {
 public static void main(String[] args) {
 LocalDate currentDate = LocalDate.now();
 LocalTime currentTime = LocalTime.now();
 LocalDateTime currentDateTime = LocalDateTime.now();
 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 String formattedDateTime = currentDateTime.format(formatter);
 ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
 LocalDate pastDate = LocalDate.of(2020, Month.JANUARY, 1);
 Period period = Period.between(pastDate, currentDate);
 System.out.printf("Current Date: %s%n", currentDate);
 System.out.printf("Current Time: %s%n", currentTime);
 System.out.printf("Formatted DateTime: %s%n", formattedDateTime);
 System.out.printf("Zoned DateTime (New York): %s%n", zonedDateTime);
 System.out.printf("Period from 2020-01-01 to now: %d years, %d months, %d days%n", 
 period.getYears(), period.getMonths(), period.getDays());
 }
}
