
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Complete os testes marcados com //TODO.
 */
public class AssinanteTest {

    private Assinante assinante;

    @BeforeEach
    void setUp() {
        assinante = new Assinante("Ana");
    }

    @Test
    void deveRegistrarAssistidoPorTitulo() {
        //TODO
    }

    @Test
    void naoDeveRegistrarTituloInexistente() {
        //TODO
    }

    @Test
    void deveSomarTempoAssistido() {
        //TODO
    }

    @Test
    void deveCalcularCreditoDeTempo() {
        //TODO
    }

    @Test
    void classificacaoBingeAcimaDe75Porcento() {
        //TODO
    }

    @Test
    void tarifaIsentaAcimaDe600Minutos() {
        //TODO
    }

    @Test
    void tarifaComAcrescimoQuandoBingeSemIsencao() {
        //TODO
    }

    @Test
    void resumoDeveConterNomeEClassificacao() {
        //TODO
    }
}
