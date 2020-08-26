package specification;

/**
 * created by Kimone
 * date 2020/8/26
 */
public enum Size {
    BelowEleven("11英寸及以下"), ElevenSix("11.6英寸"),
    FourteenOne("14.1英寸"), Fifteen("15.0英寸");
    private String sizeName;

    Size(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getSizeName() {
        return sizeName;
    }
}
