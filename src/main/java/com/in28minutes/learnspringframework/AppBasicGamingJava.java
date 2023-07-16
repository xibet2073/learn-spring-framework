package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGaming;
import com.in28minutes.learnspringframework.game.PacManGaming;
import com.in28minutes.learnspringframework.game.SuperContraGaming;

public class AppBasicGamingJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGaming();
        var pacManGame = new PacManGaming();
        //var superContraGame = new SuperContraGaming();
        var gameRunner = new GameRunner(pacManGame);
        gameRunner.run();
    }
}
