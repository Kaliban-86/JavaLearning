package ExceptionTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestExeption {
    public static void main(String[] args) {
        File file1 = new File("someFile1");

        try {
            Scanner scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден"); // обрабатываем исключение в блоке catch
        }
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner2.nextLine());
            if (x != 0) {
                try {
                    throw new MyExeption();
                } catch (MyExeption myExeption) {
                    myExeption.showInfo();
                }
            }
        }
    }
}
