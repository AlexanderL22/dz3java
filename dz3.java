import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class dz3 {
    public static void main(String[] args) {
        Random rndNumb = new Random();
        int capacity = 20;
        int minNumb,maxNumb;
        float averNumb=0;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(capacity);
        for (int i = 0; i < capacity; i++) {
            listNumb.add(rndNumb.nextInt(100));
            averNumb=averNumb+listNumb.get(i);
        }
        System.out.println(" Список случайных чисел : ");
        System.out.println(listNumb);
        Collections.sort(listNumb);
        System.out.println("Отсортированный список : ");
        System.out.println(listNumb);
        minNumb=listNumb.get(0);
        maxNumb=listNumb.get(capacity-1);
        System.out.println("Сумма чисел  = "+averNumb);
        averNumb=averNumb/capacity;
        System.out.println("Минимальный = "+minNumb);
        System.out.println("Максимальный = "+maxNumb);
        System.out.println("Среднееарифметическое = "+averNumb);
    }
}
