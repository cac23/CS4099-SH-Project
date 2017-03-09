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
import java.util.TimerTask;

final public class Test {
    public static void main(String[] args) {
        Test newTest = new Test();
        newTest.go();
    }

    private void go() {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));

        DrawPanel drawPanel = new DrawPanel();
        drawPanel.setBackground(new Color(0, 0, 0, 0));

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setResizable(false);
        frame.setSize(200, 200);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);


        try {
            // So that printing and display can synchronise
            Thread.sleep(3000);

            // Turn right true -> false in 5 seconds
            drawPanel.getHandler().setDisplayTurnRight(true);
            drawPanel.repaint();
            System.out.println("Display Turn Right True");
            Thread.sleep(5000);
            System.out.println("Display Turn Right False");
            drawPanel.getHandler().setDisplayTurnRight(false);
            drawPanel.repaint();

            System.out.println("Taking a break for 3 seconds");
            Thread.sleep(3000);
            System.out.println("Finished taking a break for 3 seconds");

            // Show speed true -> false in 5 seconds
            drawPanel.getHandler().setShowSpeed(true);
            drawPanel.repaint();
            System.out.println("Show Speed True");
            Thread.sleep(5000);
            System.out.println("Show Speed False");
            drawPanel.getHandler().setShowSpeed(false);
            drawPanel.repaint();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

