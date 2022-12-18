import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
//        task3();
    }


    // Task 1


    public static void task1() {
        System.out.println("Задача_3");
        System.out.println();
        int year = 2015;

        printIsLeapYear(year);

        System.out.println();
        System.out.println();
    }

    public static boolean isLeapYear(int year) {

        boolean leapYear;
        leapYear = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
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
        System.out.println();

        int osName = 0;
        int osYear = 2015;

        printNotification(osName, osYear);

        System.out.println();
        System.out.println();
    }

    public static String defineOSName (int osName) {

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
    public static void printNotification(int os, int Year) {
        String osName = defineOSName(os);
        String osYear = defineOSYear(Year);

        System.out.println("Для " + osName + " " + Year + " выпуска установите " + osYear);
    }

    // Task 3
}
