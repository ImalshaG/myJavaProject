package com.mycompany.app;

/**
 * Created by DELL on 2/3/2019.
 */
import java.util.Scanner;
import java.util.stream.Collector;

public class TestClass {
    public static void main(String args[]){
        //SwithClass test1=new SwithClass();
        //TestClass1 Idiot= new TestClass1();
        //Idiot.running(test1.switchTest());
        //Idiot.ifStat();

        //ConstructorTest a= new ConstructorTest("Bruno");
        //a.petName();
        //Idiot.conditionalTest();
        //a.createRendom();

        //Average calcAverage= new Average();
        //calcAverage.getAverage();
        //calcAverage.getSqr(5.0);
        //calcAverage.testMath(63.4);

        //Loops testLoop=new Loops();
        //testLoop.whileLoop();
        //testLoop.forLoop(9);
        //testLoop.doWhileLoop();

        //array ar= new array();
        //ar.testArray();
        //ar.freqCounter();
        //ar.forArray();
        //int y[]={42,56,48,99,46};
        //ar.changeArray(y);
        //ar.varPara(5,6,7,45,67,797);

        TimeClass time =new TimeClass();
        time.setTime(4,56,16);
        System.out.println(time.inMillitary());
        System.out.println(time.inRegular());

    }

}