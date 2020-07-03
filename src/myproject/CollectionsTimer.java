package myproject;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsTimer {

    public static void main (String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        HashSet<Integer> hset = new HashSet<>();

        timer(tset, "Tree-set");
        System.out.println();
        timer(hset, "Hash-set");

//        timeTreeSet();
//        System.out.println();
//        timeHashSet();
    }

    public static void  timeTreeSet() {

        TreeSet<Integer> a = new TreeSet<>();

        long startTime  = System.nanoTime();
        int i = 0;
        while (i < 1000000) {
            a.add(i);
            i += 1;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/ 1000000;
        System.out.println("TreeSet(add)(ms):"+ duration);


        startTime  = System.nanoTime();
        int j = 0;

        while (j < 1000000) {
            a.remove(i);
            j += 1;
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("TreeSet(next) ms: "+ duration);

    }

    public static void  timeHashSet() {
        HashSet<Integer> a = new HashSet<>();

        long startTime  = System.nanoTime();
        int i = 0;
        while (i < 1000000) {
            a.add(i);
            i += 1;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("HashSet(add)(ms): "+ duration);

        startTime  = System.nanoTime();
        int j = 0;
        while (j < 1000000) {
            a.remove(i);
            j += 1;
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("HashSet(next) ms: "+ duration);

    }

    public static void  timer(Collection<Integer> a, String tag) {
        long startTime  = System.nanoTime();
        int i = 0;
        while (i < 1000000) {
            a.add(i);
            i += 1;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println(tag + "(add)(ms): "+ duration);

        startTime  = System.nanoTime();
        int j = 0;
        while (j < 1000000) {
            a.remove(i);
            j += 1;
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println(tag + "(remove) (ms): "+ duration);

    }
}

