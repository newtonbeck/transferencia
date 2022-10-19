package br.com.unbank.transferencia.modelo;

public class Conta {

    private double saldo;

    public Conta() {
        this.saldo = 100;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean transferir(double valor, Conta outraConta) {
        boolean valorMaiorQueSaldo = valor > saldo;
        boolean valorNegativo = valor < 0;

        if (valorMaiorQueSaldo || valorNegativo) {
            return false;
        }

        saldo -= valor;
        outraConta.saldo += valor;
        return true;
    }
}
