package hw03;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "monday";
        schedule[1][1] = "go to courses; watch a film";
        while (true) {
            System.out.print("Please, input the day of the week: ");
            String s = scan.nextLine();
            switch (s.toLowerCase().trim()) {
                case "sunday":
                    System.out.printf("Your tasks for %s: %s\n",schedule[0][0], schedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[1][0], schedule[1][1]);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }

        }

    }
}
