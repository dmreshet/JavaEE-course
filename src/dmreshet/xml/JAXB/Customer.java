package dmreshet.xml.JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Customer {

    String name;
    int age;
    int id;
    List<String> list;
    Test test;

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    @XmlElement
    public void setList(List<String> list) {
        this.list = list;
    }


    public Test getTest() {
        return test;
    }

    @XmlElement
    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", list=" + list +
                ", test=" + test +
                '}';
    }
}