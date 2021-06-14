package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setNome("Marco");
        assertEquals("Marco", funcionarioMensalista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setValorMes(140000.0f);
        assertEquals(140000.0f, funcionarioMensalista.calcularSalario());
    }

    @Test
    void deveCalcularSalarioDiarista() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setValorDia(300.0f);
        funcionarioDiarista.setNumDias(25);
        assertEquals(7500.0f, funcionarioDiarista.calcularSalario());
    }

    @Test
    void deveCalcularSalarioHorista() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setValorHora(50.0f);
        funcionarioHorista.setNumDias(25);
        funcionarioHorista.setNumHorasDia(8);
        assertEquals(10000.0f, funcionarioHorista.calcularSalario());
    }
}
