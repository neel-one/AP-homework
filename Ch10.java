/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10;

/**
 *
 * @author NeelS
 */
public class Ch10 {
        public static void main(String[] args) {
            Date abday = new Date(11,11,11);
            CommissionEmployee a = new CommissionEmployee("John","a",1234,abday, 100,100);
            //System.out.println(a.toString());
            HourlyEmployee b = new HourlyEmployee("Joe","b",433,new Date(10,10,10), 40, 100);
            //System.out.println(b.toString());
            Date today = new Date(3, 11, 2021);
            
            Employee[] arrayofsunshine = new Employee[2];
            arrayofsunshine[0] = a; arrayofsunshine[1]= b;
            
            for(Employee i: arrayofsunshine){
                if(today.getMonth() == i.getBirthMonth())
                    System.out.println(i.earnings()+100 +" Birthday Bonus for: "+i.getFirstName());
                else
                    System.out.println(i.earnings());
    }
    
}
}
abstract class Employee{
    protected String firstName;
    protected String lastName;
    protected int socialSecurityNumber;
    protected Date bday;
    public Employee(String fn, String ln, int ssn, Date bday){
        firstName = fn;
        lastName = ln;
        socialSecurityNumber = ssn;
        this.bday = bday;
    }
    public abstract double earnings();
  
    protected String getFirstName(){
        return firstName;
    }
    protected int getBirthMonth(){
        return bday.getMonth();
    }
    protected String getLastName(){
        return lastName;
    }
    protected int getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public String toString(){
        return String.format("%s %s%n%s: %d", getFirstName(),getLastName(),
        "ssn", getSocialSecurityNumber());
    }
}
class CommissionEmployee extends Employee{
    protected double grossSales;
    protected double commissionRate;
    public CommissionEmployee(String fn, String ln, int ssn, Date bday, 
            double grossSales, double comissionRate){
        super(fn, ln, ssn, bday);
        this.grossSales = grossSales;
        this.commissionRate=comissionRate;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }
    public String toString(){
        return String.format("%s%n%s: %f%n%s: %f",
                super.toString(), "Gross Sales",getGrossSales(),
                "Commission Rate", getCommissionRate());    
    }
}

class HourlyEmployee extends Employee{
    private double hours;
    private double wage;
    public HourlyEmployee(String fn, String ln, int ssn, Date bday, double wage, double hours){
        super(fn, ln, ssn, bday);
        this.wage=wage;
        this.hours=hours;
    }
    public void setWage(double wage){
        if(wage < 0)
            throw new IllegalArgumentException("wage must be above 0");
        this.wage=wage;
    }
    public void setHours(double hours){
        if(hours <0 || hours>168)
            throw new IllegalArgumentException("0 to 168 hours in a week");
        this.hours=hours;
    }
    public double getWage(){
        return wage;
    }
    public double getHours(){
        return hours;
    }
    public double earnings(){
        if (getHours()<=40)
            return getWage()*getHours();
        return 40*wage + 1.5*wage*(getHours()-40);
    }
    public String toString(){
        return String.format("%s%n%s: %f%n%s: %f",
                super.toString(), "Hourly Wage",getWage(),
                "Hours worked", getHours());   
    }
}

}
