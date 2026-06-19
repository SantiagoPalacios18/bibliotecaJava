package modelo;

public abstract class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponibilidad;

    public MaterialBiblioteca(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        disponibilidad = true; //Se pone acá y no como static porque con  static si cambia uno cambian todos
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

    public boolean getDisponibilidad () { return disponibilidad; }
    public void setDisponibilidad (boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    public String showDisponibilidad() {
        if (getDisponibilidad()) { //Sabe que es el getDisponibilidad de acá y no de otro lado porque siempre busc ametodos locales
            return "Disponible";
        }else  {
            return "No Disponible";
        }
    }
}