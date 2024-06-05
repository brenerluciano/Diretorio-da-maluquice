package Model;

/**
 * Representa uma pessoa no sistema de reservas.
 * Esta é uma classe abstrata que serve como base para outras classes específicas, como Cliente e Administrador.
 */
public abstract class Pessoa {
    protected int iD;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;

    /**
     * Construtor da classe Pessoa.
     *
     * @param iD    o identificador único da pessoa.
     * @param nome  o nome da pessoa.
     * @param cpf   o CPF da pessoa.
     * @param email o email da pessoa.
     * @param senha a senha da pessoa.
     */
    public Pessoa(int iD, String nome, String cpf, String email, String senha) {
        this.iD = iD;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    /**
     * Obtém o identificador único da pessoa.
     *
     * @return o identificador da pessoa.
     */
    public int getId() {
        return iD;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return o nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define um novo nome para a pessoa.
     *
     * @param nome o novo nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF da pessoa.
     *
     * @return o CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define um novo CPF para a pessoa.
     *
     * @param cpf o novo CPF da pessoa.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o email da pessoa.
     *
     * @return o email da pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define um novo email para a pessoa.
     *
     * @param email o novo email da pessoa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém a senha da pessoa.
     *
     * @return a senha da pessoa.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define uma nova senha para a pessoa.
     *
     * @param senha a nova senha da pessoa.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna uma representação em string dos dados básicos da pessoa.
     *
     * @return uma string contendo o nome e o identificador da pessoa.
     */
    @Override
    public String toString() {
        return "Nome: " + nome + "\nId: " + iD;
    }
}