package dmreshet.generics;

public class Box<E extends Number> {
    final E num;

    public Box(E num) {
        this.num = num;
    }

    public E getNum() {
        return num;
    }
}
