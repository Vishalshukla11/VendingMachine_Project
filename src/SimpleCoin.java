class SimpleCoin implements Coin{
    private double value;
    public SimpleCoin(double value)
    {
        this.value=value;
    }

    @Override
    public double getValue() {
        // TODO Auto-generated method stub
        return value;
    }
}