/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author NeelS
 */
public class Date {
    private int day;
    private int month;
    private String stringmonth;
    private int year;
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
        if(month == 1)
            stringmonth="January";
        if(month == 2)
            stringmonth="February";
        if(month == 3)
            stringmonth="March";
        if(month == 4)
            stringmonth="April";
        if(month == 5)
            stringmonth="May";
        if(month == 6)
            stringmonth="June";
        if(month == 7)
            stringmonth="July";
        if(month == 8)
            stringmonth="August";
        if(month == 9)
            stringmonth="September";
        if(month == 10)
            stringmonth="October";
        if(month == 11)
            stringmonth="November";
        if(month == 12)
            stringmonth="December";
    }
    public Date(String stringmonth, int day, int year){
        this.day=day;
        this.year=year;
        this.stringmonth=stringmonth;
        if(stringmonth.equals("January"))
            month=1;
        if(stringmonth.equals("February"))
            month=2;
        if(stringmonth.equals("March"))
            month=3;
        if(stringmonth.equals("April"))
            month=4;
        if(stringmonth.equals("May"))
            month=5;
        if(stringmonth.equals("June"))
            month=6;
        if(stringmonth.equals("July"))
            month=7;
        if(stringmonth.equals("August"))
            month=8;
        if(stringmonth.equals("September"))
            month=9;
        if(stringmonth.equals("October"))
            month=10;
        if(stringmonth.equals("November"))
            month=11;
        if(stringmonth.equals("December"))
            month=12;
    }
    public int getMonth(){
        return month;
    }
    public void Display(){
        System.out.printf("%d/%d/%d\n", month, day, year);
        System.out.printf("%s %d, %d\n", stringmonth, day, year);
    }

}
