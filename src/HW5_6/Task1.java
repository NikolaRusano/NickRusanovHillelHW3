package HW5_6;

public class Task1 {

    public static void LastCharSymbol(String str){
        char lastChar = str.charAt(str.length()-1);
        System.out.println("The last char at string is: " + lastChar);
    }

    public static boolean isEndsWithSubStr(String str){
        if(str.endsWith("!!!")){
            return true;
        }
        return false;
    }

    public static boolean isStartsWithSubStr(String str){
        if(str.startsWith("I like")){
            return true;
        }
        return false;
    }

    public static boolean isContainSubStr(String str){
        if(str.contains("Java")){
            return true;
        }
        return false;
    }

    public static void findPositionSubString(String str){
        if(str.contains("Java")){
            System.out.println("The position of substring Java in String is: " + str.indexOf("Java"));

        }else {
            System.out.println("The string doesn't contain substring Java");
        }
    }

    public static void replaceALetterToO(String str){
        System.out.println("The String after replacement A to O is:" + str.replace("a","o"));
    }

    public static void replaceToUpperCase(String str){
        System.out.println("The String after update into UpperCase is:" + str.toUpperCase());
    }

    public static void replaceToLowerCase(String str){
        System.out.println("The String after update into LowerCase is:" + str.toLowerCase());
    }

    public static void cutOutSubString(String str){
        String substr = str.substring(str.indexOf("Java"),str.indexOf("Java")+4);
        System.out.println("The result cut off string: " + substr);
    }



    public static void main(String[] args) {
        String str = "I like C# more than Java!!!";

        LastCharSymbol(str);

        boolean isEndsWith = isEndsWithSubStr(str);
        System.out.println("The string ends with !!!:  " + isEndsWith);

        boolean isStartsWith = isStartsWithSubStr(str);
        System.out.println("The string starts with I like: " + isStartsWith);

        boolean isContainSubstr = isContainSubStr(str);
        System.out.println("The string contains  Java: " + isContainSubStr(str));

        findPositionSubString(str);

        replaceALetterToO(str);

        replaceToUpperCase(str);

        replaceToLowerCase(str);

        cutOutSubString(str);



    }
}
