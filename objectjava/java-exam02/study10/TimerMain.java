package javastudy.study10;

import java.util.Scanner;

public class TimerMain {

    public static void main(String[] args){

     /*   Timer timer = new Timer("T-1");
        timer.start();*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("타이머를 설정할 시간(초)를 입력해 주세요.");
        int time = scanner.nextInt();

        /*timer.setTime(time);
        timer.start();*/

        Timer2 timer2 = new Timer2();
        timer2.setTime(time);

        Thread thread = new Thread(timer2);
        thread.start();
    }

}
