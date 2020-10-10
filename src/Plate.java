public class Plate {
    private int food;
    private boolean satiety = false;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount){
            food -= amount;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("Осталось корма "+food);
    }


}
