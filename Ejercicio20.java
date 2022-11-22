import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de litros que caben en la cuba: ");
        int h = sc.nextInt();
        int litros = (int)(Math.random() * h + 1);
        // pared izquierda y contenido
        for (int i = 0; i < h; i++){
            if (i < (h - litros)){
                System.out.println("*    *");
            }
            else{
                System.out.println("*====*");
            }
        }
        // parte inferior
        System.out.println("******");
        sc.close();
    }
}