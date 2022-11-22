import java.util.Scanner;
public class Ejercicio25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++){
            int num = (int)(Math.random() * (100 - 10 + 1) + 10);
            boolean esPrimo = true;
            for (int j = 2; j < num; j++){
                if ((num % j) == 0){
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print("#"+num+"# ");
            }
            if (num % 5 == 0){
                System.out.print("["+num+"] ");
            }
            if (! esPrimo && ((num % 5) != 0)){
                System.out.print(num+" ");
            }
        }
        sc.close();
    }
}