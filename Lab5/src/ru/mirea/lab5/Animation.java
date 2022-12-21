package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation {

    static String frames[] = new String[]{"/Users/dara/Desktop/cat.jpg" +
            "/Users/dara/Desktop/cat1.jpg" +
            "/Users/dara/Desktop/cat2.jpg" +
            "/Users/dara/Desktop/cat3.jpg"};

    public static BufferedImage open_file(String filename) {
        try {
            BufferedImage image = ImageIO.read(new File(filename));
            return image;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = buildFrame();


        JPanel pane = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                while (true) {
                    for (int i = 0; i <frames.length; i ++){
                        BufferedImage image = open_file(frames[i]);
                        g.drawImage(image, 0, 0, null);
                        try{
                            Thread.sleep(1000);
                        } catch (Exception e) {}
                    }
                }
            }
        };
        frame.add(pane);
    }


    private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        return frame;
    }
}