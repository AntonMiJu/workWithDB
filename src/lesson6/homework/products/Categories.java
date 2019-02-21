package lesson6.homework.products;

public class Categories {
    private long id;
    private String categoryName;
    private StringBuffer description;
    private String picture;

    public Categories(long id, String categoryName, StringBuffer description, String picture) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }
}
