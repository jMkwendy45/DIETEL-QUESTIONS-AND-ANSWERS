package ChapterTwo;

import java.util.Scanner;

public class ZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer");
        int num1 = input.nextInt();
        System.out.print("Enter second integer");
        int num2 = input.nextInt();
        System.out.print("Enter third integer");
        int num3 = input.nextInt();
        System.out.print("Enter fourth integer");
        int num4 = input.nextInt();
        System.out.print("Enter fifth integer");
        int num5 = input.nextInt();
         // negative number inputs;
        if (num1 <= -1) {
            System.out.println(num1);
        }
        if (num2 <= -1) {
            System.out.println(num2);
        }
        if (num3 <= -1) {
            System.out.println(num3);
        }
        if (num4 <= -1) {
            System.out.println(num4);
        }
        if (num5 <= -1) {
            System.out.println(num1);
        }

           // positive number inputs;

           if (num1 >= +1) {
            System.out.println(num1);
            }
            if (num2 >= +1) {
                System.out.println(num2);

            }
           if (num3>=+1){
            System.out.println(num3);
        }
            if (num4>=+1) {
              System.out.println(num4);
          }
            if (num4>=+1) {
                System.out.println(num4);
            }
            if (num5>=+1) {
                    System.out.println(num5);
            }

           // Zero values;
            if (num1==0) {
               System.out.println(num1);
           }
           if (num2==0) {
               System.out.println(num2);
           }
            if (num3==0) {
                System.out.println(num3);
            }
          if (num4==0) {
            System.out.println(num4);
          }
          if (num5==0) {
            System.out.println(num5);
        }
      }
    }


