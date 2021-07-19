package Zadachki;

public class bubble {
    public static void main(String[] args){
        int[] array = new int[]{9, 4, 2, 3, 1, 5, 6, 7, 8, 0};
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int dot = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = dot;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
