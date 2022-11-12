public class LifelineSite extends Site {
    private double units;
    private double rate;
    private double TAX_RATE;

    public LifelineSite(double TAX_RATE,double units, double rate) {
        this.TAX_RATE = TAX_RATE;
        this.units = units;
        this.rate = rate;
    }

    @Override
    public double getBaseAmount(){
        return units * rate * 0.5;
    }
    @Override
    public double getTaxAmount(){
        return getBaseAmount() * TAX_RATE * 0.2;
    }


}
