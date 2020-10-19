package attachment;

public class Interview {
    private int id;
    private int owner_id;
    private int created;
    private String question;
    private int votes;
    private boolean anonymous;
    private boolean multiple;
    private boolean closed;
    private boolean can_edit;
    private boolean can_vote;
    private boolean can_report;
    private boolean can_share;
    private int author_id;
    private int friends[];

    class Answer {
        private int id;
        private String text;
        private int votes;
    }
    class Background {
        private int id;
        private String type;
        private int angle;
        private String color;
        private int width;
        private int height;
        private PhotoInfo.Size[] size;
    }
}
