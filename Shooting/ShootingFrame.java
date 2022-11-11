

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.*;

public class ShootingFrame extends JFrame{
    public ShootingFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Shooting");
        this.setSize(WIDTH , HEIGHT);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}