package TopPasswords.FileWorker;

import java.io.*;
import java.util.*;

public class FileWorker {
    public static ArrayList<Integer> getPasswordFromFile (String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> arrayString = new ArrayList<String>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            arrayString.add(line);
        }
        reader.close();
        ArrayList<Integer> passwords = new ArrayList<Integer>();
        for (int i = 0; i < arrayString.size(); i++){
            passwords.add(Integer.parseInt(arrayString.get(i).split(" ")[1]));
        }
        return passwords;
    }

    public static Map<Integer, Integer> getPasswords(ArrayList<Integer> passwords){
        Map<Integer,Integer> integersCount = new HashMap<>();
        for (Integer i : passwords){
            if (!integersCount.containsKey(i))
                integersCount.put(i, 1);
            else
                integersCount.put(i, integersCount.get(i) + 1);
        }
        return integersCount;
    }


}