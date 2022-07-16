package Q05;

public class Circle {
    private int PI;
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getEnsyu() {
        return 2 * (this.radius * Math.PI);
    }

    public double getMenseki() {
        return this.radius * this.radius * Math.PI;
    }
}
