import SimpleProblems.BasicLogics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        //With variable
        BasicLogics basicLogics = new BasicLogics();
        basicLogics.swapNumbersUsingThirdVariable(40, 50);

        //Without variable
        basicLogics.swapNumbersWithOutVariable(50, 100);

        //fibonacciSeries
        basicLogics.fibonacciSeries(20);

        //sum of int
        basicLogics.sumOfNumber(12348);

        //ArmstrongNumber number
        basicLogics.armstrongNumber(153);

        //Perfect Number
        basicLogics.isPerfectNumber(28);

        //Prime Number
        basicLogics.isPrime(9);

        //Factorial
        basicLogics.factorial(8);

        //Reverse String  
        basicLogics.performStringReverse("UMAR AFTAB");

        //Reverse a number
        basicLogics.performNumberReverse(234567);

        //Palindrome number
        basicLogics.checkPalindrome(232);
        basicLogics.checkPalindrome(12345);

        //Palindrome String
        basicLogics.checkPalindromeString("AUAUAU");
        basicLogics.checkPalindromeString("AAA");

        //duplicate character in String
        basicLogics.findDuplicates("AAAAABBBBBBCCCC");


        //Remove elements from array
        // Get the array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: "
                + Arrays.toString(arr));
        int index = 2;
        System.out.println("Index to be removed: " + index);

        // Remove the element from array
        arr = basicLogics.removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}