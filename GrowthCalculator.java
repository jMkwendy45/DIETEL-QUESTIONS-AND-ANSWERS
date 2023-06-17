package ChapterTwo;

import java.util.Scanner;

public class GrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter world popluation");
        long worldPopulation = input.nextLong();
        System.out.println("Enter annual growth rate");
        double growthRate = input.nextDouble();


        for (int i = 1; i < 6; i++) {worldPopulation *= growthRate;
            System.out.printf("%d years = %d\n", i, worldPopulation);
        }
    }
}
