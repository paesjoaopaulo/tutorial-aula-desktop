package appnov.models;

public class Titulo {

    private int id;
    private String isbn;
    private String titulo;
    private int edicao;
    private double preco;
    private Editora editora;
    private Autor autor;

    public Titulo() {
    }

    public Titulo(int id, String isbn, String titulo, int edicao, double preco, Editora editora, Autor autor) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.edicao = edicao;
        this.preco = preco;
        this.editora = editora;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo{" + "id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", edicao=" + edicao + ", preco=" + preco + ", editora=" + editora + ", autor=" + autor + '}';
    }

}
