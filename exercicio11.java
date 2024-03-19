import java.util.Scanner; 

public class exercicio11 {
    public static void main(String[] args) {

        String tipoAssento;
        String tipoPreferencia;
        double valorNormal=0, valorExtra, valorEspaçoExtra;

        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva o assento desejado entre Janela, Meio ou Corredor: ");
        tipoAssento = ler.nextLine();

            if(!tipoAssento.equals("Janela") && !tipoAssento.equals("Meio") && !tipoAssento.equals("Corredor")){
                System.out.print("A opção "+tipoAssento+" está indisponível."+"\n");
            }
        

        System.out.print("Possuimos dois tipos de assento, normal ou com espaço extra para ter mais conforto se vai preferir Normal ou Espaco extra: ");
        tipoPreferencia = ler.nextLine();
            
            if(!tipoPreferencia.equals("Espaco extra")&& !tipoPreferencia.equals("Normal")){
                System.out.print("A opção "+tipoPreferencia+" está indisponível.");
            }
        ler.close();

        valorExtra = 50.0;

        if (tipoAssento.equals("Janela") && tipoPreferencia.equals("Normal")){
            valorNormal = 300.00;
            System.out.print("Assento escolhido: "+tipoAssento+" - "+tipoPreferencia+" - Custo R$ "+valorNormal);
        }
        if (tipoAssento.equals("Janela") && tipoPreferencia.equals("Espaco extra")){
            valorNormal = 300.00;
            valorEspaçoExtra=valorNormal+valorExtra;
            System.out.print("Assento escolhido: "+tipoAssento+" - "+tipoPreferencia+" - Custo R$ "+valorEspaçoExtra);
        } 

        if (tipoAssento.equals("Corredor") && tipoPreferencia.equals("Normal")){
            valorNormal = 280.00;
            System.out.print("Assento escolhido: "+tipoAssento+" - "+tipoPreferencia+" - Custo R$ "+valorNormal);
        }
        if (tipoAssento.equals("Corredor") && tipoPreferencia.equals("Espaco extra")){
            valorNormal = 280.00;
            valorEspaçoExtra=valorNormal+valorExtra;
            System.out.print("Assento escolhido: "+tipoAssento+" - "+tipoPreferencia+" - Custo R$ "+valorEspaçoExtra);
        } 

        if (tipoAssento.equals("Meio") && tipoPreferencia.equals("Normal")){
            valorNormal = 250.00;
            System.out.print("Assento escolhido: "+tipoAssento+" - "+tipoPreferencia+" - Custo R$ "+valorNormal);
        }
        if (tipoAssento.equals("Meio") && tipoPreferencia.equals("Espaco extra")){
            valorNormal = 250.00;
            valorEspaçoExtra=valorNormal+valorExtra;
            System.out.print("Assento escolhido: "+tipoAssento+" - "+tipoPreferencia+" - Custo R$ "+valorEspaçoExtra);
        }
    }
}
// Janela: Normal (R$ 300,00) - Espaço Extra (R$ 350,00) 
// Corredor: Normal (R$ 280,00) - Espaço Extra (R$ 330,00)
// Meio: Normal (R$ 250,00) - Espaço Extra (R$ 300,00)