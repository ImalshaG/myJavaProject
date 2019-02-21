package com.mycompany.app;
import java.util.EnumSet;
import javax.swing.JFrame;

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

        //TimeClass time =new TimeClass();
        //time.setTime(4,56,16);
        //System.out.println(time.inMillitary());
        //System.out.println(time.inRegular());

        //ShowTime time1=new ShowTime(6);
        //time1.displayTime();
        //ShowTime time2=new ShowTime(6,56);
        //time2.displayTime();
        //ShowTime time3=new ShowTime(45,6,15);
        //time3.displayTime();

        //ystem.out.println("Name\tNature\tFuture\t\tStatus");
        //for(EnumerationTest friends: EnumerationTest.values()){
        //    System.out.printf("%s\t%s\t%s\t\t%s\n",friends,friends.getNature(),friends.getFuture(),friends.getStatus());
        //}
        //System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        //for(EnumerationTest besties: EnumSet.range(EnumerationTest.kethz,EnumerationTest.hish)){
        //    System.out.printf("%s\t%s\t%s\t\t%s\n",besties,besties.getNature(),besties.getFuture(),besties.getStatus());
        //}

        //ConstructorTest member1=new ConstructorTest("Imii",22);
        //ConstructorTest member2=new ConstructorTest("Pipi",10);
        //ConstructorTest member3=new ConstructorTest("Thar",60);
        //System.out.println(ConstructorTest.members);

        //GuiTest Gui1=new GuiTest();
        //Gui1.test1();
        Gui1 newGui=new Gui1();
        newGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newGui.setSize(500,300);
        newGui.setVisible(true);
    }


}