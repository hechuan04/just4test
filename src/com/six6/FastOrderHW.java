package com.six6;

public class FastOrderHW {

    int cou = 100;

    static int array[] = {1, 2, 4, 4, 68, 9, 0, 5, 7, 9, 44, 4, 7, 99, 3, 3, 6, 6, 4, 333, 56, 74, 4, 6, 8, 7, 23, 35, 45, 879, 567, 456, 6};

    void func() {
        System.out.println("digui"+cou--);
        if(cou>=0) {
            func();
        }
    }

    void Qsort(int a[], int low, int high)
    {
        if(low >= high)
        {
            return;
        }
        int first = low;
        int last = high;
        int key = a[first];/*用字表的第一个记录作为枢轴*/

        while(first < last)
        {
            while(first < last && a[last] >= key)
            {
                --last;
            }

            a[first] = a[last];/*将比第一个小的移到低端*/

            while(first < last && a[first] <= key)
            {
                ++first;
            }

            a[last] = a[first];
            /*将比第一个大的移到高端*/
        }
        a[first] = key;/*枢轴记录到位*/
        Qsort(a, low, first-1);
        Qsort(a, first+1, high);
    }

    public static void main(String[] args) {
        FastOrderHW fastOrder = new FastOrderHW();
        fastOrder.Qsort(array,0,array.length-1);

        for (int b = 0; b < array.length; b++) {
            System.out.print(array[b] + " ");
        }
    }

}
