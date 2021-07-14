package Serialazeble;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("writeAndRead.bin"))) {
            //FileInputStream fis = new FileInputStream("writeAndRead.bin"); это то что было до использования синтаксиа try with resource.
            //ObjectInputStream ois = new ObjectInputStream(fis);

            Human human1 = (Human) ois.readObject();
            Human human2 = (Human) ois.readObject();
            Human[] people = (Human[]) ois.readObject();

            System.out.println(human1);
            System.out.println(human2);
            System.out.println(Arrays.toString(people));

            //ois.close();  при использовании синтаксиса try with resource  можно не закрывать поток.

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
