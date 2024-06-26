import java.util.List;
public interface Inventory
{
    void addproduct (Product product);
    Product getProductByName(String name);
    List<Product> getProducts();
}