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
    //boolean displayTurnRight = true; //value of boolean hardcoded for now
    boolean displayTurnLeft = true;
    //boolean showSpeed = true;
    int fontSize = 12;
    boolean displayRightNavigation;
    boolean displayContinueAheadNavigation;
    //boolean displayFirstSpeedLimit = true;
    boolean displaySecondSpeedLimit = true;
    boolean displayFirstWarning = true;
    boolean displaySecondWarning = true ;
    boolean displayCurrentDirection;
    String direction = "W";
    boolean displayCurrentStreet;
    String street = "Market St";


    public boolean isDisplayRightNavigation() {
        return displayRightNavigation;
    }

    public static void main(String... args) {

        long current_time1 = System.currentTimeMillis();


        if (System.currentTimeMillis() > current_time1 + 3000) //3 seconds is 3000 millis
            displayTurnRight = false;

        long current_time2 = System.currentTimeMillis();
        boolean displayFirstSpeedLimit = true;
        if (System.currentTimeMillis() > current_time2 + 6000) //6 seconds it 6000 millis
            displayFirstSpeedLimit = false;


        long current_time3 = System.currentTimeMillis();
        boolean showSpeed = true;
        if (System.currentTimeMillis() > current_time3 + 7000)
            showSpeed = false;

        //Test newTest = new Test();
       //DrawPanel drawPanel = new DrawPanel(this);
        Test.go(showSpeed);

    }


    private void go(boolean test) {
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

    class DrawPanel extends JPanel {
        public boolean isDisplayTurnRight() {
            return displayTurnRight;
        }

        public void setDisplayTurnRight(boolean displayTurnRight) {
            this.displayTurnRight = displayTurnRight;
        }

        boolean displayTurnRight = true;

        private static final long serialVersionUID = 1L;

        private Test test = null;

        public DrawPanel(Test test) {
            this.test = test;
        }

        public void paintComponent(Graphics g) {

            if (displayTurnRight) {
                try {

                    Image turnLeftImage = ImageIO.read(this.getClass().getResource("turnRight.png"));
                    Image speedLimitImageOne = ImageIO.read(this.getClass().getResource("firstSpeedLimitSign.png"));
                    Image speedLimitImageTwo = ImageIO.read(this.getClass().getResource("secondSpeedLimitSign.png"));
                    Image trafficAheadImage = ImageIO.read(this.getClass().getResource("trafficAhead.png"));
                    Image lowTirePressureImage = ImageIO.read(this.getClass().getResource("lowTirePressure.png"));
                    Image compassImage = ImageIO.read(this.getClass().getResource("directionAndCompass.png"));
                    Image streetNameImage = ImageIO.read(this.getClass().getResource("currentStreetName.png"));
                    int width = turnLeftImage.getWidth(null);
                    int height = turnLeftImage.getHeight(null);
                    g.drawImage(turnLeftImage, 400, 400, width, height, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (showSpeed) {
                int speed = testServer.getOutput();
                g.setColor(Color.white);
                g.drawString(String.valueOf(speed), 300, 600);
                g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            }
            if (displayFirstSpeedLimit) {
                try {

                    Image speedLimitImageOne = ImageIO.read(this.getClass().getResource("firstSpeedLimitSign.png"));
                    int width = speedLimitImageOne.getWidth(null);
                    int height = speedLimitImageOne.getHeight(null);
                    g.drawImage(speedLimitImageOne, 400, 400, width, height, null);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (displaySecondSpeedLimit) {
                try {
                    Image speedLimitImageTwo = ImageIO.read(this.getClass().getResource("secondSpeedLimitSign.png"));
                    int width = speedLimitImageTwo.getWidth(null);
                    int height = speedLimitImageTwo.getHeight(null);
                    g.drawImage(speedLimitImageTwo, 400, 400, width, height, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (displayCurrentDirection) {
                g.setColor(Color.white);
                g.drawString(direction, 300, 600);
                g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            }
            if (displayCurrentStreet) {
                g.setColor(Color.white);
                g.drawString(street, 300, 600);
                g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            }
        }
    }
        /*private void moveIt() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                frame.repaint();
            }
        } */
    }