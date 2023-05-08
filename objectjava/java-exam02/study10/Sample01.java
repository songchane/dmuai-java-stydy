package javastudy.study10;

public class Sample01 {

    public static void main(String[] args){

        System.out.println("start!!");

        //PrintNumber printNumber = new PrintNumber();
        //printNumber.print();

//        PrintNumberThread printNumberThread = new PrintNumberThread();
//        PrintNumberThread printNumberThread2 = new PrintNumberThread();
//        PrintNumberThread printNumberThread3 = new PrintNumberThread();
//        printNumberThread.start();
//        printNumberThread2.start();
//        printNumberThread3.start();

        try{
            Thread.sleep(1000*5);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("End!!!");

    }
}
