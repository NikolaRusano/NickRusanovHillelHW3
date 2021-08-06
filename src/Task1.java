import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int choice;


        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Input number of task:" +
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
               System.out.println(" The " + cm  + " cm in inches is: " + cmToinchesm(cm) + "and\n" +
                       + inches  + " inches in cm is: " + inchesToCm(inches));

           }else if(choice ==2){

           }

        }while (choice!=0);


    }
    public static double inchesToCm(double inches){
        return inches * 2.54;
    }
    public static double cmToinchesm(double cm){
        return cm / 2.54;
    }

}
