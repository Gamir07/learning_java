package chapter_13;

import javax.swing.*;
import java.awt.*;

public class Project1 {
    public static void main(String[] args) {
        Project1 project1 = new Project1();
        project1.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
