
import java.util.ArrayList;
import java.util.List;

/**
 * Assinante que agrega episódios.
 * Complete os métodos marcados com //TODO (Tarefas 1, 2 e 3).
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
        if (titulo == null) {
            return false;
        }
        for (Episodio e : episodios) {
            if (titulo.equals(e.getTitulo()) && !e.estaAssistido()) {
                e.marcarAssistido();
                return true;
            }
        }
        return false;
    }

    public int tempoTotalAssistido() {
        int soma = 0;
        for (Episodio e : episodios) {
            if (e.estaAssistido()) {
                soma += e.getMinutos();
            }
        }
        return soma;
    }

    /**
     * Soma das durações dos episódios ainda não assistidos.
     */
    public int creditoDeTempo() {
        //TODO Tarefa 1
        return 0;
    }

    /**
     * Iniciante / Regular / Engajado / Binge (lista vazia → Iniciante).
     */
    public String classificacaoEngajamento() {
        //TODO Tarefa 2
        return "Iniciante";
    }

    /**
     * Base 29,90; +10% se Binge; 0 se tempo assistido &gt; 600.
     */
    public double tarifaMensal() {
        //TODO Tarefa 3
        return 0.0;
    }

    public String resumo() {
        return nome
                + " | eps=" + quantidadeEpisodios()
                + " | assistido=" + tempoTotalAssistido() + "min"
                + " | credito=" + creditoDeTempo() + "min"
                + " | " + classificacaoEngajamento()
                + " | tarifa=" + String.format("%.2f", tarifaMensal());
    }
}
