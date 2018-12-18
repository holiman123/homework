package secondExampleAPIcolendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        GregorianCalendar gs = new GregorianCalendar(2018, Calendar.APRIL,18);
        int today = gs.get(Calendar.DAY_OF_MONTH);
        int month = gs.get(Calendar.MONTH);
        gs.set(Calendar.DAY_OF_MONTH, 1);
        int week = gs.get(Calendar.DAY_OF_WEEK);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for (int i = Calendar.SATURDAY; i < week; i++) {
            System.out.print("\t");
        }
        do{
            int day = gs.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            if(today == day)
                System.out.print("*");
            else
            {
                System.out.print(" ");
            }
            if(week == Calendar.SATURDAY)
                System.out.println();
            // System.out.println();
            gs.add(Calendar.DAY_OF_MONTH,1);
            week = gs.get(Calendar.DAY_OF_WEEK);
        }while(gs.get(Calendar.MONTH) == month);
    }
}
