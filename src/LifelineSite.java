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

    public double getBaseAmount(){
        return units * rate * 0.5;
    }
    public double getTaxAmount(){
        return getBaseAmount() * s.TAX_RATE * 0.2;
    }


    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

}
