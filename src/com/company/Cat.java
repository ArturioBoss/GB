package com.company;

public class Cat implements Participants{
    private int maxDistance;
    private int maxJampHeight;
    private  boolean active;

    public Cat() {
        maxDistance = 1000;
        maxJampHeight = 50;
        active = true;
    }
    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void run(int distance){
        if (distance <= maxDistance){
            System.out.println("Кот пробежал");
        }else {
            System.out.println("Кот не пробежал");
            active = false;
        }
    }

    @Override
    public void jump(int height){
        if (height <= maxJampHeight){
            System.out.println("Кот перепрыгнул");
        }else {
            System.out.println("Кот не перепрыгнул");
            active = false;
        }
    }
}
