package manager;

import domain.Post;

public class PostSearch {
    private PostManager postManager;
    private int authorID;
    private String domain;
    private String query;
    private boolean authorOnly;
    private int count;
    private int offset;

    public PostManager getPostManager() {
        return postManager;
    }

    public void setPostManager(PostManager postManager) {
        this.postManager = postManager;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isAuthorOnly() {
        return authorOnly;
    }

    public void setAuthorOnly(boolean authorOnly) {
        this.authorOnly = authorOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Post[] search() {
        return null;
    }
}
