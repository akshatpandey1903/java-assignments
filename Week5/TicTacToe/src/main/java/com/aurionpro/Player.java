package com.aurionpro;

public class Player {

    private char mark;
    private String name;

    public Player(String name, char mark){
        this.mark = mark;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getMark() {
        return mark;
    }
}
