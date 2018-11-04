package exercicio_6_1;

public class Week
{

  public Weekdays getWeekdays(int weekdays)
  {
    switch(weekdays)
    {
      case 1: return new Sunday();
      case 2: return new Monday();
      case 3: return new Tuesday();
      case 4: return new Wednesday();
      case 5: return new Thursday();
      case 6: return new Friday();
      case 7: return new Saturday();
    }

    throw new IllegalArgumentException("'" + weekdays + 
                                       "' is an illegal argument for the parameter weekdays!");
  }

  public Weekdays getWeekdays(String weekdays)
  {
    try
    {
      return (Weekdays) Class.forName(weekdays).newInstance();
    }
    catch(Exception exception)
    {
      throw new IllegalArgumentException("'" + weekdays + 
                                         "' is an illegal argument for the parameter weekdays!");
    }
  }
}