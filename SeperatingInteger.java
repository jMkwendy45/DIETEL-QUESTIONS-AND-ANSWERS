package ChapterTwo;

import java.util.Scanner;

public class SeperatingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit integer");
        int number = input.nextInt();

        if (number!=5){
            System.out.println("please put a five digit number");
        }

        int seperatedNumber1 = number/10000;
        number%=10000;
        System.out.println(seperatedNumber1);

        int seperatedNumber2 = number/1000;
        number%=1000;
        System.out.println(seperatedNumber2);

        int seperatedNumber3 = number/100;
        number%=100;
        System.out.println(seperatedNumber3);

        int seperatedNumber4 = number/10;
        number%=10;
        System.out.println(seperatedNumber4);

        int seperated5 = number;

        System.out.println(seperated5);
        System.out.printf("%3d%3d%3d%3d%3d\n",seperatedNumber1,seperatedNumber2,seperatedNumber3,
                seperatedNumber4,seperated5);



    }
}
