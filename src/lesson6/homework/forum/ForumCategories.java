package lesson6.homework.forum;

import java.util.Date;

public class ForumCategories {
    private long id;
    private String title;
    private StringBuffer description;
    private Date date;
    private String ip;

    public ForumCategories(long id, String title, StringBuffer description, Date date, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }
}
