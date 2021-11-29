package Lessons;

public class Lesson2 {

    public void lesson2(int questNumber){

       switch (questNumber){
            case 1:
                System.out.println("quest 1:");
                System.out.println("a=4, b=6: " + isSumInLimits(4,  6));
                System.out.println("a=2, b=3: " + isSumInLimits(2,  3));
                System.out.println("a=15, b=6: " + isSumInLimits(15,  6));
                break;
            case 2:
                System.out.println("quest 2:");
                checkNumberSign(-5);
                checkNumberSign(3);
                checkNumberSign(0);
                break;
            case 3:
                System.out.println("quest 3:");
                System.out.println("-5. isBelowZero: " + isBelowZero(-5));
                System.out.println("3. isBelowZero: " + isBelowZero(3));
                System.out.println("0. isBelowZero: " + isBelowZero(0));
                break;
            case 4:
                System.out.println("quest 4:");
                int x = 5;
                compareStringInt("Repeat this string "+x+" times.", x);
                break;
            case 5:
                System.out.println("quest 5:");
                isLeapYear(1600);
                isLeapYear(1604);
                isLeapYear(1700);
                isLeapYear(2000);
                isLeapYear(2020);
                isLeapYear(2021);
                isLeapYear(2024);
                isLeapYear(400);
                break;
            default:
                System.out.println("Error. Wrong quest number (need 1-5).");
       }

    }

    private boolean isSumInLimits(int a, int b){
        int c = a + b;
        if (c >= 10 && c <= 20){
            return true;
        }
        return false;
    }

    private void checkNumberSign(int x){
        String result = "";
        if (x < 0){
            result = "Передано отрицательное число ("+x+")";
        } else {
            result = "Передано положительное число ("+x+")";
        }
        System.out.println(result);
    }

    private boolean isBelowZero(int x){
        if (x < 0){
            return true;
        }
        return false;
    }

    private void compareStringInt(String repeatString, int repeatCount){
        for (int i = 0; i < repeatCount; i++){
            System.out.println(repeatString);
        }
    }

    private boolean isYearDevidedByZero(int year, int devider){
       double devideResult = year%devider;
       return devideResult == 0.00;
    }
    private void isLeapYear(int year){

        boolean isLeap;
        boolean devidedBy4 = isYearDevidedByZero(year, 4);
        boolean devidedBy100 = isYearDevidedByZero(year, 100);
        boolean devidedBy400 = isYearDevidedByZero(year, 400);
        if (devidedBy4 == true && devidedBy100 == true && devidedBy400 == false){
            isLeap = false;
        } else if (devidedBy4 == true && devidedBy100 == true && devidedBy400 == true) {
            isLeap = true;
        } else if (devidedBy4 == true){
            isLeap = true;
        } else {
            isLeap = false;
        }
        System.out.println("year " + year + ": isLeap = " + isLeap +
                            " (devidedBy4:"+devidedBy4+
                            ", devidedBy100:"+devidedBy4+
                            ", devidedBy400:"+devidedBy400+
                        ")");
    }

}
