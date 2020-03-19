package Lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        repeatMessage("hello", 1000);
    }
    public static void repeatMessage(String text , int delay){
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay, listener).start();
    }
}

