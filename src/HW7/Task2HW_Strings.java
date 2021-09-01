package HW7;

public class Task2HW_Strings {

    //выясните, под каким номером встроке стоит первая буква я.
    public static void getIndexFirstYaSymbol(String str){
        char [] arr = str.toCharArray();
        char ya = 'я';
        for (int i = 0; i < arr.length; i++){
            //String temp = arr[i].toString();
            if ( ya == arr[i]){
                System.out.println("The first Я symbol is locate under " + i + " char array index");
                break;
            }
        }
    }

    public static void getIndexLastYaSymbol(String str){
        char [] arr = str.toCharArray();
        char ya = 'я';
        for (int i = arr.length-1; i > 0; i--){
            //String temp = arr[i].toString();
            if ( ya == arr[i]){
                System.out.println("The Last Я symbol is locate under " + i + " char array index");
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "Приключения вчерашнего найденыша, а ныне мага-демонолога " +
                "Неда Черного продолжаются!Что может быть красивее летящего в небе дракона?" +
                " Но не нужно забывать – это не игрушка, это довольно умное и опасное";

        getIndexFirstYaSymbol(str);
        getIndexLastYaSymbol(str);

    }

}
