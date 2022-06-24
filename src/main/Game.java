package main;

import javax.swing.JFrame;

public class Game extends JFrame {

    private GameScreen gameScreen;

    public Game() {
        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen();
        add(gameScreen);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Start  game");
        Game game = new Game();
    }
}
