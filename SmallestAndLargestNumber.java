package ChapterTwo;


import java.util.Scanner;

public class SmallestAndLargestNumber {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int smallest;
        int largest;

            System.out.println("Enter number one");
             int numberOne = input.nextInt();

           System.out.println("Enter number two");
            int numberTwo = input.nextInt();


            System.out.println("Enter number three");
            int numberThree = input.nextInt();


            System.out.println("Enter number four");
            int numberFour = input.nextInt();

            System.out.println("Enter number five");
            int numberFive = input.nextInt();

            smallest =numberOne;
            largest= numberOne;


            if(numberTwo<smallest)
                smallest = numberTwo;

            if (numberThree<smallest)
                smallest = numberThree;

            if(numberFour<smallest)
                smallest=numberFour;


            if (numberTwo>largest)
                largest = numberTwo;
            if(numberThree>largest)
                largest=numberThree;
            if(numberFour>largest)
                largest =numberFour;
            if (numberFive>largest)
                largest =numberFive;

        System.out.printf("Largest of five integers is %d%n " , largest);

        System.out.printf("Smallest of five integers is %d%n " , smallest);





    }
    }




