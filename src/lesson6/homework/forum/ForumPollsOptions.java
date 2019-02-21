package lesson6.homework.forum;

import java.util.Date;

public class ForumPollsOptions extends ForumPolls {
    private ForumPosts post;

    public ForumPollsOptions(long id, String title, Date date, ForumPosts post) {
        super(id, title, date);
        this.post = post;
    }
}
