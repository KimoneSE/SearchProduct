package specification;

/**
 * created by Kimone
 * date 2020/8/26
 */

/**
 * SRP原则：ProductType用于管理产品类型，当需要添加新的产品类型时，仅需在枚举类中添加即可
 */
public enum ProductType {
    Laptop("笔记本"), Computer("台式机"),Server("服务器");

    private String productType;

    ProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }
}
