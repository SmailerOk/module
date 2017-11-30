package Horse;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Input Horse position: x & y");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Where horse should go? x & y");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        Horse.horseMove(x, y, x1, y1);
    }
}
