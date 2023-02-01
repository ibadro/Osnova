
package Zaur_Tregulov.Java_Dlia_nashin_Zaur.L27.Исключения_и_Ошибки;

import java.io.*;

public class Test10_2 {
    
    static int abc(){
        
        int a = 5;
        try{
            File f = new File("test10.txt"); 
            FileInputStream fis = new FileInputStream(f);

        }
        catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException is catched");
            return a;
        }
        finally{
            a = 10;
            System.out.println("it's finally block");

        }
        return a;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(abc());
//        it's finally block
//        10
        // сработает return a из finally


    }
}
