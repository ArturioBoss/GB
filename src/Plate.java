public class Plate {
    private int food;
    private boolean satiety = false;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, int catNumber) {
        if (food<n){
            System.out.println("Нет еды в тарелке для кота №"+catNumber);
            satiety=false;

        }else {
            food -= n;
            satiety=true;
            System.out.println(" Сытость кота №"+catNumber+"="+satiety);
        }
    }
    public void info() {
        System.out.println("Осталось еды в тарелке: " + food);
    }

}
