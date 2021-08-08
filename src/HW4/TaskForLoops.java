package HW4;

import java.util.Scanner;

public class TaskForLoops {
    public static void main(String[] args) {
        int choice;


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nInput number of task:\n" +
                    "1 - 1000 1003 1006 1009 1012 1015" + "\n" +
                    "2 - positive of 10, 6, 2,-2,-6,-10" + "\n" +
                    "3 - factorial" + "\n" +
                    "4 - quantity signs in the number" + "\n" +
                    "0 - EXIT" + "\n");
            choice = scanner.nextInt();
            if (choice == 1) {
                showLoopsubsequence();

            }else if(choice ==2){
                System.out.println("The positive of required subsequence:");
                showPositiveSubsequence();
            }else if(choice == 3){
                System.out.println("Input number for calculating factorial, please:");
                int num = scanner.nextInt();
                int factorial = getFactorial(num);
                System.out.println("The factorial of number " + num + " is: "+ factorial);
            }else  if (choice == 4){
                System.out.println("Input number for calculating it's quantity signs, please:");
                int num = scanner.nextInt();
                int quantitySigns = getNunmberQuantitySigns(num);
                System.out.println("The number: " + num + " contain " + quantitySigns +" signs");
            }
        }while(choice != 0);
    }


    public static void showLoopsubsequence(){
        for(int i = 1000; i <=1015; i+=3){
            System.out.printf(i+ "  ");
        }
    }


    public static void showPositiveSubsequence(){
        for(int i = 10; i >=-10; i-=4) {
            if (i > 0) {
                System.out.printf(i + "  ");
            }
        }
    }

    public static int getFactorial(int num){
        int f=1;
        for(int i = 2; i <= num; i++) {
            f *= i;
        }
        return f;
    }
    public static int getNunmberQuantitySigns(int num){
        int quantity=0;
        while(num > 0){
            num /=10;
            quantity++;
        }
        return quantity;
    }

}
