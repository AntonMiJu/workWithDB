package lesson6.homework;

import java.util.Date;

public class ForumSubcategories extends ForumCategories {
    private ForumCategories category;

    public ForumSubcategories(long id, String title, StringBuffer description, Date date, String ip, ForumCategories category) {
        super(id, title, description, date, ip);
        this.category = category;
    }
}
