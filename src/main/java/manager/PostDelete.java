package manager;

public class PostDelete {
    private PostManager postManager;
    private int authorId;
    private int postId;

    public PostManager getPostManager() {
        return postManager;
    }

    public void setPostManager(PostManager postManager) {
        this.postManager = postManager;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void deletePost() {

    }

}
