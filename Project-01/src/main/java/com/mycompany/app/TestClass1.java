package com.mycompany.app;
import java.util.Scanner;

/**
 * Created by DELL on 2/12/2019.
 */
public class TestClass1 {
    public String grade;
    public void running(String input){
        System.out.println("Your grade is : "+input);
        grade= input;
    }
    public void ifStat(){


        if (grade.equals("A")) {
            System.out.println("***");
        }
        else if (grade.equals("B"))
            System.out.println("**");
        else if (grade.equals("C"))
            System.out.println("*");
        else
            System.out.println("Incorrect grade");

    }
    public void conditionalTest(){
        int age=25;
        System.out.println(age<50 ? "Too young" : "Too old" );
    }

}
