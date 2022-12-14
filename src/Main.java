public class Main {

    public static void identifyLeapYear () {
        int year = 2020;
        if (year % 4 == 0 && year % 100 == year % 400) {
            System.out.println(year + " - високосный год");
        }
        else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void  installationApp () {
        int clientDeviceOS = 0;
        int clientDeviceYear = 2015;
        int currentYear = 2022;
        if (clientDeviceOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS");
        }
        if (clientDeviceOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS");
        }
        if (clientDeviceOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
        if (clientDeviceOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android");
        }
    }
    public static void main(String[] args) {
        identifyLeapYear();
        installationApp();
    }
}