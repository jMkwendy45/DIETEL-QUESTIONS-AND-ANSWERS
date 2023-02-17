package ChapterTwo;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer");
        int number = input.nextInt();
        int square = number+number;
        System.out.println("the square of number is"+square);

        if(number==100){
            System.out.println("the number is equals to"+number);
        }
        if(number!=100){
            System.out.println("the number is not greater than"+number);
        }
        if(number<100){
            System.out.println("the number is less than "+number);
        }
        if (square==100){
            System.out.println("square is greater than number"+square);

        }
        if (square!=100){
            System.out.println("square of number is not"+square);
        }

    }
}
