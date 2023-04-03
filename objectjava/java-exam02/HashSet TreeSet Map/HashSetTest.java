package study06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetTest {

    public static void main(String[] args) {

//        HashSet hashSet1 = new HashSet();  //<String> 차이 아래 예제가 일반적

        HashSet<String> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

//        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
//        TreeSet<String> hashSet = new TreeSet<>();

        hashSet.add("3");
        hashSet.add("2");
        hashSet.add("1");

        hashSet.add("1");
        hashSet.add("4");
        //Set : 요소를 중복해서 가질 수 없음
        // ex) 로또번호, 중복 나오지 않게 함

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        hashSet.stream().forEach(e -> {
            System.out.println(e);
        });

        System.out.println(hashSet);

    }
}
