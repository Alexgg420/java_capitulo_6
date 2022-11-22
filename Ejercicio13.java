import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dado1;
        int dado2;
        do{
            dado1 = (int)(Math.random() * 6) + 1;
            System.out.print(dado1 + " & ");
            dado2 = (int)(Math.random() * 6) + 1;
            System.out.println(dado2);
        } while (dado1 != dado2);
        sc.close();
    }
}