import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class JavaBonus {
    public static void main(String[] args) {
    
//        String string = "Here is a test string";
//
//        StringBuilder reverse = new StringBuilder();
//
//        // append a string into StringBuilder input1
//        reverse.append(string);
//
//        // reverse StringBuilder input1
//        reverse = reverse.reverse();
//
//        // print reversed String
//        System.out.println(reverse);

//        String original, reverse = ""; // Objects of String class
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a string without spaces to determine if it's a palindrome: ");
//        original = in.nextLine();
//
//        int length = original.length();
//
//        for (int i = length - 1; i >= 0; i--)
//            reverse = reverse + original.charAt(i);
//
//        if (original.equals(reverse))
//            System.out.println("The string is a palindrome.");
//        else
//            System.out.println("The string isn't a palindrome.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.next();
        System.out.println("Enter a second string: ");
        String input2 = scanner.next();

        if ((input.substring(input.length() -1).equals(input2.substring(0, 1)))) {
            input = input.substring(0, input.length() - 1);
            System.out.println(input + input2);

        } else
            System.out.println(input + input2);


    }
}


//        4) Read in a string and write out the reverse string: Java String -> gnirtS avaJ

//        5) Tell whether a given string is a palindrome

//        6) Given two strings, append them together (known as "concatenation") and return the result.
//        However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and
//        "cat" yields "abcat".

//        Examples
//        conCat('abc', 'cat') → abcat
//        conCat('dog', 'cat') → dogcat
//        conCat('abc', '') → abc
