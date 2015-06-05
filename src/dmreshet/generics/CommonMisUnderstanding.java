package dmreshet.generics;

import java.util.ArrayList;
import java.util.List;

public class CommonMisUnderstanding {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(1);
        Box<Double> box2 = new Box<>(2.0);

        List<Box<Number>> list = new ArrayList<>();
//        list.add(box1);
    }
}
