import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int num = 0;
        while (num != 24){
            num = (int)(Math.random() * 101);
            System.out.println(num);
            cont++;
        }
        if (num == 24){
            System.out.println("Se han generado "+cont+" números");
        }
        sc.close();
    }
}