import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Advogado extends Pessoa implements Informações{
    int cnpj;
    int oab;
    String area;

    // MÉTODO CONSTRUTOR

    public Advogado(String nome, String telefone, String email, String cidade, int cnpj, int oab, String area) {
        super(nome, telefone, email, cidade);
        this.cnpj = cnpj;
        this.oab = oab;
        this.area = area;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getOab() {
        return oab;
    }

    public void setOab(int oab) {
        this.oab = oab;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // INSTANCIANDO UM NOVO ARRAY LIST PARA ARMAZENAR OS CLIENTES
    private List<Cliente> clientes = new ArrayList<>();

    // INSTANCIANDO UM NOVO ARRAY LIST PARA ARMAZENAR AS TESTEMUNHAS
    private List<Testemunha> testemunhas = new ArrayList<>();

    // INSTANCIANDO UM NOVO ARRAY LIST PARA ARMAZENAR OS PROCESSOS E SER POSSÍVEL OBTER OS PRAZOS
    private List<Processo> processos = new ArrayList<>();

    // MÉTODO RESPONSÁVEL POR ADICIONAR UM NOVO PROCESSO
    public Processo NovoProcesso(float numProcesso, String titulo, String tipo, Date inicio, String status, String partesEnvolvidas, Date prazo) {

        // Um método de instancia é necessário quando o método depende de uma instância específica, portanto
        // ... não pode ser estático.
        // Criar uma instância de Processo usando o construtor apropriado

        Processo novoProcesso = new Processo(numProcesso, titulo, tipo, inicio, status, partesEnvolvidas, prazo, this, null, null);
        return novoProcesso;
    }

    // MÉTODO RESPONSÁVEL POR ADICIONAR UM NOVO CLIENTE

    // Método para adicionar um novo cliente
    public void adicionarCliente(Cliente novoCliente) {
        clientes.add(novoCliente);
    }

    //  private List<Advogado> advogados = new ArrayList<>();
    //
    //    // Método para adicionar um novo advogado
    //    public void adicionarAdvogado(Advogado novoAdvogado) {
    //        advogados.add(novoAdvogado);
    //    }
    //
    //    // Método para imprimir informações de todos os advogados no escritório
    //    public void imprimirInformacoesAdvogados() {
    //        System.out.println("Advogados no Escritório:");
    //        for (Advogado advogado : advogados) {
    //            advogado.imprimirInformacoes();  // Chama o método que imprime as informações do advogado
    //            System.out.println("---------------");
    //        }
    //    }
    //
    //    private void imprimirInformacoes() {
    //
    //    } CASO A GENTE QUEIRA CRIAR UMA LISTA DE ADVOGADOS


    // MÉTODO PARA ADICIONAR UMA NOVA TESTEMUNHA
    public void adicionarTestemunha(Testemunha novaTestemunha) {
        testemunhas.add(novaTestemunha);
    }

    // MÉTODO RESPONSÁVEL POR LISTAR OS PRAZOS DOS PROCESSOS
    public List<Date> getPrazosDosProcessos() {
        List<Date> prazos = new ArrayList<>();
        for (Processo processo : processos) {
            prazos.add(processo.getPrazo());
        }
        return prazos;
    }

    // MÉTODO PARA OBTER AS INFORMAÇÕES SOBRE OS ADVOGADOS QUE VEIO DA INTERFACE
    @Override
    public String obterInfo() {
        // Implementação específica para obter informações sobre o advogado
        return "Informações do Advogado:\n" +
                "Nome: " + getNome() + "\n" +
                "CNPJ: " + getCnpj() + "\n" +
                "OAB: " + getOab() + "\n" +
                "Área: " + getArea() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Cidade: " + getCidade();
    }
}
