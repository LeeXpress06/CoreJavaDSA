package DSA;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        map1.put("shiblee", 12);
        map2.put("Orthee", 45);

        map2 =map1;

        System.out.println(map1.get("shiblee"));

        System.out.println(map2.get("Orthee"));

    }
}
