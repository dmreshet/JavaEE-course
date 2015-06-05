package dmreshet.generics.usage;

import java.util.ArrayList;
import java.util.List;

public class GenContainerUsage {
    public static void main(String[] srgs){
        List myObjList = new ArrayList();

// Store instances of ObjectContainer
        for(int x=0; x <=10; x++){
            ObjectContainer myObj = new ObjectContainer();
            myObj.setObj("Test" + x);
            myObjList.add(myObj);
        }
// Get the objects we need to cast
        for(int x=0; x <= myObjList.size()-1; x++){
            ObjectContainer obj = (ObjectContainer) myObjList.get(x);
            System.out.println("Object Value: " + obj.getObj());
        }

        List<GenericContainer<String>> genericList = new ArrayList<>();

// Store instances of GenericContainer
        for(int x=0; x <=10; x++){
            GenericContainer<String> myGeneric = new GenericContainer<>();
            myGeneric.setObj(" Generic Test" + x);
            genericList.add(myGeneric);
        }
// Get the objects; no need to cast to String

        for(GenericContainer<String> obj:genericList){
            String objectString = obj.getObj();
            // Do something with the string...here we will print it
            System.out.println(objectString);
        }
    }
}

class GenericContainer<T> {
    private T obj;

    public GenericContainer(){
    }

    // Pass type in as parameter to constructor
    public GenericContainer(T t){
        obj = t;
    }

    /**
     * @return the obj
     */
    public T getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T t) {
        obj = t;
    }
}

