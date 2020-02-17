package hw02.ShootingAtSquare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Game myGame= new Game();
        int line=0;
        int bar=0;

        myGame.PrintArea();
        while (true){
            System.out.print("Enter line for fire: ");
            line=scan.nextInt();
            if (!(line>=0 && line<=4))  continue;

            System.out.print("Enter bar for shoot: ");
            bar=scan.nextInt();
            if (!(bar>=0 && bar<=4)) continue;
            boolean won =  myGame.Fire(bar,line);
            if(won) {
                System.out.print("You have won");
                myGame.PrintArea();
                break;
            }
            else {
                myGame.PrintArea();
            }
        }
    }
}
