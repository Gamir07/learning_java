package chapter_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondProject {
    JFrame frame;
    JButton red;
    JButton blue;
    JButton newColor;

    public static void main(String[] args) {
        SecondProject project = new SecondProject();
        project.start();
    }

    public void start(){
        frame = new JFrame();
        red = new JButton("click upper button");
        blue = new JButton("click blue button");
        newColor = new JButton("Changed for new color");
        DrawPanel panel = new DrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH,red);
        frame.getContentPane().add(BorderLayout.SOUTH,blue);
        frame.getContentPane().add(BorderLayout.WEST,newColor);
        frame.getContentPane().add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        red.addActionListener(new ButtonRed());
        blue.addActionListener(new ButtonBlue());
        newColor.addActionListener(new DrawPanel());

    }

    class ButtonRed implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            red.setText("Changed for another color");

        }
    }
    class ButtonBlue implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            blue.setText("Changed for other color");
        }
    }
    class DrawPanel extends JPanel implements ActionListener{

        public void paintComponent(Graphics g){
            int red = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);

            Color color = new Color(red,green,blue);
            g.setColor(color);
            g.fillOval(80,80,50,50);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}



