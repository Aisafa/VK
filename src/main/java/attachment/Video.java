package attachment;

public class Video {
    private int videoId;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private int date;
    private int adding_date;
    private int local_view;
    private int commentsCount;
    private String player;
    private String platform;
    private int can_edit;
    private int can_add;
    private int is_private;
    private String access_key;
    private int processing;
    private int can_comment;
    private int can_like;
    private int can_repost;
    private int can_subscribe;
    private int can_add_to_favorites;
    private int can_attach_link;
    private int width;
    private int height;
    private int user_id;
    private int converting;
    private int added;
    private int subscribed_id;
    private int repeat;
    private String type;
    private int balance;
    private String live_status;
    private int live;
    private int upcoming;
    private int spectators;

    class likes {
        private int count;
        private int user_likes;
    }

    class reposts {
        private int count;
        private int wall_count;
        private int mail_count;
        private int user_reposted;
    }

    class imageCover {
        private int height;
        private int width;
        private int with_pudding;
        private String url;
    }

    class first_frame {
        private int height;
        private int width;
        private String url;
    }
}
