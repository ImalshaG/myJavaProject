package com.bucky.poly;

/**
 * Created by DELL on 2/21/2019.
 */
public class PolyMain {
    public static void main(String args[]){
        //PolyParentClass testArray[]= new PolyParentClass[2];
        //testArray[0]=new PolySub1();
        //testArray[1]=new PolySub2();

        //for (int i=0; i<testArray.length;i++){
        //    testArray[i].eat();
        //}

        PolyNew1 test1= new PolyNew1();
        PolyParentClass test3=new PolySub1();
        PolySub2 test4=new PolySub2();
        test1.digest(test3);
        test1.digest(test4);


    }
}
