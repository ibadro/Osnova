package Zadachi.Alishev.Zad13;

import lombok.Getter;

import java.util.Date;

@Getter
public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "From:" + this.sender + "\nTO: " + receiver +
                "\nON" + date + "\n" + text + "\n";
    }
}
