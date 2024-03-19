import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        
        Calendar cal = GregorianCalendar.getInstance();
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);

        Scanner in = new Scanner(System.in);
        System.out.print("Dia em que você nasceu: ");
        int diaNasc = in.nextInt();
        
            if ((diaNasc<=0) && (diaNasc>31)) {
                System.out.print("Dia Invalido");
            }
     else {
                System.out.print("Mes em que você nasceu: ");
                int mesNasc = in.nextInt();
            if ((mesNasc<=0) && (mesNasc>12)) {
                System.out.println("Mes invalido");
            }
        else {
                System.out.print("Ano em que você nasceu: ");
                int anoNasc = in.nextInt();
                in.close();
            
        
            if ((anoNasc<=0) && (anoNasc>anoAtual)) {
                System.out.println("Ano Invalido");
            }
         else {
                int Nasc = anoNasc*365;
                    Nasc = Nasc+(mesNasc*31);
                    Nasc = Nasc+diaNasc;
                int Atual = anoAtual*365;
                    Atual = Atual+(mesAtual*31);
                    Atual = Atual+diaAtual;
            
                int idade = ((Atual-Nasc)/365);
       
            if (idade > 0 && idade <= 10){
            System.out.print("Você tem "+idade+" anos e está na categoria infantil.");
        
                } else if (idade >= 11 && idade <= 17) {
                    System.out.print("Você tem "+idade+" anos e está na categoria juvenil.");
            
                } else if (idade >= 18 && idade <= 58) {
                    System.out.print("O atleta tem "+idade+" anos e está na categoria adulto.");
           
                } else if (idade > 59) {
                    System.out.print("O atleta tem "+idade+" anos e está na categoria senior.");
                }
         }
        }
      }
    }  
}