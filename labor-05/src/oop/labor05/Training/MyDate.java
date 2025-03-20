package oop.labor05.Training;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String toString() {
        return "Date: (" + year + "." + month + "." + day +")";
    }
}
