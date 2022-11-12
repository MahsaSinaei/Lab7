public abstract class Site {
    double TAX_RATE = 10;

    public abstract double getTaxAmount();

    public abstract double getBaseAmount();

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
