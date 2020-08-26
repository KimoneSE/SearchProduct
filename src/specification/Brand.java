package specification;

/**
 * created by Kimone
 * date 2020/8/26
 */

public enum Brand {
    Lenovo("Lenovo"), ThinkPad("ThinkPad"), Huawei("Huawei");

    private String brandName;
    Brand(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

}
