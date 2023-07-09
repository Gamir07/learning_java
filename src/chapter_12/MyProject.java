package chapter_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyProject extends JPanel implements ActionListener {
    JFrame frame;
    JButton button;
    MyProject panel;
    int x;

    public static void main(String[] args) {
        MyProject project = new MyProject();
        project.go();
    }

    public void go() {
        frame = new JFrame();
        button = new JButton("click me");
        panel = new MyProject();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
        button.setText("Changed " + ""+ ++x );

    }

    public void paintComponent(Graphics g) {

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color color = new Color(red,green,blue);
        g.setColor(color);
        g.fillRect(50, 50, 80, 80);
    }
}
