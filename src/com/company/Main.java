package com.company;

public class Main {

    public static void main(String[] args) {

        Participants[] participants = {new Cat(),new Man(), new Robot()};
        Obstacle[] obstacles = {new Wall(80),new Treadmill(50),new Wall(110)};
        for (Participants p : participants){
            for (Obstacle o : obstacles){
                o.doRun(p);
                if (!p.isActive()){
                    break;
                }
            }
        }
    }
}
