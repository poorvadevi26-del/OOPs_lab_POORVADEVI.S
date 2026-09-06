import java.util.*;

class RandomArray extends Thread {
    static int[] arr = new int[5];

    public void run() {
        Random r = new Random();

        System.out.println("Random Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Ascending extends Thread {
    public void run() {
        int[] a = RandomArray.arr.clone();
        Arrays.sort(a);

        System.out.println("Ascending Order:");
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }
}

class Descending extends Thread {
    public void run() {
        int[] a = RandomArray.arr.clone();
        Arrays.sort(a);

        System.out.println("Descending Order:");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

public class MultiThreadArray {
    public static void main(String[] args) throws Exception {

        RandomArray t1 = new RandomArray();
        t1.start();
        t1.join();

        Ascending t2 = new Ascending();
        Descending t3 = new Descending();

        t2.start();
        t3.start();

        t2.join();
        t3.join();
    }
}

