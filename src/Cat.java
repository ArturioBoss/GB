public class Cat extends Animals {
    @Override
    public void run(int lengthRun) {
        if (lengthRun<=200) {
            System.out.println("Кот пробежал " + lengthRun + " метров");
        }else {
            System.out.println("Кот не добежал");
        }
    }

    @Override
    public void jump(float heightJump) {
        if (heightJump<=2) {
            System.out.println("Кот прыгнул на " + heightJump + " метра");
        }else {
            System.out.println("Кот не допрыгнул");
        }
    }

    @Override
    public void swim(int lengthSwim) {
        System.out.println("Кот не может плавать.");
    }
}
