package dmreshet.xml.JAXB;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Test {
    private Customer parent;

    public Test() {

    }

    public Test(Customer customer) {
        parent = customer;
    }
//
//    public Customer getParent() {
//        return parent;
//    }
//
//    @XmlElement
//    public void setParent(Customer parent) {
//        this.parent = parent;
//    }
}
