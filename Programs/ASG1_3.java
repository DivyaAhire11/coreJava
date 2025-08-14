// current date is : 14/08/2025
//current date is : 08-14-2025
//current date is : Thursday August 14 2025
//current date and time is : Thu August 14 02:51:56 IST 2025
//current date and time is : 14/08/25 02:51:56 pm IST
//current time is : 02:51:56
//current week of year is : 33
//current week of month : 3
//current day of year is : 226

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyDate{
    public static void main(String []args){
      Date d = new Date();
      SimpleDateFormat sfd;

      sfd = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("Current Date is  "+ sfd.format(d));

      sfd = new SimpleDateFormat("MM-dd-yyyy");
      System.out.println("current date is : "+ sfd.format(d));

      sfd= new SimpleDateFormat("EEEE MMMM dd yyyy");
      System.out.println("current date is :"+ sfd.format(d));
  
      sfd = new SimpleDateFormat("EEE MMMM dd hh:mm:ss z yyyy");
      System.out.println("current date and time is :"+ sfd.format(d));

      sfd = new SimpleDateFormat("dd/MM/yy hh:mm:ss aa z");
      System.out.println("current date and time is :"+ sfd.format(d));

      sfd = new SimpleDateFormat("hh:mm:ss");
      System.out.println("current time is :"+ sfd.format(d));
   
      Calendar cl = Calendar.getInstance();
      cl.setTime(d);
      System.out.println("Current week of year is :"+ cl.get(Calendar.WEEK_OF_YEAR));
      System.out.println("Current week AND month is :"+ cl.get(Calendar.WEEK_OF_MONTH));
      System.out.println("Current day of year is :"+ cl.get(Calendar.DAY_OF_YEAR));

    }
}