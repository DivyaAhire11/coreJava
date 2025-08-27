import java.time.LocalDateTime;
/* 

Year is : 2025
Month is : 8
Date is : 27
Day is : WEDNESDAY
Hours is : 19
Minutes is : 18
Seconds is : 19

*/
class MyDates {
    public static void main(String args[]) {
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("Year is : " + ldt.getYear());
        System.out.println("Month is : " + ldt.getMonthValue());  
        System.out.println("Date is : " + ldt.getDayOfMonth());
        System.out.println("Day is : " + ldt.getDayOfWeek());     // MONDAY, TUESDAY, ...
        System.out.println("Hours is : " + ldt.getHour());
        System.out.println("Minutes is : " + ldt.getMinute());
        System.out.println("Seconds is : " + ldt.getSecond());

    }
}
