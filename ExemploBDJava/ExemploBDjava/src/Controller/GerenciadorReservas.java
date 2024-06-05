package Controller;

import Model.Cliente;
import Model.Reserva;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar reservas de clientes.
 */
public class GerenciadorReservas {
    private List<Reserva> reservas;
    private static int proximoId = 1;

    /**
     * Gera um novo ID para uma nova reserva.
     *
     * @return o próximo ID disponível.
     */
    private int gerarProximoId() {
        return proximoId++;
    }

    /**
     * Construtor da classe GerenciadorReservas.
     * Inicializa a lista de reservas.
     */
    public GerenciadorReservas() {
        this.reservas = new ArrayList<>();
    }

    /**
     * Obtém uma reserva pelo ID e cliente associado.
     *
     * @param cliente o cliente associado à reserva.
     * @param id o ID da reserva.
     * @return a reserva correspondente ao ID e cliente, ou null se não for encontrada.
     */
    public Reserva obterReservaPorId(Cliente cliente, int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id && reserva.getCliente().equals(cliente)) {
                return reserva;
            }
        }
        return null; // Reserva não encontrada
    }

    /**
     * Exibe todas as reservas de um determinado cliente.
     *
     * @param cliente o cliente cujas reservas serão exibidas.
     */
    public void visualizarReservasCliente(Cliente cliente) {
        if (!reservas.isEmpty()) {
            for (Reserva reserva : reservas) {
                if (reserva.getCliente().equals(cliente)) {
                    System.out.println(cliente);
                    System.out.println(reserva);
                }
            }
        } else {
            System.out.println("Não há reservas para esse cliente.");
        }
    }
}
