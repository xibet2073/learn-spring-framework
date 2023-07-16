package com.in28minutes.learnspringframework.game;

public class SuperContraGaming implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Sit down");
    }
    public void left() {
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("Shoot a bullet");
    }
}
