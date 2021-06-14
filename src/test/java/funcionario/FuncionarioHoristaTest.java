package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNome("Marco");
        assertEquals("Marco", funcionarioHorista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setValorHora(50.0f);
        funcionarioHorista.setNumDias(20);
        funcionarioHorista.setNumHorasDia(10);
        funcionarioHorista.setSalarioFixo(10000.0f);
        assertEquals(20000.0f, funcionarioHorista.calcularSalario());
    }
}