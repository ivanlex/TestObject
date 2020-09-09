package com.kevin;

public class SelectionSort {
    public static void sort(){
        //想法：
        // 从index=0迭代找出最小值与index=0进行交换
        // 接着从index=1迭代找出最小值与index=1进行交换
        // ...
        // 直到队列的尾部结束
        // Big-O N**2 / 2 次比较 ，N次交换
        // 性能 774ms@30000item

        /*范例：
        for(int i =0;i<a.length;i++){
            int minValue = i;
            for(int j = i;j<a.length;j++){
                if(less(a[j],a[minValue])) {
                    minValue = j;
                }
            }
            exch(a,i,minValue);
        }
         */
    }
}
