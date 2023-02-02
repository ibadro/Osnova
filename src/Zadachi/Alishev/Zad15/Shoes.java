package Zadachi.Alishev.Zad15;

import lombok.Getter;

@Getter
public class Shoes {
    private final String name;
    private final int size;
    private final int balance;


    public Shoes(String name, int size, int balance) {
        this.name = name;
        this.size = size;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", balance=" + balance +
                '}';
    }
}
