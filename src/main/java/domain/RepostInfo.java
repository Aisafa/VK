package domain;

public class RepostInfo {
    private int count;
    private boolean canRepost;
    private int userReposted;

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
