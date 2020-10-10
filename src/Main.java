
public class Main {

    public static void main(String[] args) {

        Cat[] cats = {new Cat("Барсик"),new Cat("Томас"),new Cat("Мурзик")};
        Plate plate = new Plate(40);

        for (Cat n : cats){
            n.eat(plate);
            n.info();
        }

        plate.info();









    }
}
