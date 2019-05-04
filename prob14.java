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
public class prob14 {
    public static void main(String[] args) {
            Date abday = new Date(11,11,11);
            CommissionEmployee a = new CommissionEmployee("John","a",1234,abday, 100,100);
            HourlyEmployee b = new HourlyEmployee("Joe","b",433,new Date(10,10,10), 40, 100);
            PieceWorker c = new PieceWorker("Adam","Brown",344,new Date(6,6,6), 10, 100);
    
            Employee[] arrayofsunshine = {a, b, c};
            for(Employee i: arrayofsunshine){
                System.out.println(i.toString());
                System.out.println("Earnings: "+ i.earnings()+"\n");
            }
                    
                    
   }
}
class PieceWorker extends Employee{
    private int piece;
    private double wage;
    public PieceWorker(String a, String b, int c, Date d, int piece, int wage){
        super(a,b,c,d);
        this.piece=piece;
        this.wage=wage;
    }
    public double earnings(){
        return piece*wage;
    }
}