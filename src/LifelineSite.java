public class LifelineSite extends Site {
    private double units;
    private double rate;

    public LifelineSite(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    @Override
    public double getBaseAmount(){
        return units * rate * 0.5;
    }
    @Override
    public double getTaxAmount(){
        return getBaseAmount() * super.TAX_RATE * 0.2;
    }


}
