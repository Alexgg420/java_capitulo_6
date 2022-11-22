import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aparecerá el nombre de una carta en pantalla:");
        String palo = "";
        String carta = "";
        int numpalo = (int)(Math.random() * 4 + 1);
        switch(numpalo){
            case 1:
            palo = "corazones";
            break;

            case 2:
            palo = "picas";
            break;

            case 3:
            palo = "diamantes";
            break;

            case 4:
            palo = "tréboles";
            break;
        }
        int numcarta = (int)(Math.random() * 13 + 1);
        switch(numcarta){
            case 1:
            carta = "As";
            break;

            case 11:
            carta = "J";
            break;

            case 12:
            carta = "Q";
            break;

            case 13:
            carta = "K";
            break;

            default:
            carta = String.valueOf(numcarta);
        }
        System.out.println(carta + " de " + palo);
        sc.close();
    }
}