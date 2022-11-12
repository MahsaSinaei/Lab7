public class ResidentialSite extends Site {

    private double units;
    private double rate;


    public ResidentialSite(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    @Override
    public double getBaseAmount(){
        return units * rate;
    }
    @Override
    public double getTaxAmount(){
        return getBaseAmount() * super.TAX_RATE;
    }

}
