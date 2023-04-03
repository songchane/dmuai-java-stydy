package study06;

import java.util.*;

public class HashSetTest2 {

    public static void main(String[] args) {

        //로또번호 생성 프로그램
        // 1-45 중에서 5개 임의 추출

        Set<Integer> lotto = new TreeSet<>();
        Random random = new Random();

        while (lotto.size() < 5) {
            int no = random.nextInt(45) + 1;
            lotto.add(no);

        }

        lotto.stream().forEach(e -> {
            System.out.print(e + ", ");
        });
    }
}
