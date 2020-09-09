package com.kevin;

import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i =1;i<N;i++){
            for(int j=i;j>0 && less(a[j],a[j-1]);j-- ){
                exch(a,j,j-1);
            }
        }
    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for(int i =0;i<a.length;i++){
            System.out.printf("%s ",a[i]);
        }
        System.out.println("");
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++){
            if(less(a[i],a[i-1])) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        //prepare data
        int datalength = 300000;
        Integer[] a = new Integer[datalength];

        for(int i =0;i<datalength;i++){
            a[i] = (int)(Math.random() * i);
        }

//        String[] a = new String[]{"e","x","a","m","p","l","e"};
        System.out.println("Data prepared");

        //start watcher

        StopWatcher watch = new StopWatcher();

        //algorithm test
        sort(a);

        //stop watcher
        watch.stop();

        //check algorithm result
        assert isSorted(a);

        //print data
        show(a);




        System.out.printf("%s %d\n","Elapsed Time is",watch.elapsedTime());


    }


}
