package HW7;

public class ClassForMethods {
//    Есть массив с интами.
//        1.Найти среднее арифимитическое всех чисел.
//        2.Числа Фибоначчи — элементы числовой последовательности 0, 1, 1, 2, 3
//          в которой первые два числа равны либо 1 и 1, либо 0 и 1,
//          а каждое последующее число равно сумме двух предыдущих чисел:
//          F0=0,
//          F1=1,
//          Fn=Fn-1 + Fn-2
//
//        3. Найти индекс максимального элемента в массиве,
//        а затем вывести данный элемент вместе с его индексом в консоль.
//
//        4. Найти суммы всех четных элементов массива.
//
//        5. Найти сумму индексов четных элементов массива.
//
//    Стринг:
//            1. выясните, под каким номером встроке стоит первая буква я.
//            2. выясните, под каким номером встроке стоит последняя буква я.

    public static void main(String args[]) {
        int[] arr = {2, 3, 6};
        getMiddleArithmetic(arr);
        int[] result = getFibonachiNumbers(13);
        printArray(result);
        System.out.printf("%d integer", 15);
        getMaxElementAndMaxIndex(arr);
    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int getMiddleArithmetic(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            // summ all elements
            summ += arr[i];
        }
        return summ / arr.length;
    }

    public static int[] getFibonachiNumbers(int ArrayLengths) {
        int[] array = new int[ArrayLengths];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static void getMaxElementAndMaxIndex(int[] arr) {
        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxIndex = i;
                maxValue = arr[i];
                System.out.println();
            }
        }
        System.out.println("max Value = " + maxValue + " max Index = " + maxIndex);
    }
}

