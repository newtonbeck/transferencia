package br.com.unbank.transferencia.modelo;

public interface Contas {

    void abrir(Conta conta);

    Conta buscar(String numero);

}
