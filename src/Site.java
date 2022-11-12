public abstract class Site {

    public abstract double getTaxAmount();

    public abstract double getBaseAmount();

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
