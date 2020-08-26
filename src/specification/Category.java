package specification;

/**
 * created by Kimone
 * date 2020/8/26
 */
public enum Category {

    Game("游戏本"), Light("轻薄本"), Other("其他");
    private String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
