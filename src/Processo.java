import java.util.Date;
import java.text.SimpleDateFormat;

public class Processo implements Informações {
    float numProcesso;
    String titulo;
    String tipo;
    Date inicio;
    String status;
    String partesEnvolvidas;
    Date prazo;

    // MÉTODO CONSTRUTOR


    public Processo(float numProcesso, String titulo, String tipo, Date inicio, String status, String partesEnvolvidas, Date prazo, Advogado advogadoTitular, Cliente cliente, Testemunha testemunha) {
        this.numProcesso = numProcesso;
        this.titulo = titulo;
        this.tipo = tipo;
        this.inicio = inicio;
        this.status = status;
        this.partesEnvolvidas = partesEnvolvidas;
        this.prazo = prazo;
        this.advogadoTitular = advogadoTitular;
        this.cliente = cliente;
        this.testemunha = testemunha;
    }

    // ASSOCIAÇÕES
    private Advogado advogadoTitular;
    private Cliente cliente;
    private Testemunha testemunha;


    public Advogado getAdvogadoTitular() {
        return advogadoTitular;
    }

    public void setAdvogadoTitular(Advogado advogadoTitular) {
        this.advogadoTitular = advogadoTitular;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Testemunha getTestemunha() {
        return testemunha;
    }

    public void setTestemunha(Testemunha testemunha) {
        this.testemunha = testemunha;
    }


    // GETTER´S AND SETTER'S
    public float getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(float numProcesso) {
        this.numProcesso = numProcesso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPartesEnvolvidas() {
        return partesEnvolvidas;
    }

    public void setPartesEnvolvidas(String partesEnvolvidas) {
        this.partesEnvolvidas = partesEnvolvidas;
    }

    public Date getPrazo() {
        return prazo;
    }
    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

     public void atualizarStatus(String novoStatus) {
        setStatus(novoStatus);
    }

    // MÉTODO PARA OBTER AS INFORMAÇÕES SOBRE OS PROCESSOS

    @Override
    public String obterInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "Informações do Processo:\n" +
                "Número do Processo: " + numProcesso + "\n" +
                "Título: " + titulo + "\n" +
                "Tipo: " + tipo + "\n" +
                "Início: " + dateFormat.format(inicio) + "\n" +
                "Status: " + status + "\n" +
                "Partes Envolvidas: " + partesEnvolvidas + "\n" +
                "Prazo: " + dateFormat.format(prazo);
    }
}
