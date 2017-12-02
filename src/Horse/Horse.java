package Horse;

import java.util.ArrayList;

public class Horse {
    public static void horseMove(ArrayList<Integer> moves){
        boolean correctMove = false;
        if(inputValidation(moves)){
            if (moves.get(2)-moves.get(0) == 2){
                if ((moves.get(3)-moves.get(1) == 1) | (moves.get(1)-moves.get(3) == 1)){
                    correctMove = true;
                }
            } else if (moves.get(2)-moves.get(0) == 1){
                if ((moves.get(3)-moves.get(1) == 2) | (moves.get(1)-moves.get(3) == 2)){
                    correctMove = true;
                }
            } else if (moves.get(0)-moves.get(2) == 2) {
                if ((moves.get(3) - moves.get(1) == 1) | (moves.get(1) - moves.get(3) == 1)) {
                    correctMove = true;
                }
            } else if (moves.get(0)-moves.get(2) == 1) {
                if ((moves.get(3) - moves.get(1) == 2) | (moves.get(1) - moves.get(3) == 2)) {
                    correctMove = true;
                }
            }
            if (correctMove){
                System.out.println("You can move your horse there");
            } else System.out.println("What are you doing? Horse can't move like that!");
        }
    }

    public static boolean inputValidation(ArrayList<Integer> moves){
        boolean inputIsValid = false;
        for (Integer move: moves){
           if (move > 0 && move < 9){
               inputIsValid = true;
           } else break;
       }
       return inputIsValid;
    }
}
