package study06;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<>();

        map1.put("A", "A Value");
        map1.put("B", "B Value-1");
        map1.put("C", "C Value");

        map1.put("B", "B Value"); //마지막 값이 유효한 값
        map1.put("A-2", "A Value"); // 키값은 달라야하지만 V 값은 같아도 됨

        map1.keySet().forEach(e -> {
            System.out.println("key:" + e + ", value:" + map1.get(e));
        });

//        System.out.print(map1);

//        String value = map1.get("A-2");
//        System.out.println(value);

    }
}
