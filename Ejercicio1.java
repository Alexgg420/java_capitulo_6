import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tirada del primer dado: ");
        int dado1 = (int)(Math.random() * 6 + 1);
        switch(dado1){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 5:
                System.out.println("5");
                break;

            case 6:
                System.out.println("6");
                break;
            default:
        }
        System.out.print("Tirada del segundo dado: ");
        int dado2 = (int)(Math.random() * 6 + 1);
        switch(dado2){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 5:
                System.out.println("5");
                break;

            case 6:
                System.out.println("6");
                break;
            default:
        }
        System.out.print("Tirada del tercer dado: ");
        int dado3 = (int)(Math.random() * 6 + 1);
        switch(dado3){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 5:
                System.out.println("5");
                break;

            case 6:
                System.out.println("6");
                break;
            default:
        }
        System.out.printf("La suma de los tres dados es: %d", dado1 + dado2 + dado3);
        sc.close();
    }
}