package WrihtFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WrihtFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        int x = 32;
        File file = new File("SomeFile");
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < 7; i++) {
            printWriter.println("Hellow number " + (x + i));
        }
        printWriter.close(); // обязательно нужно закрывать!!!!
    }
}
