import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator myCalculator = new Calculator();
        String operation = "";
        String[] strArr;
        int firstNum;
        int secondNum;

        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter a command: ");

        while(!Objects.equals(operation, "q")) {
            strArr = in.nextLine().split(" ");
            operation = strArr[0];
            if (Objects.equals(operation, "q")) {
                break;
            }
            firstNum = Integer.parseInt(strArr[1]);

            if (strArr.length == 2) {
                if (Objects.equals(operation, "fibonacci")) {
                    System.out.println(myCalculator.fibonacciNumberFinder(firstNum));
                } else if (Objects.equals(operation, "binary")) {
                    System.out.println(myCalculator.intToBinaryNumber(firstNum));
                }
            } else {
                secondNum = Integer.parseInt(strArr[2]);

                if (Objects.equals(operation, "add")) {
                    System.out.println(myCalculator.add(firstNum, secondNum));
                } else if (Objects.equals(operation, "subtract")) {
                    System.out.println(myCalculator.subtract(firstNum, secondNum));
                } else if (Objects.equals(operation, "multiply")) {
                    System.out.println(myCalculator.multiply(firstNum, secondNum));
                } else if (Objects.equals(operation, "divide")) {
                    System.out.println(myCalculator.divide(firstNum, secondNum));
                }
            }
        }
        System.out.println("Goodbye!");
    }

}
