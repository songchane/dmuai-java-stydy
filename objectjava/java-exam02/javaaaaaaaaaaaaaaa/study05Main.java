package javaaaaaaaaaaaaaaa;

import java.time.LocalDate;
import java.util.Vector;

public class study05Main {

    public static void main(String[] args) {

        Calc<Integer> calc = new Calc();

        int value1 = 10;
        int value2 = 20;
        calc.info(value1, value2);
        //System.out.println("결과:" + result);


        Calc<Double> calc2 =  new Calc<Double>();
        double value3 = 10L;
        double value4 = 20L;
        calc2.info(value3, value4);
        //System.out.println("결과:" + result2);


    }
}
