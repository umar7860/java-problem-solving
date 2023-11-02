import SimpleProblems.BasicLogics;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        //With variable
        BasicLogics basicLogics = new BasicLogics();
        basicLogics.swapNumbersUsingThirdVariable(40,50);

        //Without variable
        basicLogics.swapNumbersWithOutVariable(50,100);

        //fibonacciSeries
        basicLogics.fibonacciSeries(20);
    }
}