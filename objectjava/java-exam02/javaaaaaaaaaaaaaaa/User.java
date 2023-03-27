package javaaaaaaaaaaaaaaa;

import java.time.LocalDate;
import java.util.Vector;

public class User {

    int age;
    String name;
    LocalDate birthday;

    public User(int age, String name, LocalDate birthday) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }

    public static User of(int age, String name, LocalDate birthday) {

        return new User(age, name, birthday);
    }
}
