import java.util.Scanner;
public class Ejercicio31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad que quiere apostar: ");
        int cant = sc.nextInt();
        int dado1;
        int dado2;
        int suma;
        int suma2;
        dado1 = (int)(Math.random() * 6) + 1;
        System.out.println("Primer dado: "+dado1);
        dado2 = (int)(Math.random() * 6) + 1;
        System.out.println("Segundo dado: "+dado2);
        suma = dado1 + dado2;
        System.out.println("La suma de los dos dados es de: "+suma);
        if (suma == 2 || suma == 3 || suma == 12){
            System.out.print("Ha perdido");
        }
        else if (suma == 7 || suma == 11){
            System.out.print("Ud. gana. Se le devuelve el doble de la cantidad apostada: "+ 2*cant);
        }
        else {
            System.out.println("Obtenga el mismo número nuevamente para ganar");
            System.out.println();
            do {
                dado1 = (int)(Math.random() * 6) + 1;
                System.out.println("Primer dado: "+dado1);
                dado2 = (int)(Math.random() * 6) + 1;
                System.out.println("Segundo dado: "+dado2);
                suma2 = dado1 + dado2;
                System.out.println("La suma de los dos dados es de: "+suma2);
                System.out.println();
            } while (suma2 != suma && suma2 != 7);
            if (suma2 == suma){
                System.out.print("Ud. gana. Se le devuelve el doble de la cantidad apostada: "+ 2*cant);
            }
            else if (suma2 == 7){
                System.out.print("Ha perdido");
            }
        }
        sc.close();
    }
}