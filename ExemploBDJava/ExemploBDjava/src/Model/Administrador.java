package Model;

/**
 * Representa um administrador no sistema de reservas.
 * Um administrador é uma pessoa com permissões adicionais para gerenciar contas e reservas.
 */
public class Administrador extends Pessoa {
    private String matricula;

    /**
     * Construtor da classe Administrador.
     *
     * @param id        o identificador único do administrador.
     * @param nome      o nome do administrador.
     * @param cpf       o CPF do administrador.
     * @param email     o email do administrador.
     * @param senha     a senha do administrador.
     * @param matricula a matrícula do administrador.
     */
    public Administrador(int id, String nome, String cpf, String email, String senha, String matricula) {
        super(id, nome, cpf, email, senha);
        this.matricula = matricula;
    }

    /**
     * Obtém a matrícula do administrador.
     *
     * @return a matrícula do administrador.
     */
    public String getMatricula() {
        return matricula;
    }
}