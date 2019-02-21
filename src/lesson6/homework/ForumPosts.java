package lesson6.homework;

import java.util.Date;

public class ForumPosts {
    private long id;
    private ForumSubcategories subcategory;
    private Users user;
    private ForumPosts parentPost;
    private String title;
    private StringBuffer text;
    private boolean isPoll;
    private Date date;
    private String ip;

    public ForumPosts(long id, ForumSubcategories subcategory, Users user, ForumPosts parentPost, String title, StringBuffer text, boolean isPoll, Date date, String ip) {
        this.id = id;
        this.subcategory = subcategory;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.text = text;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }
}
