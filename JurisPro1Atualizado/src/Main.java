import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Advogado> advogados = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Testemunha> testemunhas = new ArrayList<>();

        System.out.println("Qual o nome do advogado? ");
        String nome_adv = sc.nextLine();
        System.out.println("Telefone do advogado: ");
        String telefone_adv = sc.nextLine();
        System.out.println("Email do advogado: ");
        String email_adv = sc.nextLine();
        System.out.println("Cidade do advogado: ");
        String cidade_adv = sc.nextLine();
        System.out.println("Cnpj do advogado: ");
        int cnpj_adv = sc.nextInt();
        System.out.println("OAB do advogado: ");
        int oab_adv = sc.nextInt();
        sc.nextLine();
        System.out.println("Área do advogado: ");
        String area_adv = sc.nextLine();

        // Criar uma instância de Advogado
        Advogado advogado = new Advogado(nome_adv, telefone_adv, email_adv, cidade_adv, cnpj_adv, oab_adv, area_adv);
        advogados.add(advogado);

        //Loop para adicionar advogado
        while (true) {
            System.out.println("Digite 1 para adicionar um novo advogado, qualquer outro número para sair: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            if (opcao != 1) {
                break;
            }

            System.out.println("Qual o nome do advogado? ");
            String nome_adv1 = sc.nextLine();
            System.out.println("Telefone do advogado: ");
            String telefone_adv1 = sc.nextLine();
            System.out.println("Email do advogado: ");
            String email_adv1 = sc.nextLine();
            System.out.println("Cidade do advogado: ");
            String cidade_adv1 = sc.nextLine();
            System.out.println("Cnpj do advogado: ");
            int cnpj_adv1 = sc.nextInt();
            System.out.println("OAB do advogado: ");
            int oab_adv1 = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente
            System.out.println("Área do advogado: ");
            String area_adv1 = sc.nextLine();

            // Criar uma instância de Advogado
            Advogado advogado1 = new Advogado(nome_adv1, telefone_adv1, email_adv1, cidade_adv1, cnpj_adv1, oab_adv1, area_adv1);
            advogados.add(advogado1);
        }


        System.out.println("Qual o nome do cliente? ");
        String nome_cliente = sc.nextLine();
        System.out.println("Telefone do cliente: ");
        String telefone_cliente = sc.nextLine();
        System.out.println("Email do cliente: ");
        String email_cliente = sc.nextLine();
        System.out.println("Cidade do cliente: ");
        String cidade_cliente = sc.nextLine();
        System.out.println("CPF do cliente: ");
        int cpf_cliente = sc.nextInt();
        System.out.println("Ano de nascimento do cliente: ");
        int ano_nascimento_cliente = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha pendente
        System.out.println("Profissão do cliente: ");
        String profissao_cliente = sc.nextLine();

        // Criando uma instância de Cliente
        Cliente cliente = new Cliente(nome_cliente, telefone_cliente, email_cliente, cidade_cliente, cpf_cliente, ano_nascimento_cliente, profissao_cliente);
        clientes.add(cliente);

        // Chamar o método adicionarCliente
        advogado.adicionarCliente(cliente);


        //Loop para adicionar cliente
        while (true) {
            System.out.println("Digite 1 para adicionar um novo cliente, qualquer outro número para sair: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            if (opcao != 1) {
                break;
            }

            System.out.println("Qual o nome do segundo cliente? ");
            String nome_cliente1 = sc.nextLine();
            System.out.println("Telefone do segundo cliente: ");
            String telefone_cliente1 = sc.nextLine();
            System.out.println("Email do segundo cliente: ");
            String email_cliente1 = sc.nextLine();
            System.out.println("Cidade do segundo cliente: ");
            String cidade_cliente1 = sc.nextLine();
            System.out.println("CPF do segundo cliente: ");
            int cpf_cliente1 = sc.nextInt();
            System.out.println("Ano de nascimento do segundo cliente: ");
            int ano_nascimento_cliente1 = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente
            System.out.println("Profissão do segundo cliente: ");
            String profissao_cliente1 = sc.nextLine();

            // Criar uma instância do segundo Cliente
            Cliente cliente1 = new Cliente(nome_cliente1, telefone_cliente1, email_cliente1, cidade_cliente1, cpf_cliente1, ano_nascimento_cliente1, profissao_cliente1);
            clientes.add(cliente1);
        }


        // Adicionando uma nova testemunha

        System.out.println("Qual o nome da testemunha? ");
        String nome_testemunha = sc.nextLine();
        System.out.println("Telefone da testemunha: ");
        String telefone_testemunha = sc.nextLine();
        System.out.println("Email da testemunha: ");
        String email_testemunha = sc.nextLine();
        System.out.println("Cidade da testemunha: ");
        String cidade_testemunha = sc.nextLine();
        System.out.println("Descrição do que a testemunha viu: ");
        String descricao_testemunha = sc.nextLine();
        System.out.println("A testemunha está disposta a testemunhar? (true/false) ");
        boolean disposta_testemunhar = sc.nextBoolean();

        // Criar uma instância de Testemunha
        Testemunha testemunha = new Testemunha(nome_testemunha, telefone_testemunha, email_testemunha, cidade_testemunha, descricao_testemunha, disposta_testemunhar);
        testemunhas.add(testemunha);


        //Loop para adicionar testemunha
        while (true) {
            System.out.println("Digite 1 para adicionar uma nova testemunha, qualquer outro número para sair: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            if (opcao != 1) {
                break;
            }

            System.out.println("Qual o nome da testemunha? ");
            String nome_testemunha1 = sc.nextLine();
            System.out.println("Telefone da testemunha: ");
            String telefone_testemunha1 = sc.nextLine();
            System.out.println("Email da testemunha: ");
            String email_testemunha1 = sc.nextLine();
            System.out.println("Cidade da testemunha: ");
            String cidade_testemunha1 = sc.nextLine();
            System.out.println("Descrição do que a testemunha viu: ");
            String descricao_testemunha1= sc.nextLine();
            System.out.println("A testemunha está disposta a testemunhar? (true/false) ");
            boolean disposta_testemunhar1 = sc.nextBoolean();

            // Criar uma instância de Testemunha
            Testemunha testemunha1 = new Testemunha(nome_testemunha1, telefone_testemunha1, email_testemunha1, cidade_testemunha1, descricao_testemunha1, disposta_testemunhar1);
            testemunhas.add(testemunha1);
        }

        // Adicionando um novo processo
        System.out.println("Número do processo: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha pendente

        System.out.println("Titulo do processo: ");
        String titulo = sc.nextLine();

        System.out.println("tipo do processo: ");
        String tipo = sc.nextLine();

        System.out.println("Data de início do processo (formato dd/MM/yyyy): ");
        String dataInicioStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataInicioStr, formatter);

        System.out.println("Status do processo: ");
        String status = sc.nextLine();

        System.out.println("Partes envolvidas: ");
        String nomeJuiz = sc.nextLine();

        System.out.println("Data de julgamento (formato dd/MM/yyyy): ");
        String dataJulgamentoStr = sc.nextLine();
        LocalDate dataJulgamento = LocalDate.parse(dataJulgamentoStr, formatter);

        // Criar uma instância de Processo
        Processo processo = new Processo(numero, titulo, tipo, data, status, nomeJuiz, dataJulgamento, advogado, cliente, testemunha);


        int opcao;

        while (true) {
            System.out.println("Escolha uma opção de 1 a 5:");
            System.out.println("1 - Mudar profissão do cliente");
            System.out.println("2 - Exibir informações do cliente");
            System.out.println("3 - Exibir informações do advogado");
            System.out.println("4 - Exibir informações da testemunha");
            System.out.println("5 - Exibir informações do processo");
            System.out.println("6 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual a profissão do cliente: ");
                    cliente.mudarProfissao(sc.nextLine());
                    break;
                case 2:
                    System.out.println(cliente.obterInfo());
                    break;
                case 3:
                    System.out.println(advogado.obterInfo());
                    break;
                case 4:
                    System.out.println(testemunha.obterInfo());
                    break;
                case 5:
                    System.out.println(processo.obterInfo());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


