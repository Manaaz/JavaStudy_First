package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int foodCount){
        this.food = foodCount;
    }
    public int getFood(){
        return this.food;
    }

    public void info() {
        System.out.println("plate: " + this.food);
    }
}
