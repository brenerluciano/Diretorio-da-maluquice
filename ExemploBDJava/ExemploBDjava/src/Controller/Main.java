package Controller;

/**
 * Classe principal que contém o método main para iniciar o sistema de reservas.
 */
public class Main {
    /**
     * Método principal que inicia a execução do sistema de reservas.
     *
     * @param args os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        sistema.executar();
    }
}