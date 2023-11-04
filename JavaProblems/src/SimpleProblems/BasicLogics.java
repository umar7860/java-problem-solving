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
}

