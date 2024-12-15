import java.util.Scanner;

public class Tareas {

    public static float sumar (float num1, float num2) {   
    
    float resultado;

    resultado = num1 + num2; 

    System.out.println(num1 + " + " + num2 + " = " + resultado);

    return resultado;
    
    }

    public static float restar (float num1, float num2) {   
    
        float resultado;
    
        resultado = num1 - num2;
        
        System.out.println(num1 + " - " + num2 + " = " + resultado);
    
        return resultado;
        
    }

    public static float multi (float num1, float num2) {   
    
        float resultado;
    
        resultado = num1 * num2; 

        System.out.println(num1 + " * " + num2 + " = " + resultado);
    
        return resultado;
        
    }

    public static float div (float num1, float num2) {   
    
        float resultado;
    
        resultado = num1 / num2; 

        System.out.println(num1 + " / " + num2 + " = " + resultado);
    
        return resultado;
        
    }


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int operacion;
        float num1, num2;

        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Salir del programa");
        System.out.println(" ");
        System.out.print("Selecione una opción: ");
        operacion = sc.nextInt();

        if (operacion < 5) {
            System.out.println(" ");
            System.out.print("Itroduce el primer numero: ");
            num1 = sc.nextFloat();
            System.out.print("Itroduce el segundo numero: ");
            num2 = sc.nextFloat();

            switch (operacion) {
                case 1:
                    sumar(num1, num2);
                    break;
    
                case 2:
                    restar(num1, num2);
                    break;
    
                case 3:
                    multi(num1, num2);
                    break;
    
                case 4:
                    div(num1, num2);
                    break;
            
                default:
                    break;
            }
        }
        sc.close();
    }
}