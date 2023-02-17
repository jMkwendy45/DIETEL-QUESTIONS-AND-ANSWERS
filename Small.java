package ChapterTwo;

import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int largest;
        int smallest;


        System.out.print("Enter a number");
        int a=input.nextInt();
        System.out.print("Enter second number");
        int b=input.nextInt();
        System.out.print("Enter third number");
        int c =input.nextInt();

        int sum = a+b+c;

        int product=a*b*c;

        int average = a+b+c/3;


        smallest =
        largest  = a;

        if(b > largest)
            largest = b;

        if(c > largest)
            largest = c;

        if(b < smallest)
            smallest = b;

        if (c < smallest)
            smallest = c;


        System.out.printf("The sum is %d%n " ,  sum);

        System.out.printf("The average is %d%n " ,  average);

        System.out.printf("The product is %d%n " , product);

        System.out.printf("Largest of three integers is %d%n " , largest);

        System.out.printf("Smallest of three integers is %d%n " , smallest);

    }















    }

