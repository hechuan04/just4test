package com.six6;

public class ChoiceOrder {

    static int array[] = {1, 2, 4, 4, 68, 9, 0, 5, 7, 9, 44, 4, 7, 99, 3, 3, 6, 6, 4, 333, 56, 74, 4, 6, 8, 7, 23, 35, 45, 879, 567, 456, 6};

    void choiceOrder() {


        for (int i=array.length-1;i>0;i--) {
            int index=0;
            for (int j =0;j<=i;j++){
                if (array[j]>array[index]){
                    index = j;
                }
            }
            int temp =array[i];
            array[i]=array[index];
            array[index]=temp;

            for (int b = 0; b < array.length; b++) {
                System.out.print(array[b] + " ");
            }
            System.out.println();
        }

        for (int b = 0; b < array.length; b++) {
            System.out.print(array[b] + " ");
        }
    }

    public static void main(String[] args) {
        ChoiceOrder choiceOrder = new ChoiceOrder();
        choiceOrder.choiceOrder();
    }

}
