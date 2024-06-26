import java.util.ArrayList;
import java.util.List;

class ProductInventory implements Inventory
{
    private List<Product> products;

    public ProductInventory()
    {
        products=new ArrayList<>();
    }

    public void addproduct(Product product)
    {
        products.add(product);
    }

    public Product getProductByName(String name)
    {
        String lowerCaseName=name.toLowerCase();//convert input name to lowercase
        for(Product product : products)
        {
            if(product.matches(lowerCaseName))
            {
               return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getProducts() {
      return products;
    }
    
}