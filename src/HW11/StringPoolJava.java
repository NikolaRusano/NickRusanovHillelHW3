package HW11;

public class StringPoolJava  {
    public static void main(String[] args) {
        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";

        System.out.println(constantString1.hashCode() == constantString2.hashCode());
        System.out.println(constantString1.equals(constantString2));
        System.out.println(constantString1.hashCode());
        System.out.println(constantString2.hashCode());
        System.out.println("\n");

        String constantString = "Baeldung";
        String newString = new String("Baeldung");
        System.out.println(constantString.hashCode() == newString.hashCode());
        System.out.println(constantString.equals(newString));
        System.out.println(constantString.hashCode());
        System.out.println(newString.hashCode());
        System.out.println("\n");

        String first = "Baeldung";
        String second = "Baeldung";
        System.out.println(first == second);

        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        System.out.println(third == fourth);

        String fifth = "Baeldung";
        String sixth = new String("Baeldung");
        System.out.println(fifth == sixth);


        String constantString5 = "interned Baeldung";
        String newString5 = new String("interned Baeldung");

        System.out.println(constantString5.hashCode() == newString5.hashCode());
        System.out.println(constantString5.equals(newString5));
        System.out.println(constantString5.hashCode());
        System.out.println(newString5.hashCode());

        String internedString = newString5.intern();

        System.out.println(constantString5.hashCode() == internedString.hashCode());
        System.out.println(constantString5.equals(internedString));

        -XX:MaxPermSize=1G
                -XX:+PrintFlagsFinal
                -XX:+PrintStringTableStatistics






    }

}
