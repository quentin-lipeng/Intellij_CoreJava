package OOP;


import java.time.DayOfWeek;
import java.time.LocalDate;

// 使用LocalDate类实现输出日历
public class DateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("MON TUE WED THU FRI SAT SUN");
        for (int i=1; i<value; i++) System.out.print("    ");

        while (date.getMonthValue() == month){
            if(date.getDayOfMonth() < 10){
                System.out.print(" 0"+date.getDayOfMonth());
            }else {
                System.out.printf("%3d", date.getDayOfMonth());
            }
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1){
            System.out.println();
        }
    }
}
