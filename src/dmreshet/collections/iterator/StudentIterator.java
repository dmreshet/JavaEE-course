package dmreshet.collections.iterator;


import java.util.Iterator;

public class StudentIterator implements Iterator<IerarhMan> {
    private IerarhMan currentMan;

    public StudentIterator(IerarhMan currentMan) {
        this.currentMan = currentMan;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public IerarhMan next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
