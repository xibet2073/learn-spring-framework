package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.helloworld.GamingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingSpringBeans {
    public static void main(String[] args) {
        GamingConsole game;
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            //Two alternatives
            //context.getBean(GamingConsole.class).up();

            game = (GamingConsole) context.getBean("game");
            game.up();

            context.getBean(GameRunner.class).run();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
