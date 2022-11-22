import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String moneda = "";
        String pos = "";
        for (int i = 0; i < 5; i++){
            int opt = (int)(Math.random() * 8) + 1;
            switch (opt){
                case 1:
                moneda = "1 céntimo";
                break;

                case 2:
                moneda = "2 céntimos";
                break;

                case 3:
                moneda = "5 céntimos";
                break;

                case 4:
                moneda = "10 céntimos";
                break;

                case 5:
                moneda = "20 céntimos";
                break;

                case 6:
                moneda = "50 céntimos";
                break;

                case 7:
                moneda = "1 euro";
                break;

                case 8:
                moneda = "2 euros";
                break;

                default:
            }
            int prob = (int)(Math.random() * 2) + 1;
            switch (prob){
                case 1:
                pos = "cara";
                break;

                case 2:
                pos = "cruz";
                break;

                default:
            }
            System.out.printf("%s - %s", moneda, pos);
            System.out.println();
        }
        sc.close();
    }
}