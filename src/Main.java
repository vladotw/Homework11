public class Main {

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
    }


    // Task 1
    public static boolean isLeapYear(int year) {
        boolean leapYear;
        leapYear = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
        return leapYear;
    }

    public static void task1() {
        System.out.println("Задача_3");
        System.out.println();
        int year = 2100;

        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }

        System.out.println();
        System.out.println();
    }
}