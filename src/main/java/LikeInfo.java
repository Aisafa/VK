public class LikeInfo {
    private Post post;
    private int count;
    private String idAuthorLike;
    private int userLike;

    public int getUserLike() {
        return userLike;
    }

    public void setUserLike(int userLike) {
        this.userLike = userLike;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getIdAuthorLike() {
        return idAuthorLike;
    }

    public void setIdAuthorLike(String idAuthorLike) {
        this.idAuthorLike = idAuthorLike;
    }
}
