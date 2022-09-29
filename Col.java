//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
/* 

import java.util.List;
public class Col {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6,7, 8);

        for (int item : list) {
            if(item % 2 != 0)
                System.out.println(item);
        }
    }
}

*/

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Collections;
public class Col {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(21);
        
        for (Integer o : list){
            sum = sum + o;
            i = i + 1;
        }
        System.out.println("Минимальное число: " + Collections.min(list));
        System.out.println("Максимальное число: " + Collections.max(list));
        System.out.println("Среднее: " + sum / i);
        
    }
}