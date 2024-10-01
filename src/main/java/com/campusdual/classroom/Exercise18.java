package com.campusdual.classroom;

public class Exercise18 {

    public static void main(String[] args) {


        createAndInitializeArray(5);
        showInlineArray(createAndInitializeArray(10));

    }

    public static int[] createAndInitializeArray(int valor) {
        int[] array = new int[valor];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static void showInlineArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i!=array.length-1){
                System.out.println(array[i] + " ");
            }else{
                System.out.println(array[i]);
            }
        }
    }


}
