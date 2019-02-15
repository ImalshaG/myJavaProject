package com.mycompany.app;

import java.util.Scanner;

/**
 * Created by DELL on 2/12/2019.
 */
public class SwithClass {
    public String switchTest(){
        String grade;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter you grade : ");
        grade=s.nextLine();

        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Poor");
                break;
            default:
                System.out.println("Enter your grade correctly");
        }
        return grade;
    }
}
