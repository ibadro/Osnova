package Zadachi.Alishev.Zad13;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User currenteUser : subscriptions) {
            currenteUser.getUsername().equals(user.getUsername());
            return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);

    }

    public void sendMessage(User user, String text) {
        MessageDatabase.adNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
