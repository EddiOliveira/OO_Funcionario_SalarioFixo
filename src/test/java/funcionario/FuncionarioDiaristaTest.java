package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setNome("Marco");
        assertEquals("Marco", funcionarioDiarista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setValorDia(800.0f);
        funcionarioDiarista.setNumDias(25);
        funcionarioDiarista.setSalarioFixo(5000.0f);
        assertEquals(25000.0f, funcionarioDiarista.calcularSalario());
    }

}