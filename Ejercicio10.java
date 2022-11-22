import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        int car;
        String pos = "";
        for (int i = 1; i <= 10; i++){
            car = (int)(Math.random() * 6) + 1;
            switch (car) {
                case 1:
                pos = "*";
                break;

                case 2:
                pos = "-";
                break;

                case 3:
                pos = "=";
                break;

                case 4:
                pos = ".";
                break;

                case 5:
                pos = "|";
                break;

                case 6:
                pos = "@";
                break;

                default:
            }
            cant = (int)(Math.random() * 40) + 1;
            for (int j = 0; j < cant; j++){
                System.out.print(pos);
            }
            System.out.println();
        }
        sc.close();
    }
}