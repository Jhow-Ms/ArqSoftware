package exercicio_6_1;

import java.util.Calendar;
import java.util.Locale;

public class Application
{

  public static void main(String[] args)
  {
    Week week = new Week();

    Calendar calendar = Calendar.getInstance();

    System.out.println(week.getWeekdays(calendar.get(Calendar.DAY_OF_WEEK)).message());

    System.out.println(week.getWeekdays(calendar.getDisplayName(Calendar.DAY_OF_WEEK, 
                                        Calendar.LONG, Locale.ENGLISH)).message());
  }
}
