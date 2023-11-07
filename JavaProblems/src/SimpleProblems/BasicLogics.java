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

    public  void performReverse(String str) {

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
}

