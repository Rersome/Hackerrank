package Zadachki;

public class JustANumber {
    public static void main(String[] args){
        for (int i = 2; i <= 1000; i++){
            boolean isWhat = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isWhat = false;
                    break;
                }
            }

            if (isWhat){
                System.out.println(i);
            }

        }
    }
}
