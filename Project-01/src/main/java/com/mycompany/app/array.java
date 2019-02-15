package com.mycompany.app;
import java.util.Random;
/**
 * Created by DELL on 2/15/2019.
 */
public class array {
    public void testArray(){
        int myList[]=new int[10];
        int counter=0;
        for (int i=10; i<=100; i+=10) {
            myList[counter]=i;
            counter++;
        }
        System.out.println("Index\tValue");
        int inc=0;
        while (inc<myList.length){
            System.out.println(inc + "   \t " + myList[inc]);
            inc++;

        }

        String newList[]={"Anne","Mary","Jude"};
            System.out.println(newList[1]);

        }

    public void freqCounter(){
        Random rand= new Random();
        int freq[]=new int[7];
        for (int roll=1; roll<=5000; roll++){
            ++freq[1+rand.nextInt(6)];
        }
        System.out.println("Face\tFrequency");
        for (int i=1; i<7;i++){
            System.out.println(" "+i+ " \t\t "+freq[i]);

        }

    }
    public void forArray(){
        //int shit[]= {45, 69, 78, 64, 100,55};
        int multiArray[][]={{21,56},{45,56,42},{78,89,75,12}};
        //for (int element: shit){
            //System.out.println(element);
        //}
        for (int rows=0;rows<multiArray.length;rows++){
            for (int columns=0; columns<multiArray[rows].length;columns++){
                System.out.print(multiArray[rows][columns]+"\t");
            }
            System.out.println();
        }

    }
    public void changeArray(int x[]){
        for (int counter=0; counter<x.length;counter++){
            x[counter]+=100;

        }
        for (int i:x){
            System.out.println(i);
        }
    }
    public void varPara(int...numbers){
        for (int count=0;count<numbers.length;count++){
            System.out.println(numbers[count]);
            System.out.println(numbers[count]);

        }
    }
}
