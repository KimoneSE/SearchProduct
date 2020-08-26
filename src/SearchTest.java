import specification.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/26
 */
public class SearchTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initInventory(inventory);

        Map<String,Object> properties = new HashMap<>();
        properties.put("productType", ProductType.Laptop);
        properties.put("processor", Processor.I9_U);
        ProductSpec productSpec = new ProductSpec(properties);
        SearchCondition searchCondition = new SearchCondition(productSpec);
//        searchCondition.setHighPrice(6000);
        List<Product> matchingProducts = inventory.search(searchCondition);
        if(!matchingProducts.isEmpty()) {
            System.out.println("The results are as follows：");
            for(Product product: matchingProducts) {
                ProductSpec spec = product.getProductSpec();
                System.out.println("We have a "+spec.getProperty("productType")+" with the following properties:");
                for(String propertyName: spec.getProperties().keySet()) {
                    if(propertyName.equals("productType")) continue;
                    System.out.println("   "+ propertyName+" : "+ spec.getProperty(propertyName));
                }
                System.out.println("   The price is "+product.getPrice()+" RMB"+"\n------------------");
            }
        }else {
            System.out.println("nothing found...");
        }
    }

    private static void initInventory(Inventory inventory) {
        Map<String, Object> properties1 = new HashMap<>();
        properties1.put("productType", ProductType.Computer);
        properties1.put("brand", Brand.Lenovo);
        properties1.put("category", Category.Other);
        properties1.put("size", Size.ElevenSix);
        properties1.put("processor", Processor.AMD);
        ProductSpec productSpec1 = new ProductSpec(properties1);

        Map<String, Object> properties2 = new HashMap<>();
        properties2.put("productType", ProductType.Laptop);
        properties2.put("brand", Brand.ThinkPad);
        properties2.put("category", Category.Light);
        properties2.put("size", Size.FourteenOne);
        properties2.put("processor", Processor.I9_U);
        ProductSpec productSpec2 = new ProductSpec(properties2);

        Map<String, Object> properties3 = new HashMap<>();
        properties3.put("productType", ProductType.Laptop);
        properties3.put("brand", Brand.Huawei);
        properties3.put("category", Category.Game);
        properties3.put("size", Size.Fifteen);
        properties3.put("processor", Processor.I9_U);
        ProductSpec productSpec3 = new ProductSpec(properties3);

        inventory.addProduct("qweqweqweqwe",4999, productSpec1);
        inventory.addProduct("123123123123",6999, productSpec2);
        inventory.addProduct("aaaaaaaaaaaa",5999, productSpec3);
    }
}
