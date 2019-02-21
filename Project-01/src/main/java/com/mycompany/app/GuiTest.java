package com.mycompany.app;
import javax.swing.JOptionPane;
/**
 * Created by DELL on 2/18/2019.
 */
public class GuiTest {
    public void test1(){
        String fn=JOptionPane.showInputDialog("Enetr the First Number");
        String sn=JOptionPane.showInputDialog("Enetr the Second Number");
        int firstNum=Integer.parseInt(fn);
        int secondNum=Integer.parseInt(sn);
        int sum=firstNum+secondNum;

        JOptionPane.showMessageDialog(null,"The answer is "+sum,"Addition",JOptionPane.PLAIN_MESSAGE);
    }
}
