package ReadFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; //это разделитель для разных операционных систем
        String path = "C:" + separator + "Users" + separator + "VadimWork" + separator + "Desktop" + separator + "Проект Control" + separator + "Задача"; //это путь для чтения файла


        File file = new File("TestFile"); // создание объекта класса File  с указанием ему пути до файла, можно имя файла если он в папке проекта
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();


        String[] stringArray = line.split(" ");

        for (String s : stringArray) {
            System.out.print(s + " ");
        }

          System.out.println(java.util.Arrays.toString(stringArray));

    }
}
