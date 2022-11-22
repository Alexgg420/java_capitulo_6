// Realiza un generador de melodía con las siguientes condiciones:
// a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
// la y si.
// b) Una melodía está formada por un número aleatorio de notas mayor o igual
// a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
// c) Cada grupo de 4 notas será un compás y estará separado del siguiente
// compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
// con dos barras.
// d) La última nota de la melodía debe coincidir con la primera.

import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("El programa genera una melodía");
        int nota = 0;
        String nomnota = "";
        int cont = 0;
        String nota1 = "";
        int cant = 4 * (int)(Math.random() * 7 + 1);
        for (int i = 1; i <= cant; i++){
            nota = (int)(Math.random() * 7);
            switch(nota){
                case 0:
                nomnota = "Do";
                break;

                case 1:
                nomnota = "Re";
                break;

                case 2:
                nomnota = "Mi";
                break;

                case 3:
                nomnota = "Fa";
                break;

                case 4:
                nomnota = "Sol";
                break;

                case 5:
                nomnota = "La";
                break;

                case 6:
                nomnota = "Si";
                break;

                default:
            }
            cont++;
            if(cont == 1){
                nota1 = nomnota;
            }
            if(cont == cant){
                nomnota = nota1;
            }
            System.out.print(nomnota + " ");
            if(cont == cant){
                System.out.print("||");
            }else if(cont % 4 == 0){
                System.out.print("| ");
            }
        }
        sc.close();
    }
}