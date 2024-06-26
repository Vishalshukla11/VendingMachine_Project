public interface Vendingmachine
{
    void insertCoin(Coin coin);
    Void dispenseProduct(String productName);
    void displayproducts();
    double getCurrentbalance();
    void restBalance();
}