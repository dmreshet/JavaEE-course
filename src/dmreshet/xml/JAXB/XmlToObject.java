package dmreshet.xml.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
 
public class XmlToObject {
	public static void main(String[] args) {
 
	 try {
 
		File file = new File("src\\dmreshet\\xml\\JAXB\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer);
 
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
 
	}
}