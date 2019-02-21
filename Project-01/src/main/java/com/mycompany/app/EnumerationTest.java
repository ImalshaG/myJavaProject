package com.mycompany.app;

/**
 * Created by DELL on 2/16/2019.
 */
public enum  EnumerationTest {
    pipi("sweet","doctor","committed"),
    kethz("funny","teacher","single"),
    thar("crazy","Engineer","committed"),
    hish("smart","Business Analyst","single"),
    manja("buddy","Microbiologist","committed");

    private String desc, occupation, relaStat;

    EnumerationTest(String nature, String future, String status){
        desc=nature;
        occupation=future;
        relaStat=status;
    }
    public String getNature(){
        return desc;
    }
    public String getFuture(){
        return occupation;
    }
    public String getStatus(){
        return relaStat;
    }
}
