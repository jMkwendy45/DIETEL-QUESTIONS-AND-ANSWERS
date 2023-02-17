package ChapterTwo;

import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int radius = input.nextInt();
        System.out.println("diameter is\n"+2*radius);
        System.out.println("circumference is\n"+2*3.14159*radius);
        System.out.println("area\n"  +3.14159*radius*radius);

    }
}
