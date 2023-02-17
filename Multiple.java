package ChapterTwo;

import java.util.Random;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer");
        int num1 = input.nextInt();

        System.out.print("Enter Second integer");
        int num2 = input.nextInt();

        int cubeOFNum1 = (num1 * num1 * num1);
        int SquareOfNum2 =(num2 * num2);

        if (cubeOFNum1 % SquareOfNum2 == 0) {
            System.out.println("cube of first number is the square of second number");

        } if(cubeOFNum1 % SquareOfNum2!=0){
            System.out.println("cube of first number is not the square of second number");

        }


    }
}