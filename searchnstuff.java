/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10;
import java.util.Arrays;
/**
 *
 * @author NeelS
 */
public class searchnstuff {
    public static int LinearSearch(int whattofind, int[] array){
        for(int i = 0; i<array.length;i++){
            if(whattofind==array[i])
                return i;
    }
        return -1;
}
    public static int BinarySearch(int whattofind, int[] array){
        int mid = array.length/2;
        if(whattofind == array[mid])
            return mid;
        else if(whattofind < array[mid])
            return BinarySearch(whattofind, Arrays.copyOfRange(array, 0, mid));
        else if(whattofind > array[mid])
            return mid+1+BinarySearch(whattofind, Arrays.copyOfRange(array, mid+1, array.length));
        return -1;
    }
    public static int[] SelectionSort(int[] array){
        //find smallest element and put it to the left
        for(int i =0; i<array.length-1;i++){
            int index = i;
            for(int j = i+1; j<array.length; j++){
                if (array[j]<array[index]){
                    index=j;
                }
            }
            int smallerNumber = array[index];
            array[index]=array[i];
            array[i]=smallerNumber;
        }
        return array;
    }
    public static int[] InsertSort(int[] array){
        for(int i = 1; i<array.length; i++){
            for(int j = i+1; j>0; j--){
                if(array[i]>array[j]){
                    array[i]=array[j];
                }
            }
    }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,8,99};
        System.out.println("index: " + LinearSearch(99, array));
        System.out.println("index: "+ BinarySearch(99,array));
        
        int[] barray = {5,8,3,9,4};
        barray = SelectionSort(barray);
        for(int i: barray)
            System.out.print(i+" ");
    }
}

