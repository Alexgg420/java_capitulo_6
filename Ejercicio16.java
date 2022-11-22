import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String obj = "";
        int objeto;
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int cont = 0;
        for (int i = 1; i <= 3; i++){
            objeto = (int)(Math.random() * 5) + 1;
            cont++;
            switch (objeto){
                case 1:
                obj = "corazón";
                break;

                case 2:
                obj = "diamante";
                break;

                case 3:
                obj = "herradura";
                break;

                case 4:
                obj = "campana";
                break;

                case 5:
                obj = "limón";
                break;

                default:
            }
            System.out.print(obj + " ");
            if (cont == 1){
                aux1 = objeto;
            }
            if (cont == 2){
                aux2 = objeto;
            }
            if (cont == 3){
                aux3 = objeto;
            }
        }
        System.out.println();
        if ((aux1 == aux2) && (aux2 == aux3)){
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        }
        if (((aux1 == aux2) && (aux1 !=aux3)) || ((aux1 == aux2) && (aux2 != aux3)) || ((aux1 == aux3) && (aux1 != aux2) || ((aux1 == aux3) && (aux3 != aux2)) || ((aux2 == aux3) && (aux2 != aux1)) || ((aux2 == aux3) && (aux3 != aux1)))){
            System.out.println("Bien, ha recuperado su moneda");
        }
        if ((aux1 != aux2) && (aux1 != aux3) && (aux2 != aux3)){
            System.out.println("Lo siento, ha perdido");
        }
        sc.close();
    }
}