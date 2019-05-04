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
public class Palindrome {
    public static String removeSpace(String a){ //METHOD TO REMOVE SPACES FROM
        String b = " ";                         //STRING TO MAKE PALINDROME TEST
        for(int i =0; i<a.length();i++){        //WORK FOR MORE CASES
               if((int)a.charAt(i)==(int)b.charAt(0))
                a=a.substring(0,i)+a.substring(i+1);
        }
        return a;
    }
    public static boolean testPalindrome(String a){ //TEST PALINDROME METHOD
        Boolean ans = true; //Start at true
        a = removeSpace(a); //Removes Spaces
        while(ans==true){ //Loop only works while ans is true, or else method returns false
            if(a.length()==2 && (int)a.charAt(0)==(int)a.charAt(1)) //base case for 2 character string
                return true;
            if(a.length()==1) //base case for 1 character string
                return true;
            if((int)a.charAt(0) != (int)a.charAt(a.length()-1)) //test if first and last characters are the same
                ans=false;
            else{ //If the first and last characters are the same, delete them and run the method again
                a=a.substring(1,a.length()-1);
                testPalindrome(a);
            }  
    }
        return false;
}
    public static void main(String[] args) {
        System.out.println(testPalindrome("a man a plan a canal panama"));
    }
}