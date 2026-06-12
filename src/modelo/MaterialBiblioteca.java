package modelo;

public abstract class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponibilidad;

    public MaterialBiblioteca(String titulo, String autor, String genero, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}