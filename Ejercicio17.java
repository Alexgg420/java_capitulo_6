import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el ancho de la pecera: ");
        int b = sc.nextInt();
        System.out.print("Introduzca la altura de la pecera: ");
        int h = sc.nextInt();
        int pos = 0;
        int pospez = (int)(Math.random() * (b - 2) * (h - 2));
        // parte superior
        for (int i = 1; i <= b; i++){
            System.out.print("*");
        }
        System.out.println();
        // parte central
        for (int i = 2; i < h; i++){
            // pared izquierda
            System.out.print("*");
            for (int j = 2; j < b; j++){
                if (pos == pospez){
                    System.out.print("&");
                }
                else {
                    System.out.print(" ");
                }
                pos++;
            }
            // pared derecha
            System.out.println("*");
        }
        // parte inferior
        for (int i = 1; i <= b; i++){
            System.out.print("*");
        }
        sc.close();
    }
}