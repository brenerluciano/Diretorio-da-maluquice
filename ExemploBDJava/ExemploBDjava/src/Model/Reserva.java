package Model;

/**
 * Representa uma reserva no sistema de reservas.
 * Uma reserva contém informações sobre a pessoa, origem, destino e data da viagem.
 */
public class Reserva {
    private static int proximoId = 1;

    private int id;
    private Pessoa pessoa;
    private String origem;
    private String destino;
    private String dataViagem;

    /**
     * Construtor da classe Reserva.
     *
     * @param pessoa     a pessoa que fez a reserva.
     * @param origem     a origem da viagem.
     * @param destino    o destino da viagem.
     * @param dataViagem a data da viagem.
     */
    public Reserva(Pessoa pessoa, String origem, String destino, String dataViagem) {
        this.id = proximoId++;
        this.pessoa = pessoa;
        this.origem = origem;
        this.destino = destino;
        this.dataViagem = dataViagem;
    }

    /**
     * Obtém o identificador único da reserva.
     *
     * @return o identificador da reserva.
     */
    public int getId() {
        return id;
    }

    /**
     * Define um novo identificador para a reserva.
     *
     * @param id o novo identificador da reserva.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém a pessoa que fez a reserva.
     *
     * @return a pessoa que fez a reserva.
     */
    public Pessoa getCliente() {
        return pessoa;
    }

    /**
     * Define uma nova pessoa para a reserva.
     *
     * @param pessoa a nova pessoa que fez a reserva.
     */
    public void setCliente(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * Obtém a origem da viagem.
     *
     * @return a origem da viagem.
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Define uma nova origem para a viagem.
     *
     * @param origem a nova origem da viagem.
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * Obtém o destino da viagem.
     *
     * @return o destino da viagem.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define um novo destino para a viagem.
     *
     * @param destino o novo destino da viagem.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtém a data da viagem.
     *
     * @return a data da viagem.
     */
    public String getDataViagem() {
        return dataViagem;
    }

    /**
     * Define uma nova data para a viagem.
     *
     * @param dataViagem a nova data da viagem.
     */
    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }

    /**
     * Retorna uma representação em string dos dados da reserva.
     *
     * @return uma string contendo o id, origem, destino e data da viagem da reserva.
     */
    @Override
    public String toString() {
        System.out.print("\nReserva:  ");
        return "\nId = " + id + "\nOrigem: " + origem + "\nDestino: " + destino + "\nData de viagem: " + dataViagem;
    }
}