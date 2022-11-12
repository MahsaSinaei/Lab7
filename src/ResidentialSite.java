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

    public double getBaseAmount(){
        return units * rate;
    }
    public double getTaxAmount(){
        return getBaseAmount() * s.TAX_RATE;
    }


    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
