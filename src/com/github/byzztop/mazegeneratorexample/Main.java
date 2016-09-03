package com.github.byzztop.mazegeneratorexample;

public class Main {

    public static void main(String[] args) {
        MazeGenerator mazeGenerator = new MazeGenerator(50, 50);
        mazeGenerator.generate();
        mazeGenerator.show();
    }

}
