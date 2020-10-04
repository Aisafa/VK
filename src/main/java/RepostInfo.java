public class RepostInfo {
    private Post post;
    private int count;
    private boolean canRepost;
    private int userReposted;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
