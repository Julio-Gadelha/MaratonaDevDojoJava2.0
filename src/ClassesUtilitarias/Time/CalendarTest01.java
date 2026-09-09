package ClassesUtilitarias.Time;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
   public  static void main(String[] args) {
       Calendar calendar = Calendar.getInstance();
       System.out.println(calendar);

       Date data = Calendar.getInstance().getTime();
       System.out.println(data);



    }
}
