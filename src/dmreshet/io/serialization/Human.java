package dmreshet.io.serialization;

import java.io.Serializable;

public class Human implements Serializable{
    private String city;

    public Human(String city) {
        this.city = city;
    }
}
