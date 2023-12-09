import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class day12 {
    public static String getD(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String days = dayOfWeek.toString();
        return days;
    }
    public static void main(String[] args) {
        int day,month,year;
        Scanner s=new Scanner(System.in);
        System.out.println("enter month:");
        month= s.nextInt();
        System.out.println("enter day:");
        day= s.nextInt();
        System.out.println("enter year:");
        year= s.nextInt();

        String result = getD(day, month, year);
        System.out.println(result);
    }
}