package dmreshet.io.serialization;

public class Student extends Human {
//    static final long serialVersionUID = 10275539472837495L

    protected String name;
    protected String surName;
    protected transient int age;


    public Student(String surName, String name, int age) {
        super("Saratov");
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
