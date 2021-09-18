package HW8;

public class BookMagazineManagement {

    private Printable[] printable;

    public BookMagazineManagement(Printable []printable){
        this.printable = printable;
    }

    public void printBookMagazine(){
        for(Printable printable:this.printable){
            if (printable instanceof Book){
            System.out.println("The item type Book were sold");
            printable.print();
        }else if (printable instanceof Magazine) {
                System.out.println("The item type Magazine were sold");
                printable.print();
            }
        }
    }

}
