import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int num = 0;
        int max = 100;
        int min = 199;
        int total = 0;
        for (int i = 0; i < 50; i++){
            System.out.print(num = (int)(Math.random() * 100 + 100));
            System.out.print(" ");
            cont++;
            total = total + num;
            if (max < num){
                max = num;
            }
            if (min > num){
                min = num;
            }
        }
        double media = ((double)total / cont);
        System.out.println();
        System.out.printf("El máximo es %d\n", max);
        System.out.printf("El mínimo es %d\n", min);
        System.out.printf("La media es %.2f", media);
        sc.close();
    }
}