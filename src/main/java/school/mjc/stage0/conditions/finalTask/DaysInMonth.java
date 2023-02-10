package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int leap;
        if ((year < 0) || (month < 1)|| (month > 12)) {
            System.out.println("invalid date");
        } else {
            if (year % 400 == 0) {
                leap = 1;
            } else if (year % 100 == 0) {
                leap = 0;
            } else if (year % 4 == 0) {
                leap = 1;
            } else leap = 0;

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(31);
                    break;
                case 4, 6, 9, 11:
                    System.out.println(30);
                    break;
                case 2:
                    if (leap == 1) {
                        System.out.println(29);
                    } else System.out.println(28);
            }
        }

    }
}
