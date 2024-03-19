import java.util.Scanner;

public class exercicio1 { // programa
    public static void main(String args []){ // funcao inicio

        Scanner keyboard = new Scanner(System.in); // entrada de informações

        int numeroum;
        int numerodois;

        System.out.print ("Digite aqui o primeiro número: "); // escreva
        numeroum = keyboard.nextInt(); // leia

        System.out.print ("Digite aqui o segundo número: ");
        numerodois = keyboard.nextInt();

        keyboard.close();

        if (numeroum>numerodois)  // se
            System.out.println("O maior número é: "+numeroum+".");
        if (numerodois>numeroum)   // senao
         System.out.println("O maior número é: "+numerodois+".");
        
    }
}