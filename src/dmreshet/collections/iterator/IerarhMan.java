package dmreshet.collections.iterator;

public class IerarhMan {
    public String name;
    public String secondName;
    public IerarhMan parent;

    public IerarhMan(String name, String secondName, IerarhMan parent) {
        this.name = name;
        this.secondName = secondName;
        this.parent = parent;
    }

    public IerarhMan(String name, String secondName) {
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

    public IerarhMan getParent() {
        return parent;
    }

    public void setParent(IerarhMan parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "IerarhMan{" +
                "parent=" + ((parent == null) ? null : parent.getName() + " " + parent.getSecondName()) +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
