package HW9.HW8_enum;


public class Task1 {
    public static void main(String[] args) {



        Printable[] arr = {Book.LANGOLYERS,Magazine.GQMAGAZINE,Magazine.ZFMAGAZINE,Book.MAGICIAN,Book.SYNCHRONIZATION};
        BookMagazineManagement bookMagazineManagement = new BookMagazineManagement(arr);
        bookMagazineManagement.printBookMagazine();
    }

}
