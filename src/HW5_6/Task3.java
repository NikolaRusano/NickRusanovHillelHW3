package HW5_6;

public class Task3 {
    public static int getNumbSymbolsWord (char [] charArr){
        int quantity = 1;
        char tempChar= charArr[0];
        if(charArr.length > 1) {
            for (int i = 1; i < charArr.length; i++) {
                if(charArr[i] != charArr[i-1]){
                    quantity++;
                }
            }
            return quantity;
        }else {
            return 1;
        }

    }

    public static void stringMinSymbolsCheck(String str){
        String []tempStr = str.split(" ");
        String minSymbolWord = tempStr[0];
        int quantitySymbols = getNumbSymbolsWord(tempStr[0].toCharArray());
        for (int i =0; i < tempStr.length; i++) {
            if(getNumbSymbolsWord(minSymbolWord.toCharArray()) > getNumbSymbolsWord(tempStr[i].toCharArray())){
                minSymbolWord = tempStr[i];
                quantitySymbols = getNumbSymbolsWord(tempStr[i].toCharArray());
            }
        }
        System.out.println("The min quantity symbols of word in sentence is: " + minSymbolWord);
    }

    public static void main(String[] args) {
        String strTest = "fffff ab f 1234 jkjk";

        stringMinSymbolsCheck(strTest);

    }

}
