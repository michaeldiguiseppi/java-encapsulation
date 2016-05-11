public class Time {

  //make these private
  private int hour;
  private int minute;
  private int second;

  public void displayTime() {
    System.out.println("The time is: " + hour + ":" + minute + ":" + second);
  }

  public int getHour() {
    return this.hour;
  }

  public void setHour(int h) {
    this.hour = h;
  }

  public int getMinute() {
    return this.minute;
  }

  public void setMinute(int m) {
    this.minute = m;
  }

  public int getSecond() {
    return this.second;
  }

  public void setSecond(int s) {
    this.second = s;
  }

}
