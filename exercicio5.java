import java.util.Scanner;

public class exercicio5 {   
    public static void main(String[] args) {
        
        double lado1;
        double lado2;
        double lado3;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a primeira medida: ");
        lado1 = ler.nextDouble();
        System.out.print("Digite a segunda medida: ");
        lado2 = ler.nextDouble();
        System.out.print("Digite a terceira medida: ");
        lado3 = ler.nextDouble();

        ler.close();

        if (lado1==lado2 && lado2==lado3){
            System.out.println("Triangulo Equilatero");
        }
        if (lado1==lado2 && lado2!=lado3){
            System.out.print("Triangulo Isoceles");
        }
        if (lado1==lado3 && lado1!=lado2){
                System.out.print("Triangulo Isoceles");
        } 
        if (lado2==lado3 && lado1!=lado2){
            System.out.print("Triangulo Isoceles");
        }
        if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3){
            System.out.print("Triangulo Escaleno");
         }
            
    }


 }