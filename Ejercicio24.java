import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        int numini = num;
        int cont = 0;
        while (num > 0){
            num = num / 10;
            cont++;
        }
        int pos = (int)(Math.random() * cont) + 1;
        System.out.print("El programa va a mostrar un dígito aleatorio del número anterior: ");
        if (cont == pos){
            System.out.print(numini % 10);
        }
        for (int i = 1; i <= (cont - pos); i++){
            numini = numini / 10;
            if (i == (cont - pos)){
                System.out.print(numini % 10);
            }
        }
        sc.close();
    }
}