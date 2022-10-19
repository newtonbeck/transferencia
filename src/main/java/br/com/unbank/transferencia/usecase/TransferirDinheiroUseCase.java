package br.com.unbank.transferencia.usecase;

import br.com.unbank.transferencia.modelo.Conta;
import br.com.unbank.transferencia.modelo.Contas;

public class TransferirDinheiroUseCase {

    private Contas contas;

    public TransferirDinheiroUseCase(Contas contas) {
        this.contas = contas;
    }

    public boolean transferir(
            String numeroDaContaUm,
            String numeroDaContaDois,
            double valor) {
        Conta contaUm = contas.buscar(numeroDaContaUm);
        Conta contaDois = contas.buscar(numeroDaContaDois);

        boolean resultadoDaTransferencia = contaUm.transferir(valor, contaDois);

        return resultadoDaTransferencia;
    }

}
