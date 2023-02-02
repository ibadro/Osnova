package Zadachi.Alishev.Zad11;
/*“Склад” (англ.  Warehouse ). Поля: countOrder(количество собранных заказов),  balance(доход от доставленных заказов).  Getи  setметоды для обоих полей. Для получения информации о значениях полей склада
 переопределите метод  toString() .*/
public class Warehouse {
   private int countOrder;
   private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Склад{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
