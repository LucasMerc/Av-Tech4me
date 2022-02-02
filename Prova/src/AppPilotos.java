
import java.io.IOException;
import java.util.Scanner;


import aplicativos.Piloto;
import aplicativos.Pessoa;



public class AppPilotos {
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 1;
        int opcao, qtdCadastrados = 0;
        Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);
        Pessoa [] VetorT = new Pessoa[MAX_ELEMENTOS];
        int maxElementosNovos = MAX_ELEMENTOS;
    

        do {

            System.out.println("O valor atual do armazenamento do piloto é: " + MAX_ELEMENTOS);
            System.out.println("O valor atualizado do armazenamento é: " + maxElementosNovos);
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Aumentar espaço de armazenamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, caio fora
                if (qtdCadastrados == maxElementosNovos) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(in);
                    continue;
                }  

                //Cadastre seu piloto aqui

                System.out.println("Digite o nome do Piloto: " );
                String nome = in.nextLine();

                System.out.print("Digite o CPF do Piloto: " );
                String cpf = in.nextLine();

                System.out.println("Digite a matricula do Piloto: ");
                String matricula = in.nextLine();

                System.out.println("Digite o breve do Piloto: "); 
                String breve = in.nextLine();

                Pessoa piloto = new Piloto(); 
                piloto.setNome(nome); 
                piloto.setCpf(cpf);
                piloto.getPilotoab().setMatricula(matricula);
                piloto.getPilotoab().setBreve(breve); 
                pilotos[qtdCadastrados] = piloto; 
                qtdCadastrados++;
                voltarMenu(in);

                System.out.println("\nPiloto cadastrado com sucesso.");
                voltarMenu(in);
                
            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há motoristas cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }
                
                // Exiba os pilotos aqui
                for (int i = 0; i < qtdCadastrados; ++i) {
                    System.out.printf("\nA quantidade de pilotos cadastrada é de: %s\n", qtdCadastrados);
                    System.out.printf("----------------------------------------------\n");
                    System.out.printf("Piloto cadastrado: %s\n", pilotos[i].getNome());
                }
                voltarMenu(in);
            
                

                }if (opcao == 3) {
                    int aprovar = 1;
                    int achar = 0;
    
                    System.out.println("\nDigite o CPF: ");
                    String cpf1 = in.nextLine();
    
                    for(int i = 0; i < qtdCadastrados; i++)
                    {
                        if(pilotos[i].getCpf().equals(cpf1))
                        {
                            aprovar = 2;
                            achar = i;
                            i = qtdCadastrados;
                        }
                    }
                    if(aprovar == 2)
                    {
                        System.out.println("\nO piloto : " + pilotos[achar].getNome() + " Foi localizado pelo CPF: " 
                        + pilotos[achar].getCpf());
                    }else
                    {
                        System.out.println("CPF NÃO INFORMADO");
                    }
                    voltarMenu(in);



            } else if (opcao == 4) {
                System.out.println("Digite o tamanho novo de armazenamento: ");
                int valorDigitado = in.nextInt();

                maxElementosNovos = valorDigitado;

                VetorT = new Pessoa[maxElementosNovos];
                for (int i = 0; i < pilotos.length; i++) {    // Armazena a quantidade de armazenamento em uma variavel temporaria
                    VetorT[i] = pilotos[i];                         
                }

                pilotos = new Pessoa[maxElementosNovos];
                for (int i = 0; i < VetorT.length; i++) {     // Utiliza a quantidade armazenada pela variavel anterior
                    pilotos[i] = VetorT[i];

            
                }
                 
             
             } else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
             }  

        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}