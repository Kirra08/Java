package Q04;

public class Calculator {
    private double tax;
    private int price;

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int calc(int price) {
        return (int) (price * (1 + tax));
    }
}
