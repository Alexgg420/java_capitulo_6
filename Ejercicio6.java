import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int num = (int)(Math.random() * 101);
        System.out.println(num);
        System.out.println("El programa acaba de generar un número aleatorio entre el 0 y 100");
        System.out.println("Ud. tiene 5 oportunidades para adivinarlo");
        int opor = 5;
        System.out.print("Intente adivinar el número: ");
        int adiv = sc.nextInt();
        do {
            if (adiv != num){
                opor--;
                System.out.println("No ha acertado el número. Le quedan "+opor+" oportunidades");
                if (adiv < num){
                    System.out.println("El número que buscas es mayor");
                }
                if (adiv > num){
                    System.out.println("El número que buscas es menor");
                }
                System.out.println("Pruebe otra vez:");
                adiv = sc.nextInt();
            }
        } while (adiv != num && opor > 0);
        if (adiv == num){
            System.out.println("Enhorabuena! Ha adivinado el número");
        }
        if (opor == 0){
            System.out.println("Te has quedado sin oportunidades");
        }
        sc.close();
    }
}