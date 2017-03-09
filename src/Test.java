/**
 * Created by cclapp on 01/02/2017.
 */

import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.util.Timer;

final public class Test {
    JFrame frame;
    DrawPanel drawPanel;



    public static void main(String[] args) {





        //Test newTest = new Test();
        //DrawPanel drawPanel = new DrawPanel(this);
        Test newTest = new Test();
        newTest.go();
    }


    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));

        Handler handler = new Handler();
        drawPanel = new DrawPanel(handler);
        drawPanel.setBackground(new Color(0, 0, 0, 0));

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setResizable(false);
        frame.setSize(200, 200);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);


        int timer = 5000;
        long time = System.currentTimeMillis();


        handler.setDisplayTurnRight(true);


        drawPanel.setHandler(handler);
//        System.out.println("H: " + drawPanel.getHandler().isDisplayTurnRight());
//        drawPanel.repaint();
//        System.out.println("REPAINTED");

        while(System.currentTimeMillis() < time + timer) {
            if(System.currentTimeMillis() % 2000 == 0) {
                System.out.println("Waiting for timer");
            }
        }
        System.out.println("should change time npw");
        handler.setDisplayTurnRight(false);
        drawPanel.setHandler(handler);
        drawPanel.repaint();
    }
}

