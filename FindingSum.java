package ChapterTwo;

import java.util.Scanner;

public class FindingSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Integer");
        int a = input.nextInt();
        System.out.print("Enter Second Integer");
        int b = input.nextInt();

// squares of the numbers
        System.out.println(a*a);
        System.out.println(b*b);

        // sum of squares
        System.out.println(a*a+b*b);

        // difference
       System.out.println(a*a - b*b );



    }

}
