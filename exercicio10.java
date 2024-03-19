import java.util.Scanner; 

public class exercicio10 {
    public static void main(String[] args) {
        
        int horas;
        double custo;
        String destino;
        String preferencia;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Favor, digite sem acentuação e a primeira letra maiúscula.");
        System.out.print("Para onde deseja ir: ");
        destino = ler.nextLine();

            if ( !destino.equals("Paris") && !destino.equals("Nova York") && !destino.equals("Toquio")){
                System.out.println("O destino "+destino+" não está disponível no momento.");
            }
        
        System.out.println("\n"+"Favor, digite sem acentuação e a primeira letra maiúscula.");
        System.out.print("Qual é a sua preferencia entre Rapida, Barata e Menos escalas? ");
        preferencia = ler.nextLine();
        
            if (!preferencia.equals("Rápida") && !preferencia.equals("Barata") && !preferencia.equals("Menos escala")) { 
                System.out.println("A preferência "+preferencia+" não está disponível.");
            }
        
        ler.close();
        
        if (destino.equals("Paris") && preferencia.equals("Rapida")) {
            horas = 7;
            custo = 900.00;
            System.out.print("Rota escolhida: Duração "+horas+"h - Custo R$ "+custo+" - 1 escala");
        } else if (destino.equals("Paris") && preferencia.equals("Barata")) {
            horas = 12;
            custo = 750.00;
            System.out.print("Rota escolhida: Duração "+horas+"h - Custo R$ "+custo+" - 2 escala");
        } else if (destino.equals("Paris") && preferencia.equals("Menos escalas")) {
            horas = 10;
            custo = 850.00;
            System.out.print("Rota escolhida: Duração "+horas+"h - Custo R$ "+custo+" - 1 escala");
        }

        if (destino.equals("Nova York") && preferencia.equals("Rapida")) {
            horas = 15;
            custo = 650.00;
            System.out.print("Rota escolhida: Duração "+horas+" h - Custo R$ "+custo+" - 3 escala");
        } else if (destino.equals("Nova York") && preferencia.equals("Barata")) {
            horas = 20;
            custo = 500.00;
            System.out.print("Rota escolhida: Duração "+horas+" - Custo R$ "+custo+" 4 escala");
        } else if (destino.equals("Nova York") && preferencia.equals("Menos escalas")) {
            horas = 18;
            custo = 550.00;
            System.out.print("Rota escolhida: Duração "+horas+" h - Custo R$ "+custo+" - 3 escala");
        }

        if (destino.equals("Toquio") && preferencia.equals("Rapida")) {
            horas = 20;
            custo = 1200.00;
            System.out.print("Rota escolhida: Duração "+horas+" h - Custo R$ "+custo+" - Direto");
        
        } else if (destino.equals("Toquio") && preferencia.equals("Barata")) {
            horas = 25;
            custo = 1000.00;
            System.out.print("Rota escolhida: Duração "+horas+" h - Custo R$ "+custo+" - 1 escala");
       
        } else if (destino.equals("Toquio") && preferencia.equals("Menos escalas")) {
            horas = 22;
            custo = 1100.00;
            System.out.print("Rota escolhida: Duração "+horas+" h - Custo R$ "+custo+" - 1 escala");
        }
            
        
    }
 }

//Você deve considerar as seguintes rotas:
//‘Paris’: 7h, R$ 900,00, 1 escala (Rápida) - 12h, R$ 750,00, 2 escalas (Barata) - 10h, R$ 850,00, 1 escala (Menos Escalas) 
//‘Nova York’: 15h, R$ 650,00, 3 escalas (Rápida) - 20h, R$ 500,00, 4 escalas (Barata) - 18h, R$ 550,00, 3 escalas (Menos Escalas) 
//‘Tóquio’: 20h, R$ 1200,00, Direto (Rápida) - 25h, R$ 1000,00, 1 escala (Barata) - 22h, R$ 1100,00, 1 escala (Menos Escalas)

