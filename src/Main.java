public class Main {
    public static void main(String[] args) {

        // Задача № 1
        System.out.println("Задача № 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача №2
        System.out.println("Задача № 2");
        int clientDiviceYear = 2015;
        if (clientOS == 0 && clientOS < clientDiviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS > 0 && clientOS < clientDiviceYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}