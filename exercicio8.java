import java.util.Scanner;

public class exercicio8 {   
    public static void main(String[] args) {
        
        double bonus;
        double salario;
        char classificacao;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu salário atual: R$ ");
        salario = ler.nextDouble();
        System.out.print ("Digite a sua classificação entre A, B, C, D, E ou outra: ");
        classificacao = ler.next().charAt(0);  
        
        ler.close();

        switch (classificacao) {
            case 'A':
                bonus = salario*0.20;
                System.out.print("O seu bonus no mês foi de: R$"+bonus);
                break;
            case 'B':
                bonus = salario*0.15;
                System.out.print("O seu bonus no mês foi de: R$"+bonus);
                break;
            case 'C':
                bonus = salario*0.10;
                System.out.print("O seu bonus no mês foi de: R$"+bonus);
                break;
            case 'D':
                bonus = salario*0.05;
                System.out.print("O seu bonus no mês foi de: R$"+bonus);
                break;
            case 'E':
                bonus = salario*0.02;
                System.out.print("O seu bonus no mês foi de: R$"+bonus);
            default:
                bonus=0;
                System.out.print("O seu bonus no mês foi de: R$"+bonus);
                break;
        }
    }
}