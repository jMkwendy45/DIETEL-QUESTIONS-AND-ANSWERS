package ChapterTwo;

import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeros=0;

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();

        System.out.println("enter third number");
        int number3 = input.nextInt();

        System.out.println("enter fourth number");
        int number4 = input.nextInt();;

        System.out.println("enter fifth number");
        int number5 = input.nextInt();


        if (number1>0)
            positiveNumber = positiveNumber+1;
        if (number2>0)
            positiveNumber = positiveNumber+1;
        if (number3>0)
            positiveNumber = positiveNumber+1;
        if (number4>0)
            positiveNumber= positiveNumber+1;
        if (number5>0)
            positiveNumber = positiveNumber+1;


        if (number1<0)
            negativeNumber = negativeNumber+1;
        if (number2<0)
            negativeNumber = negativeNumber+1;
        if (number3<0)
            negativeNumber= negativeNumber+1;
        if (number4<0)
            negativeNumber= negativeNumber+1;
        if (number5<0)
            negativeNumber = negativeNumber+1;


        if (number1==0)
            positiveNumber = positiveNumber+1;
        if (number2==0)
            positiveNumber = positiveNumber+1;
        if (number3==0)
            positiveNumber = positiveNumber+1;
        if (number4==0)
            positiveNumber= positiveNumber+1;
        if (number5==0)
            positiveNumber = positiveNumber+1;


        System.out.println("Negative numbers are = " +negativeNumber);
        System.out.println("Positive numbers are = " +positiveNumber);
        System.out.println("Zeros are = " +zeros);















        if (number1<0)
            negativeNumber = negativeNumber+1;
        if (number1==0)
            zeros = zeros+1;





    }
}
