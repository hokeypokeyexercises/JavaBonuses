package src;

import com.sun.tools.javac.util.ArrayUtils;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

public class Bounuses {

    public static void main(String[] args) {



        //prime();
        //array();





    }



//        2) write a loop which will output all the prime
//        numbers (evenly divisible by only 1 and themselves)
//        between 10 and 10000 .


public static void prime(){

    int num = 10;
    while (num <= 1000) {

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number");
        }
    num += 1;
    }
}

//8) Given an array of ints length 3, return a new array
// with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
//    Examples
//
//    reverse3([1, 2, 3]) → 3,2,1
//    reverse3([5, 11, 9]) → 9,11,5
//    reverse3([7, 0, 0]) → 0,0,7


public static void array(){

    int[] sample = new int[]{1,2,3,4,5};
    int size = sample.length;
    int[] reverseSample = IntStream.range(0,size).map(i -> sample[size-i-1]).toArray();
        for (int i = 0; i < reverseSample.length; i++){
            System.out.print(reverseSample[i] + ",");
        }
    System.out.println();



//    my way

    ArrayList wArray = new ArrayList();
    for (int i = sample.length-1; i >= 0; i--){
        wArray.add(sample[i]);
    }
    System.out.print(wArray);



}



//9) Given a string of even length, return a string made of
// the middle two chars, so the string "string" yields "ri". The string
// length will be at least 2.
//
//    Examples
//
//    middleTwo('string') →
//    middleTwo('code') →
//    middleTwo('Practice') →


}
