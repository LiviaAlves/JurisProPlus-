public class Main {
    public static void main(String[] args) {
        // Criar uma instância de Advogado
        Advogado advogado = new Advogado("Ximenes", "83999", "ximenes@gmail.com", "Brasília", 123456, 789, "administrativa");

        // Adicionando um novo cliente
        Cliente cliente = new Cliente("Livia", "998554", "livia@gmail.com", "Itaporanga", 1555, 2002, "estudante");
        Cliente cliente1 = new Cliente("Gabriel", "988209", "gabriel@gmail.com", "Patos", 1666, 2002, "Estudante");

        // Adicionando um novo advogado
        // Advogado advogado1 = new Advogado();

        // Adicionando uma nova testemunha

        Testemunha testemunha1 = new Testemunha("Ana", "83998649281", "ana@gmail.com", "Itaporanga", "Viu algo", true);

        // Adicionando um novo processo
        // Processo processo1 = new Processo(1525, "Acordo de pensão", "Petição inicial", 11/12/2002, "em análise", "Livia", 22/05/2024);

        // Chamar o método adicionarCliente
        advogado.adicionarCliente(cliente);

        // Exibindo as informações sobre o cliente chamando o método obterInfo()

        String informacoesCliente = cliente.obterInfo();
        System.out.println(informacoesCliente);
        String informacoesCliente1 = cliente1.obterInfo();
        System.out.println(informacoesCliente1);

        // Mudando o emprego

         cliente1.mudarProfissao("Desenvolvedor");

         // Mostrando na tela a mudança
         String informacoesCliente12 = cliente1.obterInfo();
         System.out.println(informacoesCliente12);

         // Exibindo as informações sobre as testemunhas
         String informacoesTestemunha = testemunha1.obterInfo();
         System.out.println(informacoesTestemunha);
    }
}
