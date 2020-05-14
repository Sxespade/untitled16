package lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Array<Integer> data = new ArrayImpl<>(1);
        data.add(1);
        data.remove(0);
        data.display();

        for (int i = 0; i < 100 ; i++) {
            data.add(new Random().nextInt());
        }

        System.out.println(data.size());

        Array<Integer> data1 = data;
        Array<Integer> data2 = data;

        long start = System.nanoTime();
        int start1 = (int) TimeUnit.MILLISECONDS.toSeconds(start);

        data.sortBubble(true);

        long stop = System.nanoTime();
        int stop1 = (int) TimeUnit.MILLISECONDS.toSeconds(stop);

        System.out.println(stop1-start1);


        start = System.nanoTime();
        start1 = (int) TimeUnit.MILLISECONDS.toSeconds(start);

        data1.sortSelect();

        stop = System.nanoTime();
        stop1 = (int) TimeUnit.MILLISECONDS.toSeconds(stop);

        System.out.println(stop1-start1);


        start = System.nanoTime();
        start1 = (int) TimeUnit.MILLISECONDS.toSeconds(start);

        data2.sortInsert();

        stop = System.nanoTime();
        stop1 = (int) TimeUnit.MILLISECONDS.toSeconds(stop);

        System.out.println(stop1-start1);



    }


}
