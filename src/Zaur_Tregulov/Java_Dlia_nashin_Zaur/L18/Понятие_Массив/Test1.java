
package Zaur_Tregulov.Java_Dlia_nashin_Zaur.L18.Понятие_Массив;

public class Test1 {
    
    public static void main(String[] args) {
        
        int [] array1; // примитивный одномерный массив типа инт
        String [] array2; // // референс одномерный массив типа Стринг
        double [][] array3; // примитивный двухмерный массив типа дабл
        // все они ссылаются на null
        // они пусты
        
        
        array1 = new int[8]; // создаем массив инт с длинной в 8 объектов
        array2 = new String[3];// создаем массив Стринг с длинной в 3 объекта
        array3 = new double[4][2]; // создаем двумерный массив с длинами (4-одомерных, в которых по 2 двухмерных)
        
        // по умолчанию пустые массивы имеют значения бай дефолт
        // то есть array1 будет иметь внутри cебя {0,0,0,0,0,0,0,0}
        // array2 - {null,null,null}

        
        int[][] array10; // создаем 2мерный массив
        array10 = new int[3][]; // который содержит 3 однмерных, но сколько внутри каждого, мы пока не знаем
        
        
        int arr1 [];
        int [] arr2;
        // можно ставить []  и так, и так
        
        int arr3[][];
        int [] arr4 [];
        int [][] arr5;
        // 3 варианта расставления [], и все правильные
        
    }
    
}
