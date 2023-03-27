package study06;

public class study06Main {

    public static void main(String[] args) {

        Box2<String, Integer> box1 = new Box2();
        box1.set("홍길동", 20);
        String name = box1.get();
        int age2 = box1.get2();
        System.out.println(name);

        Box2<Integer> box2 = new Box2();
        box2.set(20, 0);
        int age = box2.get();
        System.out.println(age);



    }
}
