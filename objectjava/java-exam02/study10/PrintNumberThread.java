package javastudy.study10;

public class PrintNumberThread extends Thread {

    public void print(){

       for(int i = 1; i <= 5; i++){
           String msg = String.format("ThreadId: %s => %d", getName(), i);
           System.out.println(msg);

           try{
               Thread.sleep(1000*5);
           }catch(InterruptedException e){
               e.printStackTrace();
           }

        }
    }

    @Override
    public void run() {
        print();

    }
}
