import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int par;
        int impar;
        int maxpar = -100;
        int minimpar = 200;
        int total = 0;
        for (int i = 1; i <= 50; i++){
            num = (int)(Math.random() * 301) - 100;
            total = total + num;
            System.out.print(num + " ");
            if ((num % 2) == 0){
                par = num;
                if (maxpar < par){
                    maxpar = par;
                }
            }
            if ((num % 2) != 0){
                impar = num;
                if (minimpar > impar){
                    minimpar = impar;
                }
            }
        }
        System.out.println();
        System.out.println("El número par más alto es: "+maxpar);
        System.out.println("El número impar más bajo es: "+minimpar);
        System.out.printf("La media de todos los números generados es de: %.2f",((float) total / 50));
        sc.close();
    }
}