
public class Cat {
    public Cat(String name) {
        this.name = name;
    }

    private String name;
    private boolean satiety;

    public void eat(Plate plate){
        if (plate.decreaseFood(15)){
            System.out.println("Кот "+name+" поел");
            satiety = true;

        }else {
            System.out.println("Коту "+name+"у, не хватило еды");
        }
    }

    public void info() {
        System.out.println("Сытость кота "+name+"а = "+satiety);
    }

}
