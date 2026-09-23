
import java.util.ArrayList;
import java.util.List;

/**
 * Assinante que agrega episódios.
 * Complete os métodos marcados com //TODO.
 */
public class Assinante {
    public static final double TARIFA_BASE = 29.90;
    public static final int MINUTOS_ISENCAO = 600;

    private String nome;
    private List<Episodio> episodios;

    public Assinante(String nome) {
        this.nome = nome == null ? "" : nome;
        this.episodios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionar(Episodio e) {
        if (e == null) {
            return false;
        }
        episodios.add(e);
        return true;
    }

    public int quantidadeEpisodios() {
        return episodios.size();
    }

    /**
     * Marca como assistido o primeiro episódio com o título que ainda não foi assistido.
     */
    public boolean registrarAssistido(String titulo) {
        //TODO
        return false;
    }

    public int tempoTotalAssistido() {
        //TODO
        return 0;
    }

    public int creditoDeTempo() {
        //TODO
        return 0;
    }

    /**
     * Iniciante / Regular / Engajado / Binge (lista vazia → Iniciante).
     */
    public String classificacaoEngajamento() {
        //TODO
        return "Iniciante";
    }

    /**
     * Base 29,90; +10% se Binge; 0 se tempo assistido &gt; 600.
     */
    public double tarifaMensal() {
        //TODO
        return 0.0;
    }

    public String resumo() {
        //TODO
        return "";
    }
}
