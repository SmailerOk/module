package GuessRandomNumber;

import java.util.Random;
import java.util.Scanner;

public class guessRandomNumber {
    public static void main(String[] args) {
        System.out.println("Enter biggest amount of random value:");
        Scanner scanner = new Scanner(System.in);
        int biggestNumber = scanner.nextInt();
        System.out.println("Try to guess the number");
        int enteredNumber = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(biggestNumber);
        int amountOfTry = random.nextInt(10);
        for (int i = 0; i < amountOfTry; i++){
            if (enteredNumber == randomNumber){
                System.out.println("Good shoot!");
                break;
            } else {
                if (enteredNumber < randomNumber){
                    System.out.println("Wrong! Number should be bigger! Try again:");
                    enteredNumber = scanner.nextInt();
                } else {
                    System.out.println("Wrong! Number should be smaller! Try again:");
                    enteredNumber = scanner.nextInt();
                }

            }
        }
    }
}
