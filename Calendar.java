// class Calendar

import java.util.Date;
import java.util.ArrayList;

class Calendar //for now i will use this class as sortof user
{
  //private static fields
  private static ArrayList<Event> eventList;
 // private static List<Date> dateList;
  
  //public methods
  
  // constructor
  public Calendar()
  {
    eventList=new ArrayList<Event>();
  //  dateList=new ArrayList<Date>();
  }
  
  //tba. ability to add multiple event at one time (day)
  //maybe field color in event that changes to next each time it is created
  public void addEvent(Date date, int duration, String name )
  {
    Event e = new Event(date, duration, name);
    eventList.add(e);
  }
  
  //for now it takes all params but to be changed
  public void removeEvent(Date date, int duration, String name)
  {
    Event e = new Event(date, duration, name); //if there will be changing color, i cannot create new object here
    eventList.remove(e);
  }
  
  //this should be in different class
  public void displayCallendary()
  {
    String top = "2024\nJanuary\nMon Tues Wen Thur Fri Sat Sun";
    String pom = new String();
    int month=0;
    int year=1;
    for(int i=1;i<=7;i++)
    {
      if(year!=12)
      {
      month++;
      pom+=i+" ";
      if(i==7)
      {
        pom+="\n";
        if(month==30)
        { 
          year++;
          pom+="February\n";//tba changing months from class Date (month[0])
          i=1;
        }
      }
      }
      
    }
  }
}
