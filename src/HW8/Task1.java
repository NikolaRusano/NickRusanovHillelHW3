package HW8;
/*Определить интерфейс Printable, содержащий метод void print().
Определить класс Book, реализующий интерфейс Printable.
Определить класс Magazine, реализующий интерфейс Printable.
Создать класс для работы с книгами и журналами.
Создать массив типа Printable, который будет содержать книги и журналы.
В цикле пройти по массиву и вызвать метод print() для каждого объекта.
Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.
*/
public class Task1 {
    public static void main(String[] args) {


        Printable book1 = new Book("Stephen King", "Langolyers", "Horror", 355.50);
        Printable gqMagazine = new Magazine("America", "GQ", "September", 55.50);
        Printable zfMagazine = new Magazine("Australia", "ZF", "November", 75.50);
        Printable book2 = new Book("Evgeniy Shepetnov", "Magician", "Fantasy", 275.50);
        Printable book3 = new Book("Karl Yung", "Synchronization", "Psychology", 975.50);
        Printable[] arr = {book1, gqMagazine, zfMagazine, book2, book3};
        BookMagazineManagement bookMagazineManagement = new BookMagazineManagement(arr);
        bookMagazineManagement.printBookMagazine();
    }

}
