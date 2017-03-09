import java.awt.*;
import javax.swing.JFrame;

final public class Program {
    public static void main(String[] args) {
        Program newProgram = new Program();
        newProgram.run();
    }

    public void changeDisplayTurnRight(DrawPanel drawPanel, int time) throws InterruptedException {
        // Turn right true -> false in 5 seconds
        drawPanel.getHandler().setDisplayTurnRight(true);
        drawPanel.repaint();
        System.out.println("Display Turn Right True");
        Thread.sleep(time);
        System.out.println("Display Turn Right False");
        drawPanel.getHandler().setDisplayTurnRight(false);
        drawPanel.repaint();
    }

    public void changeShowSpeed(DrawPanel drawPanel, int time) throws InterruptedException {
        // Show speed true -> false in 5 seconds
        drawPanel.getHandler().setShowSpeed(true);
        drawPanel.repaint();
        System.out.println("Show Speed True");
        Thread.sleep(time);
        System.out.println("Show Speed False");
        drawPanel.getHandler().setShowSpeed(false);
        drawPanel.repaint();
    }

    public void run() {
        JFrame frame = new JFrame("Program");
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

            changeDisplayTurnRight(drawPanel, 5000);

            System.out.println("Taking a break for 3 seconds");
            Thread.sleep(3000);
            System.out.println("Finished taking a break for 3 seconds");

            changeShowSpeed(drawPanel, 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

