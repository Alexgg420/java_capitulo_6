import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aparecerá el nombre de una carta en pantalla:");
        String palo = "";
        String carta = "";
        int numpalo = (int)(Math.random() * 4 + 1);
        switch(numpalo){
            case 1:
            palo = "oro";
            break;

            case 2:
            palo = "espada";
            break;

            case 3:
            palo = "copas";
            break;

            case 4:
            palo = "bastos";
            break;
        }
        int numcarta = (int)(Math.random() * 10 + 1);
        switch(numcarta){
            case 8:
            carta = "Sota";
            break;

            case 9:
            carta = "Caballo";
            break;

            case 10:
            carta = "Rey";
            break;

            default:
            carta = String.valueOf(numcarta);
        }
        System.out.println(carta + " de " + palo);
        sc.close();
    }
}