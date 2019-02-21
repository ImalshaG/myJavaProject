package com.mycompany.app;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Created by DELL on 2/18/2019.
 */
public class Gui1 extends JFrame{
    private JLabel lbl1;

    public Gui1(){
        super("title bar" );
        setLayout(new FlowLayout());
        lbl1= new JLabel("New Message");
        lbl1.setToolTipText("This is a new message for you");
        add(lbl1);
    }

}
