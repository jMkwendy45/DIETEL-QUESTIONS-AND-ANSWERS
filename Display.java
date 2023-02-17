package ChapterTwo;

import java.util.Scanner;
public class Display {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter radius number");
        double number = input.nextDouble();
        double diameter =2*number;
        System.out.println(diameter);

        double circumference=2*3.14159*number;
        System.out.print( circumference);







    }

}
