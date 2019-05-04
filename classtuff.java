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
public class classtuff {
    public static int dothisthing(int x, int y){
        if(x==0)
            return y;
        return dothisthing(x-1, y)+x;
    }
    public static int logbase2(int n){
        if(n==1)
            return 0;
        return 1+logbase2(n/2);
    }
    public static void main(String[] args) {
        System.out.println(dothisthing(5,2));
    }
    
}
