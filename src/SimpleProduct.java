class SimpleProduct implements Product
{
    private String name;
    private double price;
    private int quantity;

    public SimpleProduct(String name,double price ,int quantity)
    {
        this.name=name;
        this.price=price;
       this.quantity= quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
       return price;
    }

    @Override
    public int getQuantity() {
       return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
      this.quantity=quantity;
    }
    
    public String toString()
    {
        return name + " - rs " + price + " ("+ quantity + "availabe )";
    }

    @Override
    public boolean matches(String productName) {
       return this.name.equalsIgnoreCase(productName);
    }
}