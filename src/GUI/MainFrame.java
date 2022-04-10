package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final int MAIN_WIDTH = 600;
    private static final int MAIN_HEIGHT = 500;

    public MainFrame() throws HeadlessException {
        //setting
        setSize(MAIN_WIDTH, MAIN_HEIGHT);
        setResizable(false);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gd = ge.getScreenDevices();

        Rectangle mainScreen = gd[0].getDefaultConfiguration().getBounds();
        int upLeftCornerX = mainScreen.x + mainScreen.width / 2 - MAIN_WIDTH / 2;
        int upLeftCornerY = mainScreen.y + mainScreen.height / 2 - MAIN_HEIGHT / 2;
        setLocation(upLeftCornerX, upLeftCornerY);

        setContentPane(RealTime.getPanel());//Login.getInstance().getLoginPane());

        revalidate();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
