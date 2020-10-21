package com.company;

public class Robot implements Participants{
    private int maxDistance;
    private int maxJampHeight;
    private  boolean active;

    public Robot() {
        maxDistance = 8000;
        maxJampHeight = 500;
        active = true;
    }
    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void run(int distance){
        if (distance <= maxDistance){
            System.out.println("Робот пробежал");
        }else {
            System.out.println("Робот не пробежал");
            active = false;
        }
    }

    @Override
    public void jump(int height){
        if (height <= maxJampHeight){
            System.out.println("Робот перепрыгнул");
        }else {
            System.out.println("Робот не перепрыгнул");
            active = false;
        }
    }
}
