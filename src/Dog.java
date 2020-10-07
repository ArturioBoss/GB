public class Dog extends Animals {
    @Override
    public void run(int lengthRun) {
        if (lengthRun<=500) {
            System.out.println("Собака пробежала " + lengthRun + " метров");
        }else {
            System.out.println("Собака не добежала");
        }
    }

    @Override
    public void jump(float heightJump) {
        if (heightJump<=0.5) {
            System.out.println("Собака прыгнула на " + heightJump + " метра");
        }else {
            System.out.println("Собака не допрыгнула");
        }
    }

    @Override
    public void swim(int lengthSwim) {
        if (lengthSwim<=10) {
            System.out.println("Собака проплыла " + lengthSwim + " метров");
        }else {
            System.out.println("Собака не доплыла");
        }
    }
}
