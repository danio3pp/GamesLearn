package sk.danio;

import javax.swing.JFrame;
//Test GITu cez net
public class Game {
    
    public static void main(String[] args) {
        //main class
        JFrame window = new JFrame("First Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new GamePanel());
        window.pack();
        window.setVisible(true);
    }
    
}
