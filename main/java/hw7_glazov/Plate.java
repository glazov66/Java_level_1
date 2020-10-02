package hw7_glazov;

public class Plate {

    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "еды в тарелке (food) = " + food + ".";
    }

    public void addFood(int food) {
        this.food += food;
            }

    public void decreaseFood(int currentAppetite) {
        this.food -= currentAppetite;
    }
}
