package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(31);
        } else if (month == 2) {
            System.out.println(28);
        } else if (month < 1 || month > 13) {
            System.out.println("wrong number!");
        } else {
            System.out.println(30);
        }
    }
}
