package Zadachi.Alishev.Zad18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(877507857));
    }

    public static int count7(int num){
        if(num==0){
            return 0;
        }
        if(num%10==7) {
            return 1+count7(num/10);
        } else {
            return count7(num/10);
        }
    }
}
