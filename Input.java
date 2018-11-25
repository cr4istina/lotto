package loto;

import java.util.Random;
import java.util.Scanner;

public class Input {

    static int attempts() {
        System.out.println("Please enter 5 numbers from 1 to 35: ");

        Scanner theNumbers = new Scanner(System.in);
        int number1 = theNumbers.nextInt();
        int number2 = theNumbers.nextInt();
        int number3 = theNumbers.nextInt();
        int number4 = theNumbers.nextInt();
        int number5 = theNumbers.nextInt();

        Random numbers = new Random();

        int x = 0;
        int a = 36;
        int b = 36;
        int c  = 36;
        int d = 36;
        int e = 36;

        while (number1 != a) {
            a = numbers.nextInt(35) + 1;
            if (number1 == a) {
                System.out.println("You've got 1st number: " + a);
                break;
            }
            x++;
        }

        while (number2 != b) {
            b = numbers.nextInt(35) + 1;
            if (number2 == b) {
                System.out.println("You've got the 2nd number: " + b);
                break;
            }
            x++;
        }

        while (number3 != c) {
            c = numbers.nextInt(35) + 1;
            if (number3 == c) {
                System.out.println("You've got the 3rd number: " + c);
                break;
            }
            x++;
        }

        while (number4 != d) {
            d = numbers.nextInt(35) + 1;
            if (number4 == d) {
                System.out.println("You've got the 4th number: " + d);
                break;
            }
            x++;
        }

        while (number5 != e) {
            e = numbers.nextInt(35) + 1;
            if (number5 == e) {
                System.out.println("You've got the 5th number: " + e);
                break;
            }
            x++;
        }

        System.out.println("The numbers of attempt to match your numbers is: ");
        return x;
    }
}
