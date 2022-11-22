import java.util.Scanner;
public class Ejercicio27{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la opción según su número (1. piedra, 2. papel o 3. tijera): ");
        String mano = "";
        int optmano = sc.nextInt();
        if (optmano < 1 || optmano > 3){
            System.out.println("Ha introducido una opción no válida");
        }
        else {
            switch(optmano){
                case 1:
                mano = "piedra";
                break;

                case 2:
                mano = "papel";
                break;

                case 3:
                mano = "tijera";
                break;

                default:
            }
            System.out.println("Turno del jugador: "+mano);
            String ord = "";
            int optord = (int)(Math.random() * 3) + 1;
            switch(optord){
                case 1:
                ord = "piedra";
                break;

                case 2:
                ord = "papel";
                break;

                case 3:
                ord = "tijera";
                break;

                default:
            }
            System.out.println("Turno del ordenador: " + ord);
            System.out.println(mano + " (ud) VS " + ord + " (ordenador)");
            if (mano == ord){
                System.out.println("Empate");
            }
            if (mano == "piedra" && ord == "papel"){
                System.out.println("Ordenador gana.");
            }
            if (mano == "piedra" && ord == "tijera"){
                System.out.println("Ud. gana.");
            }
            if (mano == "papel" && ord == "piedra"){
                System.out.println("Ud. gana.");
            }
            if (mano == "papel" && ord == "tijera"){
                System.out.println("Ordenador gana.");
            }
            if (mano == "tijera" && ord == "piedra"){
                System.out.println("Ordenador gana.");
            }
            if (mano == "tijera" && ord == "papel"){
                System.out.println("Ud. gana.");
            }
        }
        sc.close();
    }
}