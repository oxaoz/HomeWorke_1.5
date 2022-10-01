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
        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}

