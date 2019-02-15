package com.mycompany.app;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by DELL on 2/14/2019.
 */
public class Average {
    public void getAverage(){
        double total=0;
        double average;
        int counter=1;
        Scanner s = new Scanner(System.in);
        while (counter<=5){
            System.out.print("Enter marks : ");
            int marks= s.nextInt();
            total=total+marks;
            counter++;
        }
        average= total/counter;
        System.out.println("Average = "+average);
    }

    public void getSqr(double num){
        double srq=Math.pow(num,2.0);
        System.out.println(srq);
    }
    public void testMath(double x){
        //System.out.println(Math.abs(x));
        //System.out.println(Math.ceil(x));
        //System.out.println(Math.floor(x));
        //System.out.println(Math.max(2.1,639.1));
        //System.out.println(Math.min(2.1,639.1));
        System.out.println(Math.sqrt(49));


    }
}
