package Serialazeble;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {

    public static void main(String[] args) {
        Human human1 = new Human("Bob", 35);
        Human human2 = new Human("Tom", 37);

        try {
            FileOutputStream fos = new FileOutputStream("writeAndRead.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(human2); //записываем объекты в файл...
            oos.writeObject(human1);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
