public class LifelineSite extends Site {
    private final Site s;
    private double units;
    private double rate;

    public LifelineSite(Site s, double units, double rate) {
        super();
        this.units = units;
        this.rate = rate;
        this.s = s;
    }

    public double getBillableAmount(){
        double base = units * rate * 0.5;
        double tax = base * s.TAX_RATE * 0.2;
        return base + tax;
    }
}
