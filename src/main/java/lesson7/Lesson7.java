package lesson7;

public class Lesson7 {

    public static void main(String[] args){

        StringBuilder catsStatuses = new StringBuilder();
        Plate plate = new Plate(100);
        Cat[] catArr = getNewCatsArray();

        for(int i = 0; i < catArr.length; i++){

            catArr[i].eat(plate);
            plate.info();

            String catStatus = catArr[i].getCatSatietyStatus();
            if(!catsStatuses.isEmpty()) {
                catsStatuses.append("\n");
            }
            catsStatuses.append(catStatus);
        }

        System.out.println();
        System.out.println("Cat`s statuses:");
        System.out.println(catsStatuses);

    }

    static Cat[] getNewCatsArray(){
        Cat[] catArr = {
                new Cat("Barsik", 25, 25),
                new Cat("Kuzya", 20, 20),
                new Cat("Seoma", 15, 30),
                new Cat("Jora", 50, 50)
        };
        return catArr;
    }

}

