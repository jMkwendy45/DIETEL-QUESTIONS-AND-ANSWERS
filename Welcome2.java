package ChapterTwo;

import java.util.Scanner;

public class  Welcome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System .in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        if (number1==number2){
            System.out.printf("%d==%d%n",number1,number2);
        }
        if (number1!=number2){
            System.out.printf("%d!=%d%n",number1,number2);
        }
        if (number1<number2){
            System.out.printf("%d<%d%n",number1,number2);
        }
        if (number1>number2){
            System.out.printf("%d>%d%n",number1,number2);
        }
    }
}
