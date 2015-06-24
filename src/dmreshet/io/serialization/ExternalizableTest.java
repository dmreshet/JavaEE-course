package dmreshet.io.serialization;

import java.io.*;

public class ExternalizableTest {
    public static void main(String[] args) {
        String filename = "extStudent.ser";
        ExStudent exStudent = new ExStudent ("Ivanov", "Ivan", 35);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            exStudent.writeExternal(out);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        ExStudent student = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            student = new ExStudent();
            student.readExternal(in);
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        // распечатать восстановленное время
        System.out.println("IerarhMan: " + student);
        System.out.println();
    }
}
