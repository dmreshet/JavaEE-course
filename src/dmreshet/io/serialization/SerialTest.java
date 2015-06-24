package dmreshet.io.serialization;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) {
        String filename = "student.ser";
        Student time = new Student("Ivanov", "Ivan", 35);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Student student = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            student = (Student) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        // распечатать восстановленное время
        System.out.println("IerarhMan: " + student.toString());
        System.out.println();
    }
}
