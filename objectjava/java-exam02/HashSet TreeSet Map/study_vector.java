package ex05_2;

import java.util.Vector;

public class study_vector {

    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add("홍길동");
        vector.add(20);
        vector.add('M');

        String name = (String)vector.get(0);
        int age = (int)vector.get(1);

//        int age2 = (int)vector.get(0);  - 은 안됨


//        for(int i = 0; i < vector.size(); i++) {
//            System.out.println(vector.get(i));
//        }

        for(Object v : vector) {
            System.out.println(v);
        }

    }

}
