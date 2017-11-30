package DifferentNumber;

import java.util.*;

public class amountOfUniqueElements {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 3, 2, 5, 4, 3, 1, 2, 5};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < array.length;i++){
            numbers.add(array[i]);
        }
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Unique elements number: " + uniqueNumbers.size());
    }
}
