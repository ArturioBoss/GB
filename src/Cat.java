import java.util.Scanner;

public class Cat extends Animals {
    Scanner scanner = new Scanner(System.in);
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

    public void eat(){
        System.out.println("Коты проголодались, насыпь корма в тарелку! ");
        Plate plate = new Plate(scanner.nextInt());
        System.out.println("Сколько покормить котов? ");
        int numberCats = scanner.nextInt();
        for (int i = 0; i <numberCats ; i++) {
            plate.decreaseFood(28,i+1);
            plate.info();

        }


    }
}
