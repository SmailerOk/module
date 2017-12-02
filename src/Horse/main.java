package Horse;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Input Horse position: x & y");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> moves = new ArrayList<Integer>();
        moves.add(scanner.nextInt());
        moves.add(scanner.nextInt());
        System.out.println("Where horse should go? x & y");
        moves.add(scanner.nextInt());
        moves.add(scanner.nextInt());
        if (Horse.inputValidation(moves)){
            Horse.horseMove(moves);
        } else System.out.println("You enter incorrect data");
    }
}
