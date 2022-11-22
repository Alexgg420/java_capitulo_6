import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Selecciones la estación del año (1-4): ");
        int est = sc.nextInt();
        if (est < 1 || est > 4){
            System.out.print("Ha introducido un valor incorrecto");
        }
        else {
            int tmin = 45;
            int tmax = 0;
            int prob = (int)(Math.random() * 10) + 1;
            String tie = "";
            switch(est){
                case 1:
                tmin = (int)(Math.random() * (30 - 15 + 1) + 15);
                tmax = (int)(Math.random() * (30 - 15 + 1) + 15);
                if (prob <= 6){
                    tie = "Nublado";
                }
                if (prob > 6){
                    tie = "Soleado";
                }
                break;

                case 2:
                tmin = (int)(Math.random() * (45 - 25 + 1) + 25);
                tmax = (int)(Math.random() * (45 - 25 + 1) + 25);
                if (prob <= 8){
                    tie = "Nublado";
                }
                if (prob > 8){
                    tie = "Soleado";
                }
                break;

                case 3:
                tmin = (int)(Math.random() * (30 - 20 + 1) + 20);
                tmax = (int)(Math.random() * (30 - 20 + 1) + 20);
                if (prob <= 4){
                    tie = "Nublado";
                }
                if (prob > 4){
                    tie = "Soleado";
                }
                break;

                case 4:
                tmin = (int)(Math.random() * 26);
                tmax = (int)(Math.random() * 26);
                if (prob <= 2){
                    tie = "Nublado";
                }
                if (prob > 2){
                    tie = "Soleado";
                }
                break;

                default:
            }
            if (tmin > tmax){
                int aux = tmin;
                tmin = tmax;
                tmax  = aux;
            }
            System.out.println("Previsión del tiempo para mañana");
            System.out.println("--------------------------------");
            System.out.println("Temperatura mínima: "+tmin+"ºC");
            System.out.println("Tempreatura máxima: "+tmax+"ºC");
            System.out.println(tie);
        }
        sc.close();
    }
}