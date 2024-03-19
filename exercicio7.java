import java.util.Scanner;

public class exercicio7 {
  public static void main(String[] args) {

    double salario;
    double reajuste;
    double A=1.20;
    double B=1.15;
    double C=1.10;
    double bonus;
    String notafuncionario;
   
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print ("Digite o salário: R$ ");
      salario = keyboard.nextDouble();

      System.out.print ("Digite aqui qual sua nota de funcionario entre A, B e C: ");
      notafuncionario = keyboard.next();

      keyboard.close();
     
      if (notafuncionario.equals("A")) {
         reajuste = salario * A;
         bonus = reajuste - salario;
         System.out.print ("O bonus no salário é: " + bonus);
      }
      if (notafuncionario.equals("B")) {
         reajuste = salario * B;
         bonus = reajuste - salario;
         System.out.print ("O bonus no salário é: " + bonus);
      }
      if (notafuncionario.equals("C")) {
         reajuste = salario * C;
         bonus = reajuste - salario;
         System.out.print ("O bonus no salário é: " + bonus);
      }

      else if (notafuncionario != "A" && notafuncionario != "B" && notafuncionario != "C") {
        bonus = 0;
        System.out.print ("O bonus no salário é: " + bonus);
      }
   
      if (notafuncionario.equals("a")) {
         System.out.print("A nota de funcionario foi inserida de forma incorreta, por favor reinicie o programa e insira a nota com letra maiúscula.");
      }
      if (notafuncionario.equals("b")) {
         System.out.print("A nota de funcionario foi inserida de forma incorreta, por favor reinicie o programa e insira a nota com letra maiúscula.");
      }
      if (notafuncionario.equals("c")) {
       System.out.print("A nota de funcionario foi inserida de forma incorreta, por favor reinicie o programa e insira a nota com letra maiúscula.");
      }
     
  }
}