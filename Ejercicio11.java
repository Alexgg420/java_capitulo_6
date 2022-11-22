import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        String nota = "";
        int posnot;
        for (int i = 0; i < 20; i++){
            posnot = (int)(Math.random() * 5) + 1;
            switch (posnot) {
                case 1:
                nota = "Suspenso";
                break;

                case 2:
                nota = "Suficiente";
                break;

                case 3:
                nota = "Bien";
                break;

                case 4:
                nota = "Notable";
                break;

                case 5:
                nota = "Sobresaliente";
                break;

                default:
            }
            System.out.println(nota);
            if (nota == "Suspenso"){
                cont1++;
            }
            if (nota == "Suficiente"){
                cont2++;
            }
            if (nota == "Bien"){
                cont3++;
            }
            if (nota == "Notable"){
                cont4++;
            }
            if (nota == "Sobresaliente"){
                cont5++;
            }
        }
        System.out.println("Hay "+cont1+" suspensos");
        System.out.println("Hay "+cont2+" suficientes");
        System.out.println("Hay "+cont3+" bienes");
        System.out.println("Hay "+cont4+" notables");
        System.out.println("Hay "+cont5+" sobresalientes");
        sc.close();
    }
}