import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int choice;


        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Input number of task:\n" +
                    "1 - inch into cm and cm into inches" + "\n" +
                    "2 - Vasya's Euro course money" + "\n" +
                    "3 - 2 signs number partially" + "\n" +
                    "4 - 2 signs number full view" +  "\n" +
                    "5 - Weight of he number"+ "\n" +
                    "6 - degree parity" + "\n" +
                    "7 - sign of the number"+ "\n" +
                    "8 - operations with 3 signs and positive numbers" + "\n" +
                    "9 - Comparison 2 signs number  and it's sum" + "\n" +
                    "0 - EXIT"+ "\n");
            choice = scanner.nextInt();
           if(choice == 1){
            double cm = 10.0, inches = 25.0;
               System.out.println(" The " + cm  + " cm in inches is: " + cmToInches(cm) + "and\n" +
                       + inches  + " inches in cm is: " + inchesToCm(inches));

           }else if(choice ==2){
                double vasyaSalary = 5000.0, parentGift = 5000.0, summaryMoneyHrn;
                summaryMoneyHrn = vasyaSalary + parentGift;
               System.out.println("According to the initial data Vasya has for travelling abroad" + "\n" +
                       "sum in hrn: " + summaryMoneyHrn + " and " + "\n" +
                       "sum in Eur: " + grnToEur(summaryMoneyHrn));

           }else if(choice == 3){
               int x ;
               char left = 0, right = 0;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               if (x<100 & x>9) {
                   getStartAndFinishNum(x, left, right);


               }else{
                   System.out.printf("The inputted number is not 2 digit\n");
               }
           }else if(choice ==4){
               int x ;
               int left = 0, right = 0;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               if (x<100 & x>9) {
                   getFullViewNum(x, left, right);
                   System.out.println("The result execution of number " + x + "" +
                           "is: " + left + "+" + left);

               }else{
                   System.out.printf("The inputted number is not 2 digit");
               }

           }else if(choice ==5){
               int x ;
               int left = 0, right = 0;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               if (x<100 & x>9) {

                   System.out.println("The weight of number " + x + "" +
                           "is: " + getWeight(x, left, right));

               }else{
                   System.out.printf("The inputted number is not 2 digit");
               }

           }else if(choice ==6){
               int x , parityDegree = 0;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               if (x<100 & x>9) {

                   System.out.println("The parity of degree of number " + x + "" +
                           "is: " + getParityDegree(x, parityDegree));

               }else{
                   System.out.printf("The inputted number is not 2 digit");
               }

           }else if(choice ==7){
               int x;
               boolean isPositive = false;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               getNumberSign(x,isPositive);

           }else if(choice == 8){
               int x;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               getNumberQuantityDigitsAndSign(x);

           }else if(choice == 9){
               int x;
               System.out.printf("Input x number please:");
               x = scanner.nextInt();
               if (x<100 && x>9 && x > 0) {

                   getBiggerFromNumbersSumAndNumberValue(x);

               }else{
                   System.out.printf("The inputted number is not 2 digit or less than 0");
               }
           }

        }while (choice!=0);


    }
    public static double inchesToCm(double inches){
        return inches * 2.54;
    }
    public static double cmToInches(double cm){
        return cm / 2.54;
    }
    public static double grnToEur (double summaryMoneyHrn){
        return summaryMoneyHrn/28;
    }
    public static void getStartAndFinishNum (int x, char left, char right){
        String temp = Integer.toString(x);

        char [] tempCarArr = temp.toCharArray();
        left = tempCarArr[0];

        right = tempCarArr[1];
        System.out.println("The result execution of number " + x + "" +
                "is: " + right + "  " + left);
    }
    public static void getFullViewNum (int x, int left, int right){
        right = x%10;

        int temp = x/10;

        left = temp*10;
        System.out.println("The weight of number " + x + "" +
                "is: " + left + "+" + right);
    }
    public static int getWeight (int x, int left, int right){
        right = x%10;

        left = x/10;
        int weight;
        return weight = left + right;
    }
    public static int getParityDegree(int x, int parityDegree){
        int right = x%10;
        if(right%2 == 0){
            parityDegree++;
        }
        int left = x/10;
        if(left%2 == 0){
            parityDegree++;
        }
        return parityDegree;

    }
    public static void getNumberSign(int x, boolean isPositive){
        if(x < 0){
            System.out.printf("The number is positive: " + isPositive);
        }else if(x>0){
            isPositive = true;
            System.out.println("The number is positive: " + isPositive + "\n");

        }else if(x == 0){
            System.out.println("The number x is " + x + " don't have sign" + "\n");
        }else {
            System.out.println("Incorrect input" + "\n");
        }
    }
    public  static void getNumberQuantityDigitsAndSign(int x){
        if(x>0 && x>99 && x<1000){
            System.out.println("The number " + x +" is positive and 3 digit that's why :\n" + (x-1));
        }else{
            System.out.println("You input wrong number");
        }
    }
    public static void getBiggerFromNumbersSumAndNumberValue(int x){
        int right = x%10;

        int left = x/10;
        int production = left*right;

        if(production<x){
            System.out.println("The production of numbers x "+ production + " is less than value " + x);
        }else if(production>x){
            System.out.println("The production of numbers x "+ production + " is bigger than value " + x);
        }else if(production==x){
            System.out.println("The production of numbers x "+ production + " is equal than value " + x);
        }

    }

}
