package online_library;

import java.util.Scanner;

public class console {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("메뉴 번호를 선택해주세요");
        int b= a.nextInt();

        System.out.println("장바구니 상품 목록 : ");

        System.out.println("***************************");
        System.out.println("Welcome to Shopping Mall");
        System.out.println("Welcome to Book Market!");
        System.out.println("***************************");
        System.out.print("1. 고객 정보 확인하기");
        System.out.println("4. 장바구니에 항목 추가하기");
        System.out.print("2. 장바구니 상품 목록 보기");
        System.out.println("5. 장바구니의 항목 수량 줄이기");
        System.out.print("3. 장바구니 비우기");
        System.out.println("6. 장바구니의 항목 삭제하기");
        System.out.print("7. 영수증 표시하기");
        System.out.println("8. 종료");
        System.out.println("9. 관리자 로그인");
        System.out.println("***************************");

        Scanner c = new Scanner(System.in);
        System.out.print("메뉴 번호를 선택해주세요");
        int d = c.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.println("배송받을 분은 고객정보와 같습니까?   Y | N");
        String f = e.nextLine();

        Scanner g = new Scanner(System.in);
        System.out.print("배송지를 입력해주세요");
        String h = g.nextLine();

        System.out.println("----------배송 받을 고객 정보----------");
        

    }
}
