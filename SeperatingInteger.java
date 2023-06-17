package ChapterTwo;

import java.util.Scanner;

public class SeperatingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit integer");
        int number = input.nextInt();

        int seperatedNumber1 = number/10000;
        number%=10000;

        int seperatedNumber2 = number/1000;
        number%=1000;

        int seperatedNumber3 = number/100;
        number%=100;

        int seperatedNumber4 = number/10;
        number%=10;

        int seperated5 = number;

        System.out.printf("%3d%3d%3d%3d%3d\n",seperatedNumber1,seperatedNumber2,seperatedNumber3,
                seperatedNumber4,seperated5);



    }
}
