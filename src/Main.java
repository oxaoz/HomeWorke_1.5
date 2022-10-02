public class Main {
    public static void main(String[] args) {

        // Задача № 1
        System.out.println("Задача № 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию  мобильного приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию мобильного приложения для Android по ссылке");
        }

        // Задача №2
        System.out.println("Задача № 2");
        int clientDiviceYear = 2014;
        if (clientOS == 0) {
            if (clientDiviceYear < 2015) {
                System.out.println("Установите облегченную версию мобильного приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию мобильного приложения для iOS по ссылке");
            }
        } else {
            if (clientDiviceYear < 2015) {
                System.out.println("Установите облегченную версию мобильного приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию мобильного приложения для Android по ссылке");
            }
        }

        // Задача №3
        int year = 2016;
        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача №4
    int deliveryDistance = 95;
    int deliveryDays = 1;
    if(deliveryDistance > 20 && deliveryDistance < 60){
        System.out.println("Потребуется дней: " + deliveryDays * 2);
    }
    else if (deliveryDistance > 60) {
        System.out.println("Потребуется дней: " + deliveryDays * 3);
    }

    // Задача №5
        int monthNumber = 1;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима.");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна.");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Такого месяца не существует");
    }
    }
}
