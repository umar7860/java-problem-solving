package SimpleProblems;

public class BasicLogics {

    public void swapNumbersUsingThirdVariable(int a, int b) {
        System.out.println("Before Swapping");
        System.out.println("A=" + a + " and B=" + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping");
        System.out.println("A=" + a + " and B=" + b);
    }

    public void swapNumbersWithOutVariable(int a, int b) {
        System.out.println("Before Swapping");
        System.out.println("A=" + a + " and B=" + b);
        // a = 2 , b = 5
        a = a + b; // 7
        b = a - b; // 7 - 5 = 2
        a = a - b; // 7 - 2 = 5

        System.out.println("After Swapping");
        System.out.println("A=" + a + " and B=" + b);
    }

    public void fibonacciSeries(int endingPoint) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < endingPoint; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public void sumOfNumber(int number) {
        System.out.println("\n\n");
        int sum = 0;
        int x = 0;
        while (number > 0) {
            x = number % 10;
            sum = sum + x;
            number = number / 10;
        }
        System.out.println("Sum is: " + sum);
    }

    public void armstrongNumber(int number) {
        System.out.println("\n\n");

        int sumOfCube = 0, a, temp;
        temp = number;
        while (number > 0) {
            a = number % 10; //Getting last digit
            number = number / 10;  //Removing last digit from number
            sumOfCube = sumOfCube + (a * a * a); //Calculating sum of cubes of digits
        }
        if (temp == sumOfCube)
            System.out.println(temp + " is an armstrong number");
        else
            System.out.println(temp + "is not an armstrong number");
    }


    // Function to check if a number is perfect
    public void isPerfectNumber(int number) {
        System.out.println("\n\n");

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println("Number is Perfect:" + String.valueOf(sum == number && number != 1));
    }

    //Prime number

    public void isPrime(int number) {
        int div = 0;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                div++;
            }
        }
        if (div == 0) {
            System.out.println("Number is Prime Number");
        } else {
            System.out.println("Number is not Prime Number");
        }
    }

    //Factorial of a number

    public void factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }

    //Reverse String

    public void performStringReverse(String str) {

        StringBuilder newString = new StringBuilder(str);
        newString.reverse();

        //Showing reverse string
        System.out.println("Reverse string using StringBuilder: " + newString.toString());

        //Reverse string using string iteration
        //Converting string to character array
        char ch[] = str.toCharArray();
        String reverseString = "";
        //Reverse string using character array
        for (int i = ch.length - 1; i >= 0; i--) {
            reverseString += ch[i];
        }
        //Showing reverse string
        System.out.println("Reverse string using string iteration: " + reverseString);
    }

    //Creating performReverse() method to reverse a number
    public void performNumberReverse(int number) {
        int rev = 0;
        int temp = number;
        while (number != 0) {
            //Calculating reminder
            int rem = number % 10;
            //multiplying variable reverse by 10 and adding the reminder into it
            rev = rev * 10 + rem;
            //Divide the number
            number = number / 10;
        }
        System.out.println(rev + " is the reverse of the number " + temp);
    }

    //Palindrome Number
    public void checkPalindrome(int number) {
        int rem, sum = 0, temp;
        //Storing value of number into temp variable
        temp = number;

        //Reversing number
        while (number > 0) {
            rem = number % 10;  //getting remainder
            sum = (sum * 10) + rem;
            number = number / 10;
        }

        //Checking whether the reversing number is equal to the number or not
        if (temp == sum)
            System.out.println(temp + " is a palindrome number");
        else
            System.out.println(temp + "is not a palindrome");
    }

    //Creating checkPalindrome() method to check string
    public void checkPalindromeString(String str) {
        String rev = "";
        int length;

        //Getting length of the string
        length = str.length();

        //Reversing string
        for (int j = length - 1; j >= 0; j--)
            rev = rev + str.charAt(j);

        if (str.equals(rev))
            System.out.println(str + " is a palindrome string.");
        else
            System.out.println(str + " is not a palindrome string.");
    }
    public  void findDuplicates(String str) {
        int count;

        //Converting given string into character array
        char strArray[] = str.toCharArray();

        System.out.println(" Duplicate characters in a given string:  ");
        //Counting each character present in the string
        for (int i = 0; i < strArray.length; i++) {
            count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i] == strArray[j] && strArray[i] != ' ') {
                    count++;
                    //Set strArray[j] to 0 to avoid printing visited character
                    strArray[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && strArray[i] != '0')
                System.out.println(str + " contains " + strArray[i] + " " + count +  " times");
        }
    }
}

