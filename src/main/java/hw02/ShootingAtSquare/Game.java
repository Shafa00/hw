package hw02.ShootingAtSquare;

import java.util.Random;

public class Game {
    int target_i;
    int target_j;
    String arr[][];

    public Game(){

        Random ran=new Random();
        arr=new String[5][5];
        target_i=ran.nextInt(arr.length);
        target_j=ran.nextInt(arr.length);
        System.out.println(target_j);
        System.out.println(target_i);

        CreateArea();
    }
    boolean   Fire(int i, int j ) {
        System.out.println("All set.Get ready to rumble!");
        if(target_i==i&target_j==j){
            arr[i][j]=" x ";
            return true;
        }

        arr[i][j]=" * ";
        return false;
    }
    void CreateArea()
    {
        for (int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                arr[i][j]=" - ";
    }
    void PrintArea()
    {
        System.out.println();
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++)  System.out.print(arr[i][j]);
            System.out.println();
        }
    }
    public static void main(String[] args) {}
}
