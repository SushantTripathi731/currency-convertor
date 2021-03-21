package calculator;

import java.lang.invoke.ClassSpecializer.Factory;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

Javax.swing.*;

public class calculator {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(3, 15);

    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    JButton btn0 = new JButton();

    JButton btnadd = new JButton();
    JButton btnsub = new JButton();
    JButton btndiv = new JButton();
    JButton btnmultiply = new JButton();
    JButton btnclear = new JButton();
    JButton btndot = new JButton();
    JButton btnequal = new JButton();

    double number1, number2, result;
    int add = 0, mul = 0, div = 0, sub = 0;

    public calculator() {
        frame.setsize(320, 450);
        frame.setDefaultcloseiperation(jframe.EXIT_ON_CLOSE);
        Frame.setvisible(true);
        Frame.settitle("sushant calculator");
        // frame.resizeable(false);
        frame.add(panel);
        panel.setBackground(color.grey);
        Border border = BorderFactory.createLineBorder(color, violet, 4);
        panel.add(textArea);
        textarea.setBackground(color.black);
        Border border = BorderFactory.createLineBorder(color, violet, 4);
        textArea.setborder(tborder);
        Font font = new font("arial", font, BOLD, 33);
        textArea.setfont(font);
        textArea.setForeground(color, white);
        textArea.setPreferredSize(new dimension(2, 10));
        textArea.setlineWrap(true);

    }
}