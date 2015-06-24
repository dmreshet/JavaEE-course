package dmreshet.collections;

import java.util.Map;
import java.util.TreeMap;

public class MapUsage {
    public static void main(String[] args) {
        String content = "fghjfgkhjjj";
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
