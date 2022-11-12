public class ResidentialSite extends Site {

    private double units;
    private double rate;
    private final Site s;


    public ResidentialSite(Site s, double units, double rate) {
        super();
        this.units = units;
        this.rate = rate;
        this.s = s;
    }

    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * super.TAX_RATE;
        return base + tax;
    }
}
