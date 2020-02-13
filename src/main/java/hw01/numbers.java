package hw01;
import java.util.Random;
import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Let the game begin!");
        int ran_num = ran.nextInt(100 + 1);
        while (true) {
            System.out.print("Enter one random number: ");
            int user_num = scan.nextInt();
            if (user_num < ran_num) {
                System.out.println("Your number is too small. Please, try again");
            } else if (user_num > ran_num) {
                System.out.println("Your number is too big. Please, try again");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
    }
