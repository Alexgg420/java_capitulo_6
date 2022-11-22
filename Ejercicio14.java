import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Piense en un número entre el 0 y el 100 (ambos incluidos)");
        System.out.println("El programa tiene 5 oportunidades para adivinarlo");
        int opor = 4;
        System.out.println("Introduzca el número pensado");
        int n = sc.nextInt();
        int num = (int)(Math.random() * 101);
        int aux = num;
        System.out.println("¿El número pensado es "+num+"?");
        System.out.println("Escriba 1 en caso de Sí y 2 en caso de No");
        int res = sc.nextInt();
        int res2;
        do {
            if (res == 2){
                opor--;
                System.out.println("¿El número es menor o mayor al introducido? (Escriba 1 si menor o 2 si mayor)");
                res2 = sc.nextInt();
                int num2 = 0;
                if (res2 == 1){
                    num2 = (int)(Math.random() * aux);
                    aux = num2;
                    System.out.println("¿El número pensado es "+num2+"?");
                    System.out.println("Escriba 1 en caso de Sí y 2 en caso de No");
                    res = sc.nextInt();
                }
                if (res2 == 2){
                    num2 = (int)(Math.random() * (101 - aux) + aux);
                    aux = num2;
                    System.out.println("¿El número pensado es "+num2+"?");
                    System.out.println("Escriba 1 en caso de Sí y 2 en caso de No");
                    res = sc.nextInt();
                }
                aux = num2;
            }
        } while (res == 2 && opor > 0);
        if (res == 1){
            System.out.println("El programa ha acertado el número");
        }
        if (opor == 0){
            System.out.println("El programa se ha quedado sin oportunidades");
        }
        sc.close();
    }
}