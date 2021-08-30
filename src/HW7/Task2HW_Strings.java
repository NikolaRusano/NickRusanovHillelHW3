package HW7;

public class Task2HW_Strings {

    //выясните, под каким номером встроке стоит первая буква я.
    public static void getIndexFirstYaSymbol(String str){
        char [] arr = str.toCharArray();
        String ya = "я";
        for (int i = 0; i < arr.length; i++){

            if (arr[i] == ya){
                System.out.println("The ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Приключения вчерашнего найденыша, а ныне мага-демонолога " +
                "Неда Черного продолжаются!Что может быть красивее летящего в небе дракона?" +
                " Но не нужно забывать – это не игрушка, это довольно умное и опасное";

    }

}
