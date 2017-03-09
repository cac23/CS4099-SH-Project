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


    public static void main(String... args) {

//        long current_time1 = System.currentTimeMillis();
//
//
//        if (System.currentTimeMillis() > current_time1 + 3000) //3 seconds is 3000 millis
////            displayTurnRight = false;
//
//        long current_time2 = System.currentTimeMillis();
//        boolean displayFirstSpeedLimit = true;
//        if (System.currentTimeMillis() > current_time2 + 6000) //6 seconds it 6000 millis
//            displayFirstSpeedLimit = false;
//
//
//        long current_time3 = System.currentTimeMillis();
//        boolean showSpeed = true;
//        if (System.currentTimeMillis() > current_time3 + 7000)
//            showSpeed = false;

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

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setResizable(false);
        frame.setSize(200, 200);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        //moveIt();
    }
}

