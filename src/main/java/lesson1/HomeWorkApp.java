package lesson1;

public class HomeWorkApp {

    void main() {
        System.out.println("Quest 2:");
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        System.out.println("Quest 3:");
        checkSumSign();
        System.out.println("Quest 4:");
        printColor();
        System.out.println("Quest 5:");
        compareNumbers();
    }

    public void printThreeWords(String word) {
        System.out.println(word);
    }

    public void checkSumSign() {
        int a = 9;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers() {
        int a = 9;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
