package dmreshet.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExStudent extends Student implements Externalizable {


    public ExStudent() {
        super("", "", 0);
    }

    public ExStudent(String surName, String name, int age) {
        super(surName, name, age);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        String s = surName + "\n" + name + "\n" + age  + "\n";
        out.write(s.getBytes());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (i != -1) {
            //reader.read() may throw IOException
            i = in.read();
            sb.append((char) i);
        }
        String[] sa = sb.toString().split("\n");
        surName = sa[0];
        name = sa[1];
        age = Integer.valueOf(sa[2]);
    }
}
