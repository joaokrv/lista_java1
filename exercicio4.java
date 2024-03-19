import java.util.Scanner;

    public class exercicio4 {
        public static void main(String[] args) {
            
            double nota1;
            double nota2;
            double nota3;
            double media;

            Scanner ler = new Scanner(System.in);

            System.out.print("Digite aqui sua primeira nota: ");
            nota1 = ler.nextDouble();
            System.out.print("Digite aqui sua segunda nota: ");
            nota2 = ler.nextDouble();
            System.out.print("Digite aqui sua terceira nota: ");
            nota3 = ler.nextDouble();

            media = (nota1+nota2+nota3)/ 3;

            ler.close();

            if (media>=7) {
                System.out.print("Aluno aprovado.");
            } else { 
                System.out.print("Aluno reprovado.");
        }
        }
        
    }