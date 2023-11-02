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
}
