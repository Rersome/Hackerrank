package Zadachki;

import java.util.Scanner;

public class bubble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] array = new int[10];
        for (int a = 0;  a < n; a++) {
            array[a] = sc.nextInt();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int dot = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = dot;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
