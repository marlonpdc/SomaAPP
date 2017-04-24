package soma.cnt.br.somaapp;

/**
 * Created by Marlon Pinheiro on 27/10/2016.
 */

public class Usuario {

    private int id;
    private String nome;
    private String senha;

    public Usuario() {
        // TODO Auto-generated constructor stub
    }

    public Usuario(int id, String nome, String senha) {
        super();
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
