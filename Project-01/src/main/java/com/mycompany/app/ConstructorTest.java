package com.mycompany.app;
import java.util.Random;
/**
 * Created by DELL on 2/14/2019.
 */
public class ConstructorTest {
    private String pup;

    public ConstructorTest(String pet){
        pup=pet;
    }
    public void petName(){

        System.out.println("Pet name is "+pup);
    }

    public void createRendom(){
        Random r= new Random();
        int dice;
        for (int counter=1; counter<=10; counter++){
            dice=1+r.nextInt(6);
            System.out.println(dice);

        }
    }
    private String name;
    private int age;
    public static int members;

    public ConstructorTest(String nm, int yr){
        name=nm;
        age=yr;
        members++;
        System.out.printf("%s\t%s\t%s\n",name,age,members);
        //System.out.println(name+age+members);
    }

}
