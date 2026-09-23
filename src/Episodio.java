
/**
 * Episódio de série na Xulambs Stream.
 * Classe fornecida (já implementada).
 */
public class Episodio {
    private String titulo;
    private int temporada;
    private int minutos;
    private boolean assistido;

    public Episodio(String titulo, int temporada, int minutos) {
        this.titulo = titulo == null ? "" : titulo;
        this.temporada = temporada < 1 ? 1 : temporada;
        this.minutos = minutos < 0 ? 0 : minutos;
        this.assistido = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean estaAssistido() {
        return assistido;
    }

    public void marcarAssistido() {
        assistido = true;
    }
}
