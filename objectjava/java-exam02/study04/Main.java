package java.study04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("태어난 년도룰 입력해주세요.");
        int year = scanner.nextInt();

        System.out.println("태어난 월을 입력해주세요.");
        int month = scanner.nextInt();

        System.out.println("태어난 일을 입력해주세요.");
        int day = scanner.nextInt();

        System.out.println("성별을 입력해주세요.(M/F)");
        String gender = scanner.next();

        System.out.println(year + "," + "," + month + "," + day + "," + gender);
    }
}