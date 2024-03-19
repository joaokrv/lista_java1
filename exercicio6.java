import java.util.Scanner;

public class exercicio6 {   
    public static void main(String[] args) {

        double kwh;
        double tarifa;
        double total;
        double valor;

        tarifa = 0.85;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite aqui o seu consumo de kWh: ");
        kwh = ler.nextDouble();

        ler.close();

        valor = kwh*tarifa;

        if (kwh<=100) {
            total=(valor*0.85);
            System.out.print("Valor da tarifa: R$"+total);
        }
        if (kwh >= 101 && kwh <=200) {
            total=valor*0.90;
            System.out.print("Valor da tarifa: R$"+total);
        } else 
        {
            total=kwh*tarifa; System.out.print("Valor da tarifa: R$:"+total);
        }
            

    }
}
//até 100 kWh aplica um desconto de 15%, de 101 a 200 kWh aplica um desconto de 10%, e acima de 200 kWh utiliza-se a tarifa cheia. O valor da tarifa é de R$ 0,85 por kWh. Ao final, o programa deve exibir o valor da tarifa a ser paga.