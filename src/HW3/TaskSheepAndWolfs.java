package HW3;

import java.util.Scanner;

public class TaskSheepAndWolfs {
    public static void main(String[] args) {
        System.out.println("Input coordinates X and Y (from 0 till 12) \n input X:");
        Scanner scanner = new Scanner(System.in);
        int X, Y;

            X = scanner.nextInt();
            System.out.println("input Y: ");
            Y = scanner.nextInt();

        if(X < 2 && X > 10  && Y < 2 && Y > 9){
            System.out.println("Coordinates You're inputted out of the range");
        }else if(X>=2 && X<=4 && Y >=2 && Y <= 9 || X >= 8 && X <=10 && Y >=2 && Y <= 9 || Y >= 2 && Y <= 4 && X >= 4 && X <=8 || Y >= 7 && Y <= 7 && X >= 4 && X <=8 ){
            System.out.println("Coordinates You're inputted - area of the wolfs");
        }else if(X>=4 && X<=8 && Y >=3 && Y <= 7 ){
            System.out.println("Coordinates You're inputted - area of the sheep");
        }else {
            System.out.println("Out of the range input");
    }
    }
}
