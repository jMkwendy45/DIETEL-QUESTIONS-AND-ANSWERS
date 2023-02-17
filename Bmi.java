package ChapterTwo;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter Weight In Pounds");
        double pounds= input.nextDouble();
        System.out.println("Enter Height In Inches");
        double inches= input.nextDouble();

        double weight=pounds*0.45359237;
        double height= inches*0.0254;

        double bmi = weight/height*height;

        System.out.print("Bmi is " +bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("over Weight");
        }
        else {
            System.out.println("obese");
        }

    }
}
