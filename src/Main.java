public class Main {
    public static void main(String[] args) {
        //task-1
        System.out.println("Задача-1");

        int clientOC = 1;
        switch (clientOC) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Приложение не поддерживается");
        }


        //task-2
        System.out.println("Задача-2");

        int clientOC2 = 1;
        int clientDeviceYear = 2014;
        if (clientOC2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOC2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOC2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOC2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //task-3
        System.out.println("Задача-3");

        int year = 1580;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (isLeapYear) {
            System.out.println("Год является високосный");
        } else {
            System.out.println("Год не является високосным");
        }

        //task-4
        System.out.println("Задача-4");

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день на доставку");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня на доставку");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня на доставку");
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        //task-5
        System.out.println("Задача-5");

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
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
                System.out.println("Такого месяца нет");
        }
    }
}