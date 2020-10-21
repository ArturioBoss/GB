package com.company;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doRun(Participants participants) {
        participants.jump(height);
    }
}
