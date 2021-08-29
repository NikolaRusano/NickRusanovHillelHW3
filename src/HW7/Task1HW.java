package HW7;

import java.util.Random;

public class Task1HW {

    public static void ShowUpArr(int[]Arr){
        System.out.println("Array for show up:");
        for (int item :Arr){
            System.out.print(item +"\t");

        }
    }


    public static int getSumOddArrElements(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int getSumIndexesOddArrElements(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                int temp = i;
                sum += temp;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = random.nextInt((100-10)+1)+10;
        }

        ShowUpArr(arr);
        System.out.println("\nThe sum of the odd elements: " + getSumOddArrElements(arr));

        System.out.println("\nThe sum of the indexes odd elements: " + getSumIndexesOddArrElements(arr));



    }
}
