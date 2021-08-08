package HW4;

import java.util.Random;
import java.util.Scanner;

public class TaskForArrays {
    public static void main(String[] args) {


    int choice;

    Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Input number of task:\n" +
                "1 - Arrays in line and in column 2 till 20" + "\n" +
                "2 - Arrays in line 1 till 99 and 99 till 1" + "\n" +
                "3 - Averages of 2 random arrays" + "\n" +
                "0 - EXIT" + "\n");
        choice = scanner.nextInt();
        if (choice == 1) {
            showArrayFrom2Till20LineColumn();
        }else if(choice ==2) {
            showArrayFrom1Till99LineAscDesc();
        }else if(choice ==3) {
            int [] arr1 = new int[5];
            int [] arr2 = new int[5];

            fillArrWithRandNumb(arr1);
            fillArrWithRandNumb(arr2);

            System.out.println("Array 1: ");
            showArray(arr1);
            System.out.println("\nArray 2: ");
            showArray(arr2);
            double averageArr1 = 0.0, averageArr2= 0.0;
            averageArr1 = getAverageNumbArr(arr1);
            averageArr2 = getAverageNumbArr(arr2);
            if(averageArr1 > averageArr2){
                System.out.println("The Average of the first array " + averageArr1+ " is bigger than second one " + averageArr2);
            }else if(averageArr1 < averageArr2){
                System.out.println("The Average of the first array " + averageArr1+ " is less than second one " + averageArr2);
            }else if(averageArr1 == averageArr2){
                System.out.println("The Average of the first array " + averageArr1+ " is equal to second one " + averageArr2);
            }




        }

        }while(choice != 0);
    }

      public static void showArrayFrom2Till20LineColumn(){
            int[] arr = new int[10];
            for (int i = 2, j = 0; i<=20; i+=2, j++){
                arr[j] = i;
            }
          System.out.println("Array in Line:\n");
          for (int i:arr) {
              System.out.printf(i + "  ");
          }
          System.out.println("\nArray in Column:\n");
          for (int j:arr) {
              System.out.println(j);
          }
      }
      public static void showArrayFrom1Till99LineAscDesc(){
            int[] arr = new int[50];
            for (int i = 1, j = 0; i<=99; i+=2, j++){
                arr[j] = i;
            }
          System.out.println("Array in Line:\n");
          for (int i:arr) {
              System.out.printf(i + "  ");
          }
          System.out.println("\nArray in Line reverse:");
          for (int j= arr.length-1;j>-1;j--) {
              System.out.printf(arr[j] + "  ");
          }
      }

      public static void fillArrWithRandNumb(int [] arr){
          Random random= new Random();
          for (int i=0; i < arr.length; i++) {

              arr[i] =  random.nextInt(5);
          }
      }

    public static double getAverageNumbArr(int[]arr){
            int sum=0;
            //double average = 0.0;

    for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
    return (double) sum/arr.length;
}
    public  static void showArray (int[] arr){
        for (int i: arr) {
            System.out.printf(i + "  ");

        }
    }

}


