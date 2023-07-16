package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGaming;

public class App01BasicGamingJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGaming();
        var pacManGame = new PacManGaming();
        //var superContraGame = new SuperContraGaming();
        var gameRunner = new GameRunner(pacManGame);
        gameRunner.run();
    }
}
