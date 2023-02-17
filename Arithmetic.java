package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer");
        int number1 = input.nextInt();
        System.out.println("enter second integer");
        int number2 = input.nextInt();

        int square1 = number1+number1;
        int square2 = number2 + number2;

        int sum = square1 +square2;
        int difference = square1-square2;

        System.out.println("square of first integer is"+square1);
        System.out.println("square of second number is"+square2);
        System.out.println("sum of square numbers is"+sum);
        System.out.println("difference of numbers is"+difference);

    }
}