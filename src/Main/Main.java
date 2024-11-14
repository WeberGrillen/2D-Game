package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Pac-Man");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); // Causes the window to be sized the to fit the preferred size of (GamePanel)

        window.setLocationRelativeTo(null); // Makes the game in the center of the screen
        window.setVisible(true); // Makes the screen visible :)

        gamePanel.startGameThread();


    }
}
