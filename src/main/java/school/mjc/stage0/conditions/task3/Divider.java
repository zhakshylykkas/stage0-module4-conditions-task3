package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (5 % number == 0 && 11 % number == 0) {
            System.out.println("Dividable");
        } else if (number == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Non-dividable");
        }
    }
}
