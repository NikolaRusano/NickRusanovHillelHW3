package HW8;

public class Book implements Printable {
    String  author, bookName, kind;
    double price;

    public Book(String author, String name, String kind, double price) {
        this.author = author;
        this.bookName = name;
        this.kind = kind;
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Author name: "+ getAuthor() + "\nName of book: "+ getBookName() +
                "\nkind of book: "+ getKind() +
                "\nPrice of book: "+ getPrice()  +"\n");
    }
}