package javastudy.study10;

public class Timer2 implements Runnable {

    private int time;
    public void setTime(int time){
        this.time = time;
    }

    private void checkTime(){

        int i = 0;
        while(i < time){

            System.out.println("남은시간: "+ (time-i)+"초");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            i++;
        }
        System.out.println("띠리리!!");
    }

    @Override
    public void run() {

    }
}
