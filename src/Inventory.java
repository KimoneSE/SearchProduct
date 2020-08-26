import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * created by Kimone
 * date 2020/8/26
 */

/**
 * SRP原则：该类专注于实现库存管理
 */
public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(String serialNumber, double price, ProductSpec productSpec){
        Product product = new Product(serialNumber, price, productSpec);
        products.add(product);
    }

    public Product get(String serailNumber) {
        for(Iterator i =  products.iterator(); i.hasNext(); ){
            Product product = (Product) i.next();
            if(product.getSerialNumber().equals(serailNumber)) {
                return product;
            }
        }
        return null;
    }

    /**
     * SRP原则：该方法调用了Product类中的matches方法，当搜索条件发生变化时，不会影响到该方法的实现
     */
    public List<Product> search(SearchCondition searchCondition) {
        ProductSpec searchSpec = searchCondition.getSpec();
        List<Product> matchingProducts = new ArrayList<>();
        for(Iterator i = products.iterator(); i.hasNext(); ) {
            Product product = (Product) i.next();
            if(product.getPrice()>=searchCondition.getLowPrice() && product.getPrice()<=searchCondition.getHighPrice()){
                if(product.getProductSpec().matches(searchSpec)) {
                    matchingProducts.add(product);
                }
            }
        }
        return matchingProducts;
    }

}
