package dmreshet.generics;

import dmreshet.generics.model.Apple;
import dmreshet.generics.model.Fruit;
import dmreshet.generics.model.Strawberry;

import java.sql.SQLException;
import java.util.ArrayList;

public class MotivationForGenerics {


    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        System.out.println(new ArrayList<Integer>().equals(new ArrayList<String>()));

//        List<Integer> box = new ArrayList<>();
//        Integer apple = box.get(0);
//
//        List box2 = new ArrayList();
//        Integer apple2 = (Integer) box2.get(0);

//        List<Apple> apples = new ArrayList<>();
//        List<Fruit> fruits = new ArrayList<>();
//        fruits = apple;
//        apple = fruits;


        Apple[] apples = new Apple[1];
        Fruit[] fruits = apples;
        fruits[0] = new Strawberry();
    }
}
