package lesson6.homework.forum;

import java.util.Date;

public class ForumPollsOptionsVotes extends ForumPolls {
    private ForumPollsOptions pollsOptions;
    private Users user;

    public ForumPollsOptionsVotes(long id, String title, Date date, ForumPollsOptions pollsOptions, Users user) {
        super(id, title, date);
        this.pollsOptions = pollsOptions;
        this.user = user;
    }
}
