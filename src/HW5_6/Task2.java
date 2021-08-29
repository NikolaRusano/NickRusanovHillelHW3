package HW5_6;

public class Task2 {
    public static void formatString(String []surname, int []grade, String []subjectOfKnowledge){
        for (int i = 0; i < 5; i++){
            System.out.println(String.format("Student  %s\t\t\t got %d\t on subject %s", surname[i],grade[i],subjectOfKnowledge[i]));
        }

    }

    public static void main(String[] args) {
        String [] surnames = {"Pitt","Aniston","Gibson","Swarchneger","Kidman"};
        String [] subjectMath = {"Mathematics", "Biology", "Geography", "Astronomy", "History"};
        int [] grades = {5, 4, 5, 2, 3};
        formatString(surnames,grades,subjectMath);

    }

}
