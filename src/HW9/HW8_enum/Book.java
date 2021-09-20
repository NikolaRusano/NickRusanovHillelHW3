package HW9.HW8_enum;

public enum Book implements Printable {
    LANGOLYERS("Stephen King","",355.50),
    MAGICIAN("Evgeniy Shepetnov", "Fantasy", 275.50),
    SYNCHRONIZATION("Karl Yung","Psychology", 975.50);

    String  author, kind;
    double price;

    private Book(String author, String kind, double price) {
        this.author = author;
        this.kind = kind;
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
        System.out.println("Author name: "+ getAuthor() + "\nName of book: " +
                "\nkind of book: "+ getKind() +
                "\nPrice of book: "+ getPrice()  +"\n");
    }
}