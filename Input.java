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
        int a = 55;
        while (number1 != a || number2 != a || number3 != a || number4 != a || number5 != a) {
            if (number1 == a) {
                System.out.println("You' ve got 1 number: " + number1);
                break;
            } else if (number1 < a){
                a = numbers.nextInt(35) + 1;
            } else {
                a = numbers.nextInt(35) + 1;
            }

            if (number2 == a) {
                System.out.println("You' ve got the 2nd number: " + number2);
                break;
            } else if (number2 < a){
                a = numbers.nextInt(49) + 1;
            } else {
                a = numbers.nextInt(49) + 1;
            }

            if (number3 == a) {
                System.out.println("You' ve got the 3rd number: " + number3);
                break;
            } else if (number3 < a){
                a = numbers.nextInt(49) + 1;
            } else {
                a = numbers.nextInt(49) + 1;
            }

            if (number4 == a) {
                System.out.println("You' ve got the 4th number: " + number4);
                break;
            } else if (number4 < a){
                a = numbers.nextInt(49) + 1;
            } else {
                a = numbers.nextInt(49) + 1;
            }

            if (number5 == a) {
                System.out.println("You' ve got the 5th number: " + number5);
                break;
            } else if (number5 < a){
                a = numbers.nextInt(49) + 1;
            } else {
                a = numbers.nextInt(49) + 1;
            }

            x++;
        }
        System.out.println("For the chosen numbers you'd need like ... ");

        return x;
    }
}
