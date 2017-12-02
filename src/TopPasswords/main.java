package TopPasswords;

import TopPasswords.FileWorker.FileWorker;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/TopPasswords/FileWorker/accountData";
        System.out.println(FileWorker.getPasswordFromFile(fileName));
        Map<Integer, Integer> passwords = (FileWorker.getPasswords(FileWorker.getPasswordFromFile(fileName)));
        List<String> list = passwords.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .map(a ->"Password " +a.getKey()).collect(Collectors.toList());
        System.out.println(list);
        for (int i = 0; i < 10; i++){
            System.out.println("Number " + i+1 + " is: " + list.get(i));
        }
    }
}
