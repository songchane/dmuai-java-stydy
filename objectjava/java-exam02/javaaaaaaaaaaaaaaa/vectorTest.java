package javaaaaaaaaaaaaaaa;

import java.time.LocalDate;
import java.util.Vector;

public class vectorTest {

    public static void main(String[] args) {
        Vector v = new Vector();
        int age = 20;
        String name = "홍길동";
        LocalDate birthday = LocalDate.of(2003, 6, 4);

        v.add(age);
        v.add(name);
        v.add(birthday);

        System.out.println(v);

        age = (int)v.get(0);
        name = (String)v.get(1);
        birthday = (LocalDate)v.get(2);

        System.out.println(age);
        System.out.println(name);
        System.out.println(birthday);

    }
}
