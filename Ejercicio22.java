import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud de los caracteres incluyendo la cabeza: ");
        int h = sc.nextInt();
        // posición cabeza
        System.out.println("            @");
        int cantesp = 12;
        String esp = " ";
        // longitud del cuerpo
        // primera línea de longiud
        for (int i = 0; i < h - 1; i++){
            int pos = (int)(Math.random() * 3) + 1;
            switch(pos){
                case 1:
                cantesp = cantesp - 1;
                break;

                case 2:
                cantesp = cantesp + 0;
                break;

                case 3:
                cantesp = cantesp + 1;
                break;

                default:
            }
            for (int j = 0; j < cantesp; j++){
                System.out.print(esp);
            }
            System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}