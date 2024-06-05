package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um cliente no sistema de reservas.
 * Um cliente é uma pessoa que pode criar, visualizar e gerenciar suas reservas.
 */
public class Cliente extends Pessoa {
    private List<Reserva> reservas;

    /**
     * Construtor da classe Cliente.
     *
     * @param id     o identificador único do cliente.
     * @param nome   o nome do cliente.
     * @param cpf    o CPF do cliente.
     * @param email  o email do cliente.
     * @param senha  a senha do cliente.
     */
    public Cliente(int id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        this.reservas = new ArrayList<>();
    }

    /**
     * Exibe todas as reservas do cliente.
     * Se o cliente não tiver reservas, uma mensagem será exibida.
     */
    public void getReservas() {
        if (!reservas.isEmpty()) {
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        } else {
            System.out.println("Nenhuma reserva encontrada");
        }
    }

    /**
     * Adiciona uma nova reserva para o cliente.
     *
     * @param reserva a reserva a ser adicionada.
     */
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * Remove uma reserva existente do cliente.
     *
     * @param reserva a reserva a ser removida.
     */
    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
}