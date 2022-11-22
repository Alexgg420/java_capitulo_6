import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numcolor = 0;
        String color = "";
        String color1 = "";
        String color2 = "";
        String color3 = "";
        for (int i = 1; i <= 3; i++){
            numcolor = (int)(Math.random() * 6) + 1;
            switch (numcolor){
                case 1:
                color = "rojo";
                break;

                case 2:
                color = "azul";
                break;

                case 3:
                color = "verde";
                break;

                case 4:
                color = "amarillo";
                break;

                case 5:
                color = "violeta";
                break;

                case 6:
                color = "naranja";
                break;

                default:
            }
        }
        color1 = color;
        System.out.println("La habitación 1 se pintará de "+color1);
        color2 = color;
        if (color2 == color1){
            while (color2 == color1){
                numcolor = (int)(Math.random() * 6) + 1;
                switch (numcolor){
                    case 1:
                    color = "rojo";
                    break;
    
                    case 2:
                    color = "azul";
                    break;
    
                    case 3:
                    color = "verde";
                    break;
    
                    case 4:
                    color = "amarillo";
                    break;
    
                    case 5:
                    color = "violeta";
                    break;
    
                    case 6:
                    color = "naranja";
                    break;
    
                    default:
                }
                color2 = color;
            }
        }
        System.out.println("La habitación 2 se pintará de "+color2);
        color3 = color;
        if ((color3 == color1) || (color3 == color2)){
            while ((color3 == color1) || (color3 == color2)){
                numcolor = (int)(Math.random() * 6) + 1;
                switch (numcolor){
                    case 1:
                    color = "rojo";
                    break;
    
                    case 2:
                    color = "azul";
                    break;
    
                    case 3:
                    color = "verde";
                    break;
    
                    case 4:
                    color = "amarillo";
                    break;
    
                    case 5:
                    color = "violeta";
                    break;
    
                    case 6:
                    color = "naranja";
                    break;
    
                    default:
                }
                color3 = color;
            }
        }
        System.out.println("La habitación 3 se pintará de "+color3);
        sc.close();
    }
}