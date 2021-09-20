package HW9.HW8_enum;

public enum Magazine implements Printable {
    GQMAGAZINE("America", "September", 55.50),
    ZFMAGAZINE("Australia", "November", 75.50);


    private String  redaction, monthProduction;
    private  double price;

    private Magazine(String redaction, String monthProduction, double price) {
        this.redaction = redaction;
        this.monthProduction = monthProduction;
        this.price = price;
    }

    public String getRedaction() {
        return redaction;
    }

    public void setRedaction(String redaction) {
        this.redaction = redaction;
    }

    public String getMonthProduction() {
        return monthProduction;
    }

    public void setMonthProduction(String monthProduction) {
        this.monthProduction = monthProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Name of reduction: "+ getRedaction() +
                 "\nMonth of production magazine: "+ getMonthProduction() +
                 "\nPrice of magazine: "+ getPrice() +"\n");
    }
}
