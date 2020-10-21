package com.company;

public class Man implements Participants{
    private int maxDistance;
    private int maxJampHeight;
    private  boolean active;

    public Man() {
        maxDistance = 5000;
        maxJampHeight = 120;
        active = true;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void run(int distance){
        if (distance <= maxDistance){
            System.out.println("Человек пробежал");
        }else {
            System.out.println("Человек не пробежал");
            active = false;
        }
    }

    @Override
    public void jump(int height){
        if (height <= maxJampHeight){
            System.out.println("Человек перепрыгнул");
        }else {
            System.out.println("Человек не перепрыгнул");
            active = false;
        }
    }

}
