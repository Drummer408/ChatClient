package model;

import java.util.List;

public class User {
    private int accountId;
    private String username;
    private List<Integer> friendsIds;
    private boolean isOnline;

    public User(int accountId, String username, List<Integer> friendsIds, boolean isOnline) {
        this.accountId = accountId;
        this.username = username;
        this.friendsIds = friendsIds;
        setIsOnline(isOnline);
    }

    public int getAccountId() {
        return accountId;
    }

    public String getUsername() {
        return username;
    }

    public List<Integer> getFriendsIds() {
        return friendsIds;
    }

    public void addFriend(int friendId) {
        friendsIds.add(friendId);
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }
}
