package com.company;

public class Treadmill implements Obstacle{
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doRun(Participants participants) {
        participants.run(distance);
    }
}
