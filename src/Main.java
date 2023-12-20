import homework.DayOfWeek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please press day of week");
        String input = scanner.nextLine().toUpperCase();

       DayOfWeek dayOfWeek = DayOfWeek.valueOf(input);
       boolean isWeekend = DayOfWeek.isWeekend(dayOfWeek);
        System.out.println("This day is weekend ?  " + isWeekend);

        }



    }
