package loop;

import java.util.Scanner;


public class TesteLoop {
    
    
    public static int Menu() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n--------------------------- Bem vindo ao Loop! --------------------------- ");
        System.out.println("1. Minha Conta");
        System.out.println("2. Biblioteca");
        System.out.println("3. Loja");
        System.out.println("4. Versao do software");
        System.out.println("0. Sair");
        System.out.printf("\nNavegue: %n");
        return scanner.nextInt();
    }

    
    
    public static void main(String[] args) {
        
        int op = 0;
        Usuario user = new Usuario();
        Scanner scanner = new Scanner(System.in);
        
        Jogo loja = new Jogo();
        Jogo jogo1 = new Jogo("Elden ring", "12/03/21");
        Jogo jogo2 = new Jogo("Cyberpunk 2077", "12/03/21");
        Jogo jogo3 = new Jogo("Call of Duty", "12/03/21");
        Jogo jogo4 = new Jogo("Sniper Elite", "12/03/21");
        Jogo jogo5 = new Jogo("Sky Lines", "12/03/21");
        Jogo jogo6 = new Jogo("Spider Man", "12/03/21");
        
        
        
        user.setNome("Angel Romero");
        user.setCodigoU((int) (Math.random() * 900000) + 100000);
        user.setCpf("103.454.345-32");
        user.setEmail("dimitrivasco@gmail.com");
        user.setSenha("aquievascoporra");
        user.setTelefone(99999999);
        user.setSaldo(200);
        user.setEndereco("CT VASCO DA GAMA");
        
        user.adicionarJogo(jogo1);
        user.adicionarJogo(jogo2);
        user.adicionarJogo(jogo3);
        
        loja.cadastroJogo(jogo4);
        loja.cadastroJogo(jogo5);
        loja.cadastroJogo(jogo6);
        
        
         
        do{
            
            op = Menu();
            
     switch(op){
                
         case 1 -> user.dadosConta();
         
         case 2 -> {
             System.out.println("Biblioteca de " + user.getNome() + ":");
             for (Jogo jogo : user.getBiblioteca()) {
                 System.out.println("- " + jogo.getNomeJogo() + " (" + jogo.getDataLancamento() + ")");
             }
         }
          
         case 3 -> {
             System.out.println(" --------------- Loja Loop ---------------");
             System.out.println("\n---- Confira as nossas ofertas do dia! ----");
             System.out.println("\n");
             for (Jogo jogo : loja.getLoja()) {
                 System.out.println("- " + jogo.getNomeJogo() + " (" + jogo.getDataLancamento() + ")");
             }
         }
         
         case 4 -> {
             System.out.println("Versao 1.0");
             System.out.println("Desenvolvedores: Joao Henrique e Enrique Rocha");
             System.out.printf("Copyright Todos os direitos reservados Loop LTDA", "UTF-8");    
                }
         }
            
            
            scanner.nextLine();
            
            
        }while(op!=0);

        
        
    }
    
}
