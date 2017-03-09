import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;


class DrawPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    int fontSize = 12;
    String direction = "W";
    String street = "Market St";
    Handler handler = new Handler();

    Image turnLeftImage, speedLimitImageOne, speedLimitImageTwo, trafficAheadImage,
            lowTirePressureImage, compassImage, streetNameImage;

    public DrawPanel(){
        try {
            String baseDirectory = "images/";
            turnLeftImage = ImageIO.read(getClass().getResource(baseDirectory + "turnRight.png"));
            speedLimitImageOne = ImageIO.read(getClass().getResource(baseDirectory + "firstSpeedLimitSign.png"));
            speedLimitImageTwo = ImageIO.read(getClass().getResource(baseDirectory + "secondSpeedLimitSign.png"));
            trafficAheadImage = ImageIO.read(getClass().getResource(baseDirectory + "trafficAhead.png"));
            lowTirePressureImage = ImageIO.read(getClass().getResource(baseDirectory + "lowTirePressure.png"));
            compassImage = ImageIO.read(getClass().getResource(baseDirectory + "directionAndCompass.png"));
            streetNameImage = ImageIO.read(getClass().getResource(baseDirectory + "currentStreetName.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.drawString(street, 300, 600);

        if (handler.isDisplayTurnRight()) {
            int width = turnLeftImage.getWidth(null);
            int height = turnLeftImage.getHeight(null);
            g.drawImage(turnLeftImage, 400, 400, width, height, null);
        }
        if (handler.isShowSpeed()) {
            g.setColor(Color.white);
            g.drawString(String.valueOf(100), 300, 600);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        }
        if (handler.isDisplayFirstSpeedLimit()) {
            int width = speedLimitImageOne.getWidth(null);
            int height = speedLimitImageOne.getHeight(null);
            g.drawImage(speedLimitImageOne, 400, 400, width, height, null);
        }
        if (handler.isDisplaySecondSpeedLimit()) {
            int width = speedLimitImageTwo.getWidth(null);
            int height = speedLimitImageTwo.getHeight(null);
            g.drawImage(speedLimitImageTwo, 400, 400, width, height, null);
        }
        if (handler.isDisplayCurrentDirection()) {
            g.setColor(Color.white);
            g.drawString(direction, 300, 600);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        }
        if (handler.isDisplayCurrentStreet()) {
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
