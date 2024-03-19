import java.util.Scanner;

public class exercicio2 {
    public static void main(String args []){
       
        int numeroum;
        int numerodois;
        int numerotres;
        int maior;

            Scanner keyboard = new Scanner(System.in);
        
            System.out.print ("Digite aqui o primeiro número: ");
            numeroum = keyboard.nextInt();

            System.out.print ("Digite aqui o segundo número: ");
            numerodois = keyboard.nextInt();

            System.out.print ("Digite aqui o terceiro número: ");
            numerotres = keyboard.nextInt();

            keyboard.close();
        
            maior = numerotres;

            if (numeroum>maior)
            maior=numeroum;

            if (numerodois>maior)
            maior=numerodois;

        System.out.print ("O maior número é: "+maior);

        }
        
    }
