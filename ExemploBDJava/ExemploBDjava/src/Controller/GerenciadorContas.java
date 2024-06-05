package Controller;

import Model.Administrador;
import Model.Cliente;
import Model.Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar contas de clientes e administradores.
 */
public class GerenciadorContas {
    private List<Cliente> clientes;
    private List<Administrador> administradores;
    private static int proximoId = 1;

    /**
     * Construtor da classe GerenciadorContas.
     * Inicializa as listas de clientes e administradores e adiciona um administrador padrão.
     */
    public GerenciadorContas() {
        this.clientes = new ArrayList<>();
        this.administradores = new ArrayList<>();
        // Adicionar conta de administrador pré-existente
        adicionarAdministradorPadrao("adm", "adm", "ADM001");
    }

    /**
     * Gera um novo ID para uma nova conta.
     *
     * @return o próximo ID disponível.
     */
    public int gerarProximoId() {
        return proximoId++;
    }

    /**
     * Método para adicionar um administrador pré-existente.
     *
     * @param email    o email do administrador.
     * @param senha    a senha do administrador.
     * @param matricula a matrícula do administrador.
     */
    private void adicionarAdministradorPadrao(String email, String senha, String matricula) {
        Administrador administrador = new Administrador(proximoId++, "Administrador", "", email, senha, matricula);
        administradores.add(administrador);
    }

    /**
     * Adiciona um novo cliente à lista de clientes.
     *
     * @param novoCliente o novo cliente a ser adicionado.
     */
    public void adicionarCliente(Cliente novoCliente) {
        clientes.add(novoCliente);
    }

    /**
     * Obtém um cliente pelo seu ID.
     *
     * @param id o ID do cliente a ser obtido.
     * @return o cliente com o ID especificado, ou null se não for encontrado.
     */
    public Cliente obterClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                System.out.println(cliente);
                return cliente;
            }
        }
        return null;
    }

    /**
     * Remove um cliente da lista de clientes.
     *
     * @param cliente o cliente a ser removido.
     */
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    /**
     * Autentica uma pessoa (cliente ou administrador) com base no email e senha fornecidos.
     *
     * @param email o email da pessoa.
     * @param senha a senha da pessoa.
     * @return a pessoa autenticada (Cliente ou Administrador), ou null se a autenticação falhar.
     */
    public Pessoa autenticarPessoa(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        for (Administrador administrador : administradores) {
            if (administrador.getEmail().equals(email) && administrador.getSenha().equals(senha)) {
                return administrador;
            }
        }
        return null; // Pessoa não encontrada ou senha incorreta
    }

    /**
     * Remove um cliente da lista de clientes pelo seu ID.
     *
     * @param id o ID do cliente a ser removido.
     */
    public void removerCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
        System.out.println("Cliente removido com sucesso!");
    }
}

