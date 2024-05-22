//class event

import java.util.Date;

class Event
{
  //private fields
  private Date date; // if possible - change to type Date
  private String name;
  private int duration;
  
  //public methods
  
  //constructor takes and sets name duration and date that event starts
  public Event(Date date, int duration, String name)
  {
    this.date=date;
    this.duration=duration;
    this.name=name;
  }
  
  // all geters
  public Date getDate()
  {
    return this.date;
  }
  public String getName()
  {
    return this.name;
  }
  public int getDuration()
  {
    return this.duration;
  }
  
  // all setters
  public void setDate(Date date)
  {
    this.date=date;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setDuration(int duration)
  {
    this.duration=duration;
  }
}