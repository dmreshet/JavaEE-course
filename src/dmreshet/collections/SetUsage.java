package dmreshet.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUsage {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student st = new Student("Masha", "Ivanova");
        Student st2 = new Student("Masha", "Ivanova");
        //then add hashCode/equals methods
        set.add(st);
        set.add(st2);
        st.setSecondName("Petrova");
        set.add(st);
        System.out.println(Arrays.deepToString(set.toArray()));
    }

    static class Student{
        String name;
        String secondName;

        public Student(String name, String secondName) {
            this.name = name;
            this.secondName = secondName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (!name.equals(student.name)) return false;
            return secondName.equals(student.secondName);

        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + secondName.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "IerarhMan{" +
                    "name='" + name + '\'' +
                    ", secondName='" + secondName + '\'' +
                    '}';
        }
    }
}

