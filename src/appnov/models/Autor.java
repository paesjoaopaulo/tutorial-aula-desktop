package appnov.models;

public class Autor {

    private int id;
    private String nome;
    private String celular;

    public Autor() {
    }

    public Autor(int id, String nome, String celular) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
    }

    public Autor(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", celular=" + celular + '}';
    }

}
