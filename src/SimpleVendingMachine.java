public class SimpleVendingMachine implements Vendingmachine
{
    private Inventory inventory;
    private double currentBalance;
    public SimpleVendingMachine(Inventory inventory)
    {
        this.inventory=inventory;
        currentBalance=0.0;
    }

    @Override
    public void insertCoin(Coin coin) {
      currentBalance += coin.getValue();
      System.out.println("current balance: rs " + currentBalance);
    }

    @Override
    public Void dispenseProduct(String productName) {
      Product product =inventory.getProductByName(productName);
      if(product !=null)
      {
        if(product.getQuantity() > 0)
        {
            if(currentBalance >= product.getPrice())
            {
                product.setQuantity(product.getQuantity()-1);
                currentBalance-=product.getPrice();
                System.out.println("Dispensing " + productName);
                System.out.println("Remaining balance : rs " + currentBalance);
            }
            else{
                System.out.println("insufficent fund");
            }
        }
        else
        {
            System.out.println("Product out of stock.");
        }
        
      }
      else
      {
        System.out.println("Product not found");
      }
    return null;

    }

    @Override
    public void displayproducts() {
        for(Product product : inventory.getProducts())
        {
        System.out.println(product);
        }
    }

    @Override
    public double getCurrentbalance() {
        
        return currentBalance;
        
    }

    @Override
    public void restBalance() {
        currentBalance = 0.0;
    }
    
}