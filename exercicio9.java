import java.util.Scanner;

public class exercicio9 {   
    public static void main(String[] args) {
        
        double bonus=0;
        double salario;
        int anos;
        char classificacao;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite aqui seu salário atual: R$ ");
        salario = ler.nextDouble();

        System.out.print("Digite aqui sua classificação na empresa: ");
        classificacao = ler.next().charAt(0);

        System.out.print("Digite aqui quantos anos você trabalha na empresa: ");
        anos = ler.nextInt();

        ler.close();

        if (classificacao == 'A') {
            bonus = salario*0.20; 
            if (anos > 5) {
                bonus += salario*0.05;
            } System.out.print("O seu bônus é de: "+bonus+"."); 
        } else if (classificacao == 'B') {
            bonus = salario*0.15;
            if (anos > 5) {
                bonus += salario*0.05;
            } System.out.print("O seu bônus é de: "+bonus+"."); 
        } else if (classificacao == 'C') {
            bonus = salario*0.10;
            if (anos > 5) {
                bonus += salario*0.05;
            } System.out.print("O seu bônus é de: "+bonus+".");
        } else if (classificacao == 'D') {
            bonus = salario*0.05;
            if (anos > 5) {
                bonus += salario*0.05;
            } System.out.print("O seu bônus é de: "+bonus+".");
        } else if (classificacao == 'E') {
            bonus = salario*0.02;
            if (anos > 5) {
                bonus += salario*0.05;
                System.out.print("O seu bônus é de: "+bonus+".");
            } System.out.print("O seu bônus é de: "+bonus+".");
        } else {
            bonus=0;
            if (anos > 5){
                bonus = salario*0.05;
            } System.out.print("O seu bônus é de: "+bonus+".");

        }
    }
}