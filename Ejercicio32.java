import java.util.Scanner;
public class Ejercicio32{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud del camino: ");
        int h = sc.nextInt();
        int cantesp = h;
        String camino = "";
        int posibobs;
        // espacios iniciales
        String esp = " ";
        // longitud del camino
        for (int i = 0; i < h; i++){
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
            posibobs = (int)(Math.random() * 2) + 1;
            if (posibobs == 1){
                camino = "|    |";
            }
            else if (posibobs == 2){
                int obs = (int)(Math.random() * 2) + 1;
                String ob = "";
                if (obs == 1){
                    ob = "*";
                }
                else if (obs == 2){
                    ob = "O";
                }
                int posicobs = (int)(Math.random() * 4) + 1;
                switch(posicobs){
                    case 1:
                    camino = "|"+ob+"   |";
                    break;

                    case 2:
                    camino = "| "+ob+"  |";
                    break;

                    case 3:
                    camino = "|  "+ob+" |";
                    break;

                    case 4:
                    camino = "|   "+ob+"|";
                    break;

                    default:
                }
            }
            System.out.print(camino);
            System.out.println();
        }
        sc.close();
    }
}