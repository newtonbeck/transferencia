package br.com.unbank.transferencia.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    public void transferirValorMaiorQueOSaldoDeveRetornarFalso() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(150, contaDoAndre);

        // Verificar a saída
        assertFalse(resultadoDaTransferencia);
    }

    @Test
    public void transferirValorIgualAoSaldoDeveRetornarTrue() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(100, contaDoAndre);

        // Verificar a saída
        assertTrue(resultadoDaTransferencia);
    }

    @Test
    public void transferirValorMenorQueOSaldoDeveRetornarTrue() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(50, contaDoAndre);

        // Verificar a saída
        assertTrue(resultadoDaTransferencia);
    }

    @Test
    public void transferirValorIgualAZeroDeveRetornarTrue() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(0, contaDoAndre);

        // Verificar a saída
        assertTrue(resultadoDaTransferencia);
    }

    @Test
    public void transferirValorMenorQueZeroDeveRetornarFalse() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(-50, contaDoAndre);

        // Verificar a saída
        assertFalse(resultadoDaTransferencia);
    }

    @Test
    public void transferirValorMenorQueSaldoDeveDimiuirOSaldoDaContaQueEstaTransferindo() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(60, contaDoAndre);

        // Verificar a saída
        assertEquals(40, contaDoNewton.getSaldo());
    }

    @Test
    public void transferirValorMenorQueSaldoDeveAumentarOSaldoDaContaQueEstaRecebendo() {
        // Entrada
        Conta contaDoNewton = new Conta();
        Conta contaDoAndre = new Conta();

        // Processamento
        boolean resultadoDaTransferencia = contaDoNewton
                .transferir(60, contaDoAndre);

        // Verificar a saída
        assertEquals(160, contaDoAndre.getSaldo());
    }

}