/**
 * created by Kimone
 * date 2020/8/26
 */
public class SearchCondition {
    private ProductSpec spec;
    private double lowPrice = Double.MIN_VALUE;
    private double highPrice = Double.MAX_VALUE;

    public SearchCondition(ProductSpec spec) {
        this.spec = spec;
    }

    public ProductSpec getSpec() {
        return spec;
    }

    public void setSpec(ProductSpec spec) {
        this.spec = spec;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

}
