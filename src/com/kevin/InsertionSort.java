package com.kevin;

public class InsertionSort {
    public static void sort(){
        //想法：
        // 从index=1不断迭代至数组的尾部
        // 接着用该index和之前的所有数进行比较，当发现有较小数在之前时交换，当较大数或比完后停止比较/交换
        // 继续迭代index，直到尾部
        // ...
        // 直到队列的尾部结束
        // 对于较随机的数组 N**4 /4  次比较 ，N**4 /4次交换
        // 对于较顺序的数组 N**2 /2  次比较 ，N**2 /2次交换
        // 较适合于较为顺序的数组，顺序数组效率高于选择排序，随机乱序数组低于选择排序

        /*范例：
        int N = a.length;
        for(int i =1;i<N;i++){
            for(int j=i;j>0 && less(a[j],a[j-1]);j-- ){
                exch(a,j,j-1);
            }
        }
         */
    }
}
