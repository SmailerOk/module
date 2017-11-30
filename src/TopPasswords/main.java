package TopPasswords;

import TopPasswords.FileWorker.FileWorker;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/TopPasswords/FileWorker/accountData";
        System.out.println(FileWorker.getPassword(fileName));
        System.out.println(FileWorker.getMostFamousPassword(FileWorker.getPassword(fileName)));
    }
}
