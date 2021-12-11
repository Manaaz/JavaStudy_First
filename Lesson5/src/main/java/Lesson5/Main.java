package Lesson5;

public class Main {

    public static void main(String[] args){

        Employee[] employeesArray = initEmployees();

        System.out.println("Сотрудники старше 40 лет:");
        for(int i = 0; i < employeesArray.length; i++){
            Employee employee = employeesArray[i];
            if(employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    }

    private static Employee[] initEmployees(){
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Sergey Shumkov",
                "Programmer",
                "programmer_Sergio@pochta.ru",
                "+7(111)111-11-11",
                80000,
                30);
        employeesArray[1] = new Employee("Ivan Ivanovich",
                "Programmer",
                "programmer_2@pochta.ru",
                "+7(111)111-11-11",
                55000,
                45);
        employeesArray[2] = new Employee("Izum Izyumovich",
                "Programmer",
                "programmer_3@pochta.ru",
                "+7(111)111-11-11",
                150000,
                41);
        employeesArray[3] = new Employee("Lector Cinnbal",
                "Programmer",
                "programmer_4@pochta.ru",
                "+7(111)111-11-11",
                90000,
                42);
        employeesArray[4] = new Employee("Megamozg Megamozgovich",
                "Super Programmer",
                "programmer_5@pochta.ru",
                "+7(111)111-11-11",
                3000000,
                33);
        return employeesArray;
    }

}

