import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // Task 1
    public static void task1() {
        System.out.println("Задача_1");
        System.out.println();
        int year = 2015;

        printIsLeapYear(year);

        System.out.println();
        System.out.println();
    }

    public static boolean isLeapYear(int year) {

        boolean leapYear;
        leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return leapYear;
    }

    public static void printIsLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Task 2

    public static void task2() {
        System.out.println("Задача_2");
        System.out.println();

        int osName = 0;
        int osYear = 2015;

        printNotification(osName, osYear);

        System.out.println();
        System.out.println();
    }

    public static String defineOSName(int osName) {

        if (osName == 0) {
            return "iOS";
        } else if (osName == 1) {
            return "Android";
        } else {
            return "Unknown OS";
        }
    }

    public static String defineOSYear(int osYear) {
        int currentYear = LocalDate.now().getYear();

        if (osYear < currentYear) {
            return "облегчённую версию приложения";
        } else {
            return "обычную версию приложения";
        }
    }

    public static void printNotification(int os, int year) {
        String osName = defineOSName(os);
        String osYear = defineOSYear(year);

        System.out.println("Для " + osName + " " + year + " выпуска установите " + osYear);
    }

    // Task 3
    public static void task3() {
        System.out.println("Задача_3");
        System.out.println();

        int deliveryDistance = 55;

        printDeliveryTime(deliveryDistance);
    }

    public static String toCalculateDeliveryTime(int distance) {
        String deliveryTime = "";

        if (distance <= 20) {
            deliveryTime = "Доставка займёт 1 день";
        } else if (distance > 20 && distance <= 60) {
            deliveryTime = "Доставка займёт 2 дня";
        } else if (distance > 60 && distance <= 100) {
            deliveryTime = "Доставка займёт 3 дня";
        } else if (distance > 100) {
            deliveryTime = "Доставка на такое расстояние не производится";
        }
        return deliveryTime;
    }

    public static void printDeliveryTime(int enteredDistance) {

        System.out.println(toCalculateDeliveryTime(enteredDistance));
    }
}
