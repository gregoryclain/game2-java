package main;

import javax.swing.JFrame;

public class Game extends JFrame {

    public Game() {
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Start  game");
        Game game = new Game();
    }
}
