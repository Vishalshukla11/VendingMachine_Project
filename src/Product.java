public interface  Product
{
    String getName();
    double getPrice();
    int getQuantity();
    void setQuantity(int quantity);
    String toString();
    boolean matches(String productName) ;
}