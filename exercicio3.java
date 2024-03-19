import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        String nomeproduto;
        double preco1; 
        double preco2;
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite aqui o nome do produto: ");
        nomeproduto = ler.nextLine();

        System.out.print("Digite aqui o preço no primeiro estabelecimento: ");
        preco1 = ler.nextDouble();

        System.out.print("Digite aqui o preço no segundo estabelcimento: ");
        preco2 = ler.nextDouble();
        
        ler.close();

        if (preco1<preco2) {
            System.out.print("O "+nomeproduto+" possui o menor preço no primeiro estabelecimento ");
        } else { 
            System.out.print("O "+nomeproduto+" possui o menor preço no segundo estabelecimento");
        }

        }
    }
