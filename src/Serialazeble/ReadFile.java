package Serialazeble;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("writeAndRead.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Human human1 = (Human) ois.readObject();
            Human human2 = (Human) ois.readObject();
            Human[] people = (Human[]) ois.readObject();

            System.out.println(human1);
            System.out.println(human2);
            System.out.println(Arrays.toString(people));

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
