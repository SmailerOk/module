package Horse;

public class Horse {
    public static void horseMove(int x, int y, int x1, int y1){
        if ((x1 == (x + 1) & ((y1 == (y + 2)) | (y1 == (y - 2)))) | ((x1 == (x - 1) & ((y1 == (y + 2)) | (y1 == (y - 2)))))){
            System.out.println("You can go there");
        } else {
            System.out.println("You can't go there");
        }
    }
}
