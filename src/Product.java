/**
 * created by Kimone
 * date 2020/8/26
 */

/**
 * SRP原则：产品的属性被封装到了ProductSpec中，当产品属性发生变化时，不会影响到该类
 */
public class Product {

    private String serialNumber;
    private double price;
    private ProductSpec productSpec;

    public Product(String serialNumber, double price, ProductSpec productSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.productSpec = productSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductSpec getProductSpec() {
        return productSpec;
    }


}
