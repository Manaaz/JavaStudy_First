package lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        if (satiety < appetite) {
            return satiety;
        }
        return appetite;
    }

    public void eat(Plate plate) {

        if (isFull()) {
            return;
        }

        int eat = getAppetite();
        int eatResult = plate.getFood();

        if(eatResult < eat){
            eat = eatResult;
        }

        eatResult -= eat;
        this.satiety -= eat;

        System.out.println("Cat " + name + " eat: " + eat);

        plate.setFood(eatResult);

    }

    private boolean isFull() {

        if (this.satiety == 0) {
            return true;
        }
        return false;

    }

    public String getCatSatietyStatus() {

        if (this.satiety == 0) {
            return "Cat " + name + " full!";
        }
        return "Cat " + name + " need more eating :" + satiety;

    }
}



