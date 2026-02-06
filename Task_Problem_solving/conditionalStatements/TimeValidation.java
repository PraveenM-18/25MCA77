package conditionalStatements;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3));

        if (hour >= 0 && hour <= 23 && min >= 0 && min <= 59)
            System.out.println("Valid Time");
        else
            System.out.println("Invalid Time");
    }
}

