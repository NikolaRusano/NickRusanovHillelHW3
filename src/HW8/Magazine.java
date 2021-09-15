package HW8;

public class Magazine implements Printable{

    private String  redaction, series, monthProduction;
    private  double price;

    public Magazine(String redaction, String series, String monthProduction, double price) {
        this.redaction = redaction;
        this.series = series;
        this.monthProduction = monthProduction;
        this.price = price;
    }

    public String getRedaction() {
        return redaction;
    }

    public void setRedaction(String redaction) {
        this.redaction = redaction;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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
        System.out.println("Name of reduction: "+ getRedaction() + "\nSeries of magazine: "+ getSeries() +
                 "\nMonth of production magazine: "+ getMonthProduction() +
                 "\nPrice of magazine: "+ getPrice() );
    }
}
