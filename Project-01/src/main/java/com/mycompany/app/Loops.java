package com.mycompany.app;

/**
 * Created by DELL on 2/15/2019.
 */
public class Loops {
    public void whileLoop(){
        int x=0;
        while (x<5){
            System.out.println(x);
            x++;
        }
    }
    public void forLoop(int c){
        for (int i=c; c>5; c--){
            System.out.println(c);
        }
    }
    public void doWhileLoop(){
        int x=1;
        do{
            System.out.println(x);
            x++;
        }while(x<5);
    }
}
